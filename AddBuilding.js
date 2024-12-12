import React, { useState } from 'react';
import { TextField, Button, Box } from '@mui/material';
import api from '../api/api';

function AddBuilding() {
    const [nickname, setNickname] = useState('');
    const [floors, setFloors] = useState(0);
    const [value, setValue] = useState(0);
    const [year, setYear] = useState(0);

    const handleSubmit = (e) => {
        e.preventDefault();
        api.post('/buildings', { nickname, floors, value, constructionYear: year })
            .then(() => alert('Building added!'))
            .catch((error) => console.error('Error adding building:', error));
    };

    return (
        <Box
            component="form"
            onSubmit={handleSubmit}
            sx={{ display: 'flex', flexDirection: 'column', gap: 2, width: '400px', margin: 'auto' }}
        >
            <TextField
                label="Nickname"
                value={nickname}
                onChange={(e) => setNickname(e.target.value)}
                required
            />
            <TextField
                label="Floors"
                type="number"
                value={floors}
                onChange={(e) => setFloors(Number(e.target.value))}
                required
            />
            <TextField
                label="Value ($)"
                type="number"
                value={value}
                onChange={(e) => setValue(Number(e.target.value))}
                required
            />
            <TextField
                label="Year Built"
                type="number"
                value={year}
                onChange={(e) => setYear(Number(e.target.value))}
                required
            />
            <Button variant="contained" type="submit">
                Add Building
            </Button>
        </Box>
    );
}

export default AddBuilding;
