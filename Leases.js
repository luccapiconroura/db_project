import React, { useEffect, useState } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import { fetchLeases } from '../api/api';

function Leases() {
    const [leases, setLeases] = useState([]);

    useEffect(() => {
        fetchLeases()
            .then((response) => {
                // Add unique `id` to each row
                const leasesWithId = response.data.map((lease) => ({
                    ...lease,
                    id: lease.leaseId, // Use leaseId as the unique identifier
                }));
                setLeases(leasesWithId);
            })
            .catch((error) => console.error('Error fetching leases:', error));
    }, []);

    const columns = [
        { field: 'tenantId', headerName: 'Tenant ID', width: 150 },
        { field: 'bldNumber', headerName: 'Building Number', width: 150 },
        { field: 'aptLetter', headerName: 'Apartment Letter', width: 150 },
        { field: 'startDate', headerName: 'Start Date', width: 150 },
        { field: 'endDate', headerName: 'End Date', width: 150 },
        { field: 'monthlyRent', headerName: 'Monthly Rent', width: 150 },
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Leases</h1>
            <DataGrid rows={leases} columns={columns} pageSize={5} />
        </div>
    );
}

export default Leases;
