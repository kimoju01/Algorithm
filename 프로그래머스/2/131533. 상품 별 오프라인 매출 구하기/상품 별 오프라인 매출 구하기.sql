-- 코드를 입력하세요
SELECT product_code,
    sum(sales_amount * price) as sales
from product A
    inner join offline_sale B
    on A.product_id = B.product_id
group by product_code
order by sum(sales_amount * price) desc, product_code asc;