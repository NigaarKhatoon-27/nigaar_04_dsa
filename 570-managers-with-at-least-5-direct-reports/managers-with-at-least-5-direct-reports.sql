# Write your MySQL query statement below
SELECT
e1.name
FROM
Employee e1
JOIN (
    SELECT
    managerId
    FROM
    Employee
    GROUP BY
    managerId
    HAVING
    COUNT(managerId) >=5
) AS managerswithmanyreports
ON
e1.id = managerswithmanyreports.managerId;

