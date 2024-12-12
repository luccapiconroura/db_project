// File: src/pages/ErrorPage.js
import React from 'react';
import { Link } from 'react-router-dom';
import { Typography, Button, Box } from '@mui/material';

function ErrorPage() {
    return (
        <Box sx={{ textAlign: 'center', marginTop: '50px' }}>
            <Typography variant="h2" gutterBottom color="error">
                404 - Page Not Found
            </Typography>
            <Typography variant="subtitle1" gutterBottom>
                Oops! The page you’re looking for doesn’t exist.
            </Typography>
            <Link to="/" style={{ textDecoration: 'none' }}>
                <Button variant="contained" color="primary">
                    Go Back Home
                </Button>
            </Link>
        </Box>
    );
}

export default ErrorPage;
