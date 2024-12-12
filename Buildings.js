import React, { useState, useEffect } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import api from '../api/api';
import { Button } from '@mui/material';

function Buildings() {
    const [buildings, setBuildings] = useState([]);

    useEffect(() => {
        api.get('/buildings')
            .then((response) => {
                setBuildings(response.data);
            })
            .catch((error) => console.error('Error fetching buildings:', error));
    }, []);

    const handleDelete = (id) => {
        api.delete(`/buildings/${id}`)
            .then(() => setBuildings(buildings.filter((b) => b.bldNumber !== id)))
            .catch((error) => console.error('Error deleting building:', error));
    };

    const columns = [
        { field: 'bldNumber', headerName: 'ID', width: 100 },
        { field: 'nickname', headerName: 'Nickname', width: 150 },
        { field: 'floors', headerName: 'Floors', width: 100 },
        { field: 'value', headerName: 'Value ($)', width: 150 },
        { field: 'constructionYear', headerName: 'Year Built', width: 150 },
        {
            field: 'actions',
            headerName: 'Actions',
            width: 150,
            renderCell: (params) => (
                <Button
                    variant="contained"
                    color="error"
                    onClick={() => handleDelete(params.row.bldNumber)}
                >
                    Delete
                </Button>
            ),
        },
    ];

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Buildings</h1>
            <DataGrid
                rows={buildings.map((b) => ({ ...b, id: b.bldNumber }))}
                columns={columns}
                pageSize={5}
                rowsPerPageOptions={[5]}
                disableSelectionOnClick
            />
        </div>
    );
}

export default Buildings;
