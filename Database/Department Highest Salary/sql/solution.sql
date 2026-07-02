# Write your MySQL query statement below
SELECT departmentId, MAX(salary)
FROM Employee
GROUP BY departmentId;