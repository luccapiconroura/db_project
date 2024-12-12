import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import HomePage from './pages/HomePage';
import Buildings from './pages/Buildings';
import Tenants from './pages/Tenants';
import AddBuilding from './pages/AddBuilding';
import ErrorPage from './pages/ErrorPage';
import Apartments from './pages/Apartments';
import TenantReferences from './pages/TenantReferences';
import Leases from './pages/Leases';
import Inspections from './pages/Inspections';
import FloorPlans from './pages/FloorPlans';

function App() {
    return (
        <Router>
            <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
                <Navbar />
                <div style={{ width: '80%', marginTop: '20px' }}>
                    <Routes>
                        {/* Home Page */}
                        <Route path="/" element={<HomePage />} />

                        {/* Main Functional Pages */}
                        <Route path="/buildings" element={<Buildings />} />
                        <Route path="/tenants" element={<Tenants />} />
                        <Route path="/add-building" element={<AddBuilding />} />
                        <Route path="/apartments" element={<Apartments />} />
                        <Route path="/tenant-references" element={<TenantReferences />} />
                        <Route path="/leases" element={<Leases />} />
                        <Route path="/inspections" element={<Inspections />} />
                        <Route path="/floor-plans" element={<FloorPlans />} />

                        {/* Error Page for Undefined Routes */}
                        <Route path="*" element={<ErrorPage />} />
                    </Routes>
                </div>
            </div>
        </Router>
    );
}

export default App;
