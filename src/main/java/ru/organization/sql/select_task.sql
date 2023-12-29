-- 1. Для каждого катера вывести даты выхода в море с указанием улова
-- вариант 1. Предполагается, что выводятся все катера, даже при отсутствии рейсов
select v.name, c.begin_cruise_at, c.end_cruise_at, sum(cc.catch_weight_kilos) catch_weight_kilos_per_cruise  
from vessels v 
left join cruises c on v.id = c.vessel_id
left join cruise_catch cc on c.id = cc.cruise_id
group by v.name, v.built_in, c.begin_cruise_at, c.end_cruise_at
order by v.name, c.begin_cruise_at;
-- вариант 2. Предполагается, что выводятся катера, совершавшие рейсы
select v.name, c.begin_cruise_at, c.end_cruise_at, sum(cc.catch_weight_kilos) catch_weight_kilos_per_cruise  
from vessels v 
left join cruises c on v.id = c.vessel_id
left join cruise_catch cc on c.id = cc.cruise_id
group by v.name, v.built_in, c.begin_cruise_at, c.end_cruise_at
having c.begin_cruise_at is not null
order by v.name, c.begin_cruise_at;

-- 2. Для каждого катера вывести количество рейсов
-- Предполагается, что выводятся все катера, даже при отсутствии рейсов
select v.name, count(c.id) as total_cruises 
from vessels v 
left join cruises c on v.id = c.vessel_id
group by v.id
order by v.name;

-- 3. Вывести список катеров, которые получили улов выше заданного значения
select v.name, sum(cc.catch_weight_kilos) as catch_weight_kilos_total 
from vessels v 
left join cruises c on v.id = c.vessel_id 
left join cruise_catch cc on c.id = cc.cruise_id
group by v.id
having sum(cc.catch_weight_kilos) > 3000;

-- 4. Вывести список сортов рыбы и для каждого сорта список рейсов с указанием даты выхода и возвращения, количества улова
select cc.fish_type, cc.cruise_id, c.begin_cruise_at , c.end_cruise_at, cc.catch_weight_kilos 
from cruise_catch cc 
left join cruises c on cc.cruise_id = c.id	
order by cc.fish_type, cc.cruise_id;
