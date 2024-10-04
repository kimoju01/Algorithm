-- 코드를 작성해주세요
select count(id) as fish_count
from fish_info A
    inner join fish_name_info B
    on A.fish_type = B.fish_type
# where fish_name in ('BASS', 'SNAPPER')
where fish_name = 'BASS' or fish_name = 'SNAPPER'