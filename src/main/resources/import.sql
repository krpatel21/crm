-- Insert role
INSERT into role (name) VALUE ('ROLE_USER');

-- Insert user
INSERT into user (username, enabled, password, role_id) VALUES ('root', true, 'root', 1);
INSERT into user (username, enabled, password, role_id) VALUES ('ljames', true, 'password', 1);
INSERT into user (username, enabled, password, role_id) VALUES ('kdurant', true, 'password', 1);

INSERT INTO invoice (amount, user_id) VALUES ('2000.63', 2);
INSERT INTO invoice (amount, user_id) VALUES ('2323.9998', 3);