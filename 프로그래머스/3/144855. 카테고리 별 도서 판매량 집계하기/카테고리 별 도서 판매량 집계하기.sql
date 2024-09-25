-- 코드를 입력하세요
SELECT category,
    sum(sales) as total_sales
from book A
    inner join book_sales B
    on A.book_id = B.book_id
where sales_date like '2022-01%'
group by category
order by category asc;