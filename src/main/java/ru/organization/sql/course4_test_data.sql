INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(1, 'SECOND_ENGINEER', NULL, 'Тихон', 'Рогов', 'Николаевич');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(2, 'SECOND_OFFICER', NULL, 'Аркадий', 'Гордеев', 'Ярославович');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(3, 'THIRD_ENGINEER', NULL, 'Наум', 'Григорьев', 'Леонидович');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(4, 'THIRD_OFFICER', NULL, 'Исак', 'Ершов', 'Валерьевич');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(5, 'FOURTH_ENGINEER', NULL, 'Исак', 'Степанов', 'Митрофанович');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(6, 'BOATSWAIN', NULL, 'Альфред', 'Соколов', 'Пётрович');
INSERT INTO public.crew
(personnel_number, "position", address, first_name, second_name, surname)
VALUES(7, 'THIRD_OFFICER', NULL, 'Аркадий', 'Гордеев', 'Ярославович');

INSERT INTO public.vessels
(built_in, displacement_kilos, "type", "name", id)
VALUES('2019-04-05', 5400, 'Коммерческое промысловое судно', 'Jennifer', 1);
INSERT INTO public.vessels
(built_in, displacement_kilos, "type", "name", id)
VALUES('2013-06-10', 4000, 'Коммерческое промысловое судно', 'Волжанин', 2);

INSERT INTO public.cruises
(begin_cruise_at, end_cruise_at, id, vessel_id)
VALUES('2023-09-11 10:15:00.000', '2023-09-11 22:30:00.000', 1, 1);
INSERT INTO public.cruises
(begin_cruise_at, end_cruise_at, id, vessel_id)
VALUES('2023-09-12 10:15:00.000', '2023-09-12 22:30:00.000', 2, 1);

INSERT INTO public.bankas
(cruise_id, end_banka_visit, start_banka_visit, fish_quality, banka_name)
VALUES(1, '2023-09-11 14:45:00.000', '2023-09-11 12:15:00.000', 'EXELENT', 'Кильдинская банка');
INSERT INTO public.bankas
(cruise_id, end_banka_visit, start_banka_visit, fish_quality, banka_name)
VALUES(1, '2023-09-11 16:45:00.000', '2023-09-11 15:45:00.000', 'GOOD', 'Белокаменка');
INSERT INTO public.bankas
(cruise_id, end_banka_visit, start_banka_visit, fish_quality, banka_name)
VALUES(1, '2023-09-11 19:45:00.000', '2023-09-11 18:45:00.000', 'EXELENT', 'Кильдинская банка');
INSERT INTO public.bankas
(cruise_id, end_banka_visit, start_banka_visit, fish_quality, banka_name)
VALUES(2, '2023-09-12 13:00:00.000 +0300', '2023-09-12 11:30:00.000 +0300', 'GOOD', 'Белокаменка');

INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(700, 1, 'сельдь');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(500, 1, 'морской окунь');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(350, 1, 'треска');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(500, 1, 'палтус');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(150, 1, 'камбала');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(347, 2, 'треска');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(234, 2, 'палтус');
INSERT INTO public.cruise_catch
(catch_weight_kilos, cruise_id, fish_type)
VALUES(650, 2, 'сельдь');


INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(1, 1);
INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(2, 1);
INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(3, 1);
INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(4, 1);
INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(1, 2);
INSERT INTO public.cruise_crew
(crew_member_personnel_number, cruise_id)
VALUES(2, 2);
