CREATE TABLE Employee
(Emp_Id INT  IDENTITY(001,1) Primary Key,
FirstName VARCHAR(25) NOT NULL,
LastName VARCHAR(20),
Qualification VARCHAR(20) DEFAULT 'B.tech',
Salary INT,
DOB DATE,
Gender VARCHAR(20));

SELECT * FROM Employee;

INSERT INTO Employee (FirstName, LastName, Salary, DOB, Gender) VALUES ('Rana', 'Akshat', 15000, '12-27-2001', 'Male'),
('Rana', 'Akshat', 15000, '12-27-2001', 'Male'),
('Biplav', 'Kumar', 15000, '02-14-2001', 'Male'),
('Ishika', 'Srivastava', 15000, '09-24-2000', 'Female'),
('Tanuja', 'Sharma', 18000, '06-15-2000', 'Female'),
('Rishu', 'Kumar', 18000, '08-20-2000', 'Male'),
('Jim', '', 90000, '07-24-1991', 'Female'),
('Michael', '', 45000, '04-11-1974', 'Male'),
('Johnny', '', 85000, '10-21-1968', 'Male'),
('David','', 65000, '03-06-1972', 'Male')


--3. Display all employees ordered by salary in asc order.

SELECT * FROM Employee
ORDER BY Salary;

--4. Display all employees ordered by their gender and then name.

SELECT * FROM Employee
ORDER BY Gender, FirstName;

--5. Display first 5 employees in the table.

SELECT TOP 5 * FROM Employee;

--6. Display first and last names of all employees.

SELECT FirstName, LastName FROM Employee;

--7. Display all male employees.

SELECT * FROM Employee
WHERE Gender = 'Male';

--8. Find all employee's id's and names who were born after 1969.

SELECT Emp_Id, FirstName FROM Employee
WHERE DOB > '1969';

--9. Display all employees who are female & (born after 1969 or whose Salary greater than 80000).

SELECT * FROM Employee
WHERE Gender = 'Female'
AND DOB > '1969';

--10. Display all employees born between 1970 and 1975.

SELECT * FROM Employee
WHERE DOB BETWEEN '1970' AND '1975';

--11. Display all employees named Jim, Michael, Johnny or David.

SELECT * FROM Employee
WHERE FirstName IN ('Jim', 'Michael', 'Johnny');

--12. Display the number of employees working.

SELECT COUNT(*) FROM Employee;

--13. Display the average of all employee's salaries.

SELECT AVG(Salary) FROM Employee;

--14. Find the sum of all employee's salaries.

SELECT SUM(Salary) FROM Employee;

--15. Find out how many males and females there are.

(SELECT COUNT(Gender) FROM Employee
WHERE Gender = 'Male')
(SELECT COUNT(Gender) FROM Employee
WHERE Gender = 'Female');

