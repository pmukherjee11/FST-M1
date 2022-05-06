REM   Script: Activity3
REM   Selection

CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar2(52), 
    ContactName varchar2(32), 
    Address varchar2(255), 
    City varchar2(50), 
    PostalCode varchar2(20), 
    Country varchar2(20) 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

insert into salesman values(5001, James Hoog, New York, 15);

insert into salesman values(5001, James Hoog, New York, 15);

insert into salesman values(5001, "James Hoog", "New York", 15);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

select * from salesman;

insert into salesman values(5001, 'James Hoog', 'New York', 15);

insert into salesman values(5002, 'Nail Knite', 'Paris', 13);

insert into salesman values(5005, 'Pit Alex', 'London', 11);

insert into salesman values(5006, 'McLyon', 'Paris', 14);

SELECT * FROM salesman;

INSERT ALL 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

