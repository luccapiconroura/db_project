import React, { useState, useEffect } from 'react';
import { DataGrid } from '@mui/x-data-grid';
import api from '../api/api';
import { Button } from '@mui/material';

function Tenants() {
    const [tenants, setTenants] = useState([]);

    useEffect(() => {
        api.get('/tenants')
            .then((response) => {
                setTenants(response.data);
            })
            .catch((error) => console.error('Error fetching tenants:', error));
    }, []);

    const columns = [
        { field: 'tenantId', headerName: 'ID', width: 100 },
        { field: 'firstName', headerName: 'First Name', width: 150 },
        { field: 'lastName', headerName: 'Last Name', width: 150 },
        { field: 'creditScore', headerName: 'Credit Score', width: 150 },
        {
            field: 'actions',
            headerName: 'Actions',
            width: 150,
            renderCell: (params) => (
                <Button
                    variant="contained"
                    color="error"
                    onClick={() => handleDelete(params.row.tenantId)}
                >
                    Delete
                </Button>
            ),
        },
    ];

    const handleDelete = (id) => {
        api.delete(`/tenants/${id}`)
            .then(() => setTenants(tenants.filter((t) => t.tenantId !== id)))
            .catch((error) => console.error('Error deleting tenant:', error));
    };

    return (
        <div style={{ height: 400, width: '100%' }}>
            <h1>Tenants</h1>
            <DataGrid
                rows={tenants.map((t) => ({ ...t, id: t.tenantId }))}
                columns={columns}
                pageSize={5}
                rowsPerPageOptions={[5]}
                disableSelectionOnClick
            />
        </div>
    );
}

export default Tenants;
