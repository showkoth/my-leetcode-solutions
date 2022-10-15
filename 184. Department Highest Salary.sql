select d.name as 'Department', e.name as 'Employee', e.salary as 'Salary'
from Employee e
left join Department d on e.departmentId = d.id
group by e.departmentId
order by salary desc