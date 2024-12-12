import React, { useEffect, useState } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import { fetchApartments } from '../api/api';

function Apartments() {
    const [apartments, setApartments] = useState([]);

    useEffect(() => {
        fetchApartments()
            .then((response) => {
                // Add unique `id` and parse specialFeatures if it's a JSON string
                const apartmentsWithId = response.data.map((apartment, index) => ({
                    ...apartment,
                    id: `${apartment.bldNumber}-${apartment.aptLetter}-${index}`, // Example: "1-A-0"
                    specialFeatures: Array.isArray(apartment.specialFeatures)
                        ? apartment.specialFeatures.join(', ') // Convert array to comma-separated string
                        : apartment.specialFeatures, // Use directly if it's already a string
                }));
                setApartments(apartmentsWithId);
            })
            .catch((error) => console.error('Error fetching apartments:', error));
    }, []);

    const columns = [
        { field: 'bldNumber', headerName: 'Building Number', width: 150 },
        { field: 'aptLetter', headerName: 'Apartment Letter', width: 150 },
        { field: 'bedrooms', headerName: 'Bedrooms', width: 150 },
        { field: 'directionFacing', headerName: 'Direction Facing', width: 150 },
        { field: 'floorNumber', headerName: 'Floor Number', width: 150 },
        { field: 'specialFeatures', headerName: 'Special Features', width: 300 }, // Added specialFeatures column
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Apartments</h1>
            <DataGrid rows={apartments} columns={columns} pageSize={5} />
        </div>
    );
}

export default Apartments;
