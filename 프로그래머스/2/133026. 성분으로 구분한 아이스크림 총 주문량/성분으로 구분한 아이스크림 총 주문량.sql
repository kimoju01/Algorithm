-- 코드를 입력하세요
SELECT ingredient_type,
    sum(total_order) as total_order
from first_half A
    inner join icecream_info B
    on A.flavor = B.flavor
group by ingredient_type
order by 2 asc;