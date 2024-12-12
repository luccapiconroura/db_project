SELECT First_Name, Last_Name, Credit_Score
FROM Tenant
WHERE Credit_Score > 700;

SELECT Bld_Number, COUNT(*) AS Total_Apartments
FROM Apartment
GROUP BY Bld_Number;

SELECT i.*
FROM Inspection i
JOIN Building b ON i.Bld_Number = b.Bld_Number
WHERE b.Nickname = 'Pine Tower';

-- Testing to make sure the queries work.
USE apt_complex_db;
