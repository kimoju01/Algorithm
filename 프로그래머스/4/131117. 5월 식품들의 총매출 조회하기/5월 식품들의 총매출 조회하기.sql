-- 코드를 입력하세요
select A.product_id,
    product_name,
    sum(amount*price) as total_sales
from food_product A
    inner join food_order B
    on A.product_id = B.product_id
where produce_date like '2022-05%'
group by A.product_id
order by sum(amount*price) desc, product_id asc;