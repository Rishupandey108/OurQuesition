# Write your MySQL query statement below
select id from weather w where temperature > (select temperature from weather p where p.recordDate = DATE_SUB(w.recordDate,INTERVAL 1 DAY));