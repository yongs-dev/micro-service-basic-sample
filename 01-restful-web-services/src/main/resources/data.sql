INSERT INTO USER_DETAILS(id, name, birth_date) values (10001, 'Ethan', current_date());
INSERT INTO USER_DETAILS(id, name, birth_date) values (10002, 'Eve', current_date());
INSERT INTO USER_DETAILS(id, name, birth_date) values (10003, 'Adam', current_date());

INSERT INTO POST(id, description, user_id) values (20001, 'Micro Services', 10001);
INSERT INTO POST(id, description, user_id) values (20002, 'Spring Cloud', 10001);
INSERT INTO POST(id, description, user_id) values (20003, 'AWS Certified', 10002);
INSERT INTO POST(id, description, user_id) values (20004, 'Multi Cloud', 10002);