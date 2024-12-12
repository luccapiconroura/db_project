USE apt_complex_db;

INSERT INTO Building (Bld_Number, Value, Floors, Nickname, Construction_Year)
VALUES
(1, 5200000, 6, 'Emerald Towers', 2003),
(2, 7800000, 12, 'Sunrise Heights', 2005),
(3, 3100000, 4, 'Cedar Park', 2011),
(4, 9500000, 14, 'Lakeview Apartments', 2016),
(5, 4700000, 8, 'Horizon Ridge', 2009);

INSERT INTO Apartment (Bld_Number, Apt_Letter, Bedrooms, Direction_Facing, Floor_Number, Special_Features)
VALUES
(1, 'A', 2, 'West', 1, '["Private Balcony", "Garden Access"]'),
(1, 'B', 3, 'East', 2, '["Fireplace", "Modern Kitchen"]'),
(1, 'C', 1, 'North', 3, '["Hardwood Floors"]'),
(1, 'D', 2, 'South', 4, '["Large Windows", "Skylight"]'),
(1, 'E', 3, 'West', 5, '["Jacuzzi", "Upgraded Appliances"]'),
(2, 'A', 1, 'North', 3, '["Hardwood Floors"]'),
(2, 'B', 2, 'South', 4, '["Large Windows", "Skylight"]'),
(2, 'C', 3, 'West', 5, '["Modern Appliances"]'),
(2, 'D', 4, 'East', 6, '["Terrace", "Skylight"]'),
(2, 'E', 5, 'North', 7, '["Penthouse View"]'),
(3, 'A', 1, 'East', 2, '["Private Balcony"]'),
(3, 'B', 2, 'West', 3, '["Garden Access"]'),
(3, 'C', 3, 'South', 4, '["Terrace"]'),
(3, 'D', 4, 'North', 5, '["Skylight"]'),
(3, 'E', 5, 'East', 6, '["Jacuzzi"]'),
(4, 'A', 2, 'West', 1, '["Large Windows"]'),
(4, 'B', 3, 'East', 2, '["Private Terrace"]'),
(4, 'C', 4, 'South', 3, '["Upgraded Kitchen"]'),
(4, 'D', 5, 'North', 4, '["Hardwood Floors"]'),
(4, 'E', 6, 'East', 5, '["Skylight"]'),
(5, 'A', 1, 'North', 2, '["Garden Access"]'),
(5, 'B', 2, 'South', 3, '["Modern Kitchen"]'),
(5, 'C', 3, 'East', 4, '["Terrace"]'),
(5, 'D', 4, 'West', 5, '["Jacuzzi"]'),
(5, 'E', 5, 'South', 6, '["Penthouse View"]');


INSERT INTO Floor_Plan (Letter, Bedrooms, Bathrooms, Square_Feet, Base_Price)
VALUES
('A', 1, 1, 850, 1600.00),
('B', 2, 2, 1250, 2600.00),
('C', 3, 3, 1600, 3600.00),
('D', 4, 4, 1850, 4600.00),
('E', 2, 1, 1100, 2100.00);

INSERT INTO Tenant (Bld_Number, Apt_Number, Credit_Score, First_Name, Middle_Initial, Last_Name)
VALUES
(1, 'A', 720, 'Michael', 'J', 'Smith'),
(1, 'B', 680, 'Sara', NULL, 'Johnson'),
(1, 'C', 710, 'David', 'L', 'Williams'),
(1, 'D', 750, 'Emily', NULL, 'Brown'),
(1, 'E', 670, 'Laura', 'K', 'Davis'),
(2, 'A', 790, 'James', 'M', 'Wilson'),
(2, 'B', 800, 'Olivia', NULL, 'Martinez'),
(2, 'C', 760, 'Sophia', 'R', 'Anderson'),
(2, 'D', 720, 'Ethan', 'L', 'Green'),
(2, 'E', 740, 'Emma', 'T', 'Moore'),
(3, 'A', 690, 'Ava', NULL, 'Taylor'),
(3, 'B', 810, 'Liam', 'P', 'White'),
(3, 'C', 710, 'Mia', 'R', 'Harris'),
(3, 'D', 800, 'Noah', NULL, 'Walker'),
(3, 'E', 780, 'Charlotte', 'J', 'Hall'),
(4, 'A', 770, 'Mason', 'L', 'Clark'),
(4, 'B', 750, 'Ella', NULL, 'Evans'),
(4, 'C', 730, 'Lucas', 'K', 'Martinez'),
(4, 'D', 820, 'Avery', 'M', 'Hughes'),
(4, 'E', 700, 'Harper', NULL, 'Scott'),
(5, 'A', 730, 'Jack', 'T', 'Phillips'),
(5, 'B', 770, 'Amelia', 'R', 'Perry'),
(5, 'C', 760, 'Grayson', NULL, 'Cooper'),
(5, 'D', 810, 'Aria', 'J', 'Reed'),
(5, 'E', 780, 'Logan', NULL, 'Foster');


INSERT INTO Tenant_References (Tenant_ID, Reference_Name)
VALUES
(1, 'Alice Taylor'),
(2, 'Robert Garcia'),
(3, 'Charlotte King'),
(4, 'Ethan Moore'),
(5, 'Isabella Wright'),
(6, 'Liam Young'),
(7, 'Mia Clark'),
(8, 'Noah Hill'),
(9, 'Sophia Carter'),
(10, 'Oliver Harris'),
(11, 'Emily Walker'),
(12, 'Grace Evans'),
(13, 'Samuel Lewis'),
(14, 'Chloe Brooks'),
(15, 'Ella Robinson'),
(16, 'Daniel James'),
(17, 'Olivia Reed'),
(18, 'Benjamin Gray'),
(19, 'Emma Turner'),
(20, 'Jack Scott'),
(21, 'Aria Brooks'),
(22, 'Liam Hughes'),
(23, 'Avery Allen'),
(24, 'Harper Knight'),
(25, 'Amelia Ford');

INSERT INTO Inspection (ID_Number, Date, Comment, Bld_Number, Result, Inspector_First_Name, Inspector_Last_Name)
VALUES
(1, '2024-07-15', 'Routine check', 1, 'Pass', 'Alex', 'Morgan'),
(2, '2024-08-20', 'Minor repairs needed', 2, 'Fail', 'Chris', 'Taylor'),
(3, '2024-09-10', 'Good condition', 3, 'Pass', 'Jordan', 'Parker'),
(4, '2024-10-05', 'Excellent condition', 4, 'Pass', 'Sam', 'Lee'),
(5, '2024-11-01', 'Structural issues found', 5, 'Fail', 'Jamie', 'Patel');

INSERT INTO Lease (Tenant_ID, Bld_Number, Apt_Number, Start_Date, End_Date, Monthly_Rent)
VALUES
(1, 1, 'A', '2024-01-01', '2025-01-01', 1500.00),
(2, 1, 'B', '2024-02-01', '2025-02-01', 1600.00),
(3, 2, 'A', '2024-03-01', '2025-03-01', 1700.00),
(4, 2, 'B', '2024-04-01', '2025-04-01', 1800.00),
(5, 3, 'A', '2024-05-01', '2025-05-01', 1900.00),
(6, 3, 'B', '2024-06-01', '2025-06-01', 2000.00),
(7, 4, 'A', '2024-07-01', '2025-07-01', 2100.00),
(8, 4, 'B', '2024-08-01', '2025-08-01', 2200.00),
(9, 1, 'C', '2024-09-01', '2025-09-01', 2300.00),
(10, 2, 'C', '2024-10-01', '2025-10-01', 2400.00),
(11, 3, 'C', '2024-11-01', '2025-11-01', 2500.00),
(12, 4, 'C', '2024-12-01', '2025-12-01', 2600.00),
(13, 5, 'A', '2024-01-15', '2025-01-15', 2700.00),
(14, 5, 'B', '2024-02-15', '2025-02-15', 2800.00),
(15, 1, 'D', '2024-03-15', '2025-03-15', 2900.00),
(16, 2, 'D', '2024-04-15', '2025-04-15', 3000.00),
(17, 3, 'D', '2024-05-15', '2025-05-15', 3100.00),
(18, 4, 'D', '2024-06-15', '2025-06-15', 3200.00),
(19, 5, 'C', '2024-07-15', '2025-07-15', 3300.00),
(20, 5, 'D', '2024-08-15', '2025-08-15', 3400.00),
(21, 1, 'E', '2024-09-15', '2025-09-15', 3500.00),
(22, 2, 'E', '2024-10-15', '2025-10-15', 3600.00),
(23, 3, 'E', '2024-11-15', '2025-11-15', 3700.00),
(24, 4, 'E', '2024-12-15', '2025-12-15', 3800.00),
(25, 5, 'E', '2025-01-15', '2026-01-15', 3900.00);

-- Testing if the databases work as desired.
SELECT * FROM Tenant_References;
SELECT COUNT(*) AS TotalTenants FROM Tenant; -- Should return 25
