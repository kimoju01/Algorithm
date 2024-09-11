-- 코드를 입력하세요
SELECT animal_type,
    if(name is null, "No name", name) as name,
    sex_upon_intake
FROM animal_ins
ORDER BY animal_id;