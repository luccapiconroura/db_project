import React, { useEffect, useState } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import { fetchFloorPlans } from '../api/api';

function FloorPlans() {
    const [floorPlans, setFloorPlans] = useState([]);

    useEffect(() => {
        fetchFloorPlans()
            .then((response) => {
                // Add unique `id` to each row
                const floorPlansWithId = response.data.map((floorPlan, index) => ({
                    ...floorPlan,
                    id: `${floorPlan.letter}-${index}`, // Example: "A-0"
                }));
                setFloorPlans(floorPlansWithId);
            })
            .catch((error) => console.error('Error fetching floor plans:', error));
    }, []);

    const columns = [
        { field: 'letter', headerName: 'Letter', width: 150 },
        { field: 'bedrooms', headerName: 'Bedrooms', width: 150 },
        { field: 'bathrooms', headerName: 'Bathrooms', width: 150 },
        { field: 'squareFeet', headerName: 'Square Feet', width: 150 },
        { field: 'basePrice', headerName: 'Base Price', width: 150 },
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Floor Plans</h1>
            <DataGrid rows={floorPlans} columns={columns} pageSize={5} />
        </div>
    );
}

export default FloorPlans;
