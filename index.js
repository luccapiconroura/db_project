import React from 'react';
import ReactDOM from 'react-dom/client';
import './styles/global.css'; // Import global styles first
import App from './App';
import reportWebVitals from './reportWebVitals';

// Initialize React app
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <App />
    </React.StrictMode>
);

// Measure performance
reportWebVitals();
