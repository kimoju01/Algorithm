-- 코드를 입력하세요
SELECT user_id, nickname, sum(price) as total_sales
from used_goods_board A
    inner join used_goods_user B
    on A.writer_id = B.user_id
where status = 'DONE'
group by writer_id
having sum(price) >= 700000
order by sum(price) asc;