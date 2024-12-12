// File: src/pages/HomePage.js
import React from 'react';
import { Link } from 'react-router-dom';
import { Button, Typography, Box } from '@mui/material';

function HomePage() {
    return (
        <Box sx={{ textAlign: 'center', marginTop: '50px' }}>
            <Typography variant="h2" gutterBottom>
                Apartment Complex Database Manager
            </Typography>
            <Typography variant="subtitle1" gutterBottom>
                Manage buildings, tenants, and leases with ease.
            </Typography>
            <Box sx={{ display: 'flex', justifyContent: 'center', gap: '20px', marginTop: '20px' }}>
                <Link to="/buildings" style={{ textDecoration: 'none' }}>
                    <Button variant="contained" color="primary">
                        View Buildings
                    </Button>
                </Link>
                <Link to="/tenants" style={{ textDecoration: 'none' }}>
                    <Button variant="contained" color="secondary">
                        View Tenants
                    </Button>
                </Link>
                <Link to="/add-building" style={{ textDecoration: 'none' }}>
                    <Button variant="contained" color="success">
                        Add a Building
                    </Button>
                </Link>
            </Box>
        </Box>
    );
}

export default HomePage;
