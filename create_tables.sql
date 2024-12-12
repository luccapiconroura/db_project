-- Table: Building
CREATE TABLE Building (
	Bld_Number INT PRIMARY KEY,
    Value DECIMAL(15, 2),
    Floors INT,
    Nickname VARCHAR(50),
    Construction_Year YEAR
);

-- Table: Apartment (Weak Entity)
CREATE TABLE Apartment (
    Bld_Number INT,
    Apt_Letter CHAR(1),
    Bedrooms INT,
    Direction_Facing VARCHAR(20),
    Price DECIMAL(15, 2), -- Assuming it's derived later in your app logic
    Floor_Number INT,
    Special_Features JSON, -- To handle multivalued attribute
    PRIMARY KEY (Bld_Number, Apt_Letter),
    FOREIGN KEY (Bld_Number) REFERENCES Building(Bld_Number)
);

-- Table: Floor_Plan
CREATE TABLE Floor_Plan (
    Letter CHAR(1),
    Bedrooms INT,
    Bathrooms INT,
    Square_Feet INT,
    Base_Price DECIMAL(15, 2),
    PRIMARY KEY (Letter, Bedrooms)
);

-- Table: Tenant
CREATE TABLE Tenant (
    Tenant_ID INT AUTO_INCREMENT PRIMARY KEY,
    Bld_Number INT,
    Apt_Number CHAR(1),
    Credit_Score INT,
    First_Name VARCHAR(50),
    Middle_Initial CHAR(1),
    Last_Name VARCHAR(50),
    FOREIGN KEY (Bld_Number, Apt_Number) REFERENCES Apartment(Bld_Number, Apt_Letter)
);

-- Table: Tenant_References (Multivalued Attribute)
CREATE TABLE Tenant_References (
    Tenant_ID INT,
    Reference_Name VARCHAR(100),
    PRIMARY KEY (Tenant_ID, Reference_Name),
    FOREIGN KEY (Tenant_ID) REFERENCES Tenant(Tenant_ID)
);

-- Table: Lease
CREATE TABLE Lease (
    Lease_ID INT AUTO_INCREMENT PRIMARY KEY,
    Tenant_ID INT,
    Bld_Number INT,
    Apt_Number CHAR(1),
    Start_Date DATE,
    End_Date DATE,
    Monthly_Rent DECIMAL(15, 2),
    FOREIGN KEY (Tenant_ID) REFERENCES Tenant(Tenant_ID),
    FOREIGN KEY (Bld_Number, Apt_Number) REFERENCES Apartment(Bld_Number, Apt_Letter)
);

-- Table: Inspection
CREATE TABLE Inspection (
    ID_Number INT PRIMARY KEY,
    Date DATE,
    Comment TEXT,
    Bld_Number INT,
    Result VARCHAR(20),
    Inspector_First_Name VARCHAR(50),
    Inspector_Last_Name VARCHAR(50),
    FOREIGN KEY (Bld_Number) REFERENCES Building(Bld_Number)
);

-- Testing to make sure the tables are created successfully.
USE apt_complex_db;
SHOW TABLES;