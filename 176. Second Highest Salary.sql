select distinct salary
from Employee
where salary in (select salary from Employee group by salary having count(*) > 2)