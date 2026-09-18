# Write your MySQL query statement below
SELECT Name  
FROM Employee
Where id IN(
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(managerId)>=5
)
