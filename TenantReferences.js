import React, { useEffect, useState } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import { fetchTenantReferences } from '../api/api';

function TenantReferences() {
    const [tenantReferences, setTenantReferences] = useState([]);

    useEffect(() => {
        fetchTenantReferences()
            .then((response) => {
                // Create a stable unique ID using both tenantId and referenceName
                const referencesWithId = response.data.map((reference) => ({
                    ...reference,
                    id: `${reference.tenantId}-${reference.referenceName}`,
                }));
                setTenantReferences(referencesWithId);
            })
            .catch((error) => console.error('Error fetching tenant references:', error));
    }, []);

    const columns = [
        { field: 'tenantId', headerName: 'Tenant ID', width: 150 },
        { field: 'referenceName', headerName: 'Reference Name', width: 300 },
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Tenant References</h1>
            <DataGrid rows={tenantReferences} columns={columns} pageSize={5} />
        </div>
    );
}

export default TenantReferences;
