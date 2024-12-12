import React, { useEffect, useState } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import { fetchInspections } from '../api/api';

function Inspections() {
    const [inspections, setInspections] = useState([]);

    useEffect(() => {
        fetchInspections()
            .then((response) => {
                // The backend now returns fields matching our entity.
                // The building field is an object { bldNumber: ... }, but we need a top-level bldNumber.
                const inspectionsWithId = response.data.map((inspection) => ({
                    ...inspection,
                    // Use the actual primary key from the server as the unique `id`
                    id: inspection.idNumber,
                    // Extract the building number from the nested building object
                    bldNumber: inspection.building ? inspection.building.bldNumber : null
                }));
                setInspections(inspectionsWithId);
            })
            .catch((error) => console.error('Error fetching inspections:', error));
    }, []);

    const columns = [
        { field: 'idNumber', headerName: 'ID Number', width: 150 },
        { field: 'date', headerName: 'Date', width: 150 },
        { field: 'comment', headerName: 'Comment', width: 300 },
        { field: 'bldNumber', headerName: 'Building Number', width: 150 },
        { field: 'result', headerName: 'Result', width: 150 },
        { field: 'inspectorFirstName', headerName: 'Inspector First Name', width: 200 },
        { field: 'inspectorLastName', headerName: 'Inspector Last Name', width: 200 },
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Inspections</h1>
            <DataGrid rows={inspections} columns={columns} pageSize={5} />
        </div>
    );
}

export default Inspections;
