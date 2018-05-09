-- Table: user
CREATE SEQUENCE auto_id_users;
CREATE TABLE users (
id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('auto_id_users'),
username VARCHAR(255) NOT NULL ,
password VARCHAR (255) NOT NULL,
active INTEGER
);
-- Table: role
CREATE SEQUENCE auto_id_roles;
CREATE TABLE roles (
id INTEGER NOT NULL  PRIMARY KEY DEFAULT nextval('auto_id_roles'),
name VARCHAR NOT NULL
);

-- Table for mapping user and roles: user_roles
CREATE TABLE user_roles (
-- id INTEGER NOT NULL PRIMARY KEY ,
user_id INTEGER NOT NULL ,
roles_id INTEGER NOT NULL ,
FOREIGN KEY (user_id) REFERENCES users (id),
FOREIGN KEY (roles_id) REFERENCES roles (id),
UNIQUE (user_id, roles_id)
);

-- Insert data
INSERT INTO users VALUES (0, 'Sasha', '12345678',1);

INSERT INTO roles VALUES ( 2, 'ADMIN');