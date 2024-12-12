// File: src/components/Navbar.js
import React from 'react';
import { NavLink } from 'react-router-dom';

function Navbar() {
    return (
        <nav style={navStyle}>
            <NavLink to="/" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Home
            </NavLink>
            <NavLink to="/buildings" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Buildings
            </NavLink>
            <NavLink to="/tenants" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Tenants
            </NavLink>
            <NavLink to="/add-building" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Add Building
            </NavLink>
            <NavLink to="/apartments" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Apartments
            </NavLink>
            <NavLink to="/tenant-references" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Tenant References
            </NavLink>
            <NavLink to="/leases" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Leases
            </NavLink>
            <NavLink to="/inspections" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Inspections
            </NavLink>
            <NavLink to="/floor-plans" style={navLinkStyle} activeStyle={activeNavLinkStyle}>
                Floor Plans
            </NavLink>
        </nav>
    );
}

const navStyle = {
    backgroundColor: '#1976d2',
    padding: '10px',
    width: '100%',
    display: 'flex',
    justifyContent: 'center',
};

const navLinkStyle = {
    color: 'white',
    textDecoration: 'none',
    margin: '0 15px',
    fontWeight: 'bold',
    fontSize: '16px',
};

const activeNavLinkStyle = {
    borderBottom: '2px solid white',
};

export default Navbar;
