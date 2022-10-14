select id 
from Weather w
where temperature >
    (select temperature from Weather where DATE_ADD(recordDate, INTERVAL 1 DAY) = w.recordDate )