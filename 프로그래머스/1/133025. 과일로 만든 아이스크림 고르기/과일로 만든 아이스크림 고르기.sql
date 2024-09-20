-- 코드를 입력하세요
SELECT F.flavor
from first_half F
    inner join icecream_info I
    on F.flavor = I.flavor
where ingredient_type = 'fruit_based' and total_order > 3000
order by total_order desc;