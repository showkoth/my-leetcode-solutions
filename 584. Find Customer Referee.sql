select name
from Customer
where referee_id is null or not referee_id = 2;