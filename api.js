import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080',
});

export const fetchApartments = () => api.get('/apartments');
export const fetchTenantReferences = () => api.get('/tenant-references');
export const fetchLeases = () => api.get('/leases');
export const fetchInspections = () => api.get('/inspections');
export const fetchFloorPlans = () => api.get('/floor-plans');

export default api;
