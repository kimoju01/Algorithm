-- 코드를 입력하세요
SELECT A.rest_id,
    rest_name,
    food_type,
    favorites,
    address,
    round(avg(B.review_score), 2) as score
from rest_info A
    inner join rest_review B
    on A.rest_id = B.rest_id
where address like '서울%'
group by A.rest_id  /* 집계 함수 쓰려면 group by 필요 */
order by avg(B.review_score) desc, favorites desc;