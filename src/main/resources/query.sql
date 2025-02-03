CREATE TABLE COMPANY(
                        id  SERIAL PRIMARY KEY,
                        name           TEXT      NOT NULL,
                        age            INT       NOT NULL,
                        address        CHAR(50),
                        salary         REAL
);

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ( 'Paul', 32, 'California', 20000.00 );

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ('Allen', 25, 'Texas', 15000.00 );

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ('Teddy', 23, 'Norway', 20000.00 );

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ( 'Mark', 25, 'Rich-Mond ', 65000.00 );

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ( 'David', 27, 'Texas', 85000.00 );


INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ( 'Kim', 22, 'South-Hall', 45000.00 );

INSERT INTO COMPANY (NAME,AGE,ADDRESS,SALARY)
VALUES ( 'James', 24, 'Houston', 10000.00 );

-- USER
CREATE TABLE USERS(
                        id  SERIAL PRIMARY KEY,
                        username           CHAR(50),
                        password           CHAR(50),
                        name           TEXT      NOT NULL,
);

INSERT INTO COMPANY (username,password,name)
VALUES ( 'tt.tung', '123456', 'Mars' );

--  roles
CREATE TABLE roles(
                      id  SERIAL PRIMARY KEY,
                      role_id        CHAR(50),
                      role_name        CHAR(50)
);

INSERT INTO roles (role_id,role_name)
VALUES ( 'ROLE_USER', 'Người dùng');

INSERT INTO roles (role_id,role_name)
VALUES ( 'ROLE_ADMIN', 'Quản trị viên');

-- user_roles
CREATE TABLE user_roles(
                           id  SERIAL PRIMARY KEY,
                           role_id        CHAR(50),
                           username       CHAR(50)
);

INSERT INTO user_roles (role_id,username)
VALUES ( 'ROLE_USER', 'tt.tung');