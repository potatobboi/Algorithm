SELECT hour(datetime) hour, count(datetime) count
from animal_outs
group by 1
having hour >= 9 and hour <= 19
order by 1;