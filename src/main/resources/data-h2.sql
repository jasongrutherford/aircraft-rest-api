insert into airline
(airline_id, airline_name)
values
(1, 'British Airways');

insert into airline
(airline_id, airline_name)
values
(2, 'KLM');

insert into airline
(airline_id, airline_name)
values
(3, 'Cathay Pacific');

insert into airline
(airline_id, airline_name)
values
(4, 'Emirates');

insert into aircraft_manufacturer
(aircraft_manuf_id, aircraft_manuf_name)
values
(1, 'Boeing');

insert into aircraft_manufacturer
(aircraft_manuf_id, aircraft_manuf_name)
values
(2, 'Airbus');

insert into aircraft_manufacturer
(aircraft_manuf_id, aircraft_manuf_name)
values
(3, 'Bombardier');

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(1, '787', 1);

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(2, '777', 1);

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(3, 'A380', 2);

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(4, 'A320', 2);

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(5, 'CRJ700', 3);

insert into aircraft_type
(aircraft_type_id, aircraft_type_name, aircraft_manuf_id)
values
(6, 'CRJ200', 3);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(1, 'BA000001', 1, 1);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(2, 'BA000002', 2, 1);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(3, 'BA000003', 1, 1);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(4, 'KL000001', 4, 2);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(5, 'KL000002', 5, 2);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(6, 'KL000003', 5, 2);


insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(7, 'CA000001', 3, 3);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(8, 'CA000002', 3, 3);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(9, 'CA000003', 4, 3);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(10, 'EM000001', 3, 4);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(11, 'EM000002', 4, 4);

insert into aircraft
(aircraft_id, reg_no, aircraft_type_id, airline_id)
values
(12, 'EM000003', 4, 4);
