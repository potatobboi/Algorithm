SELECT left(product_code, 2) category, count(*) product
from product
group by 1
order by 1;