CREATE TABLE person_test (
person_code VARCHAR(3) NOT NULL,
first_name VARCHAR(15) NOT NULL,
last_name VARCHAR(20) NOT NULL,
hiredate DATE,
PRIMARY KEY (person_code));


CREATE TABLE purchase_test (
product_name VARCHAR(25),
salesperson VARCHAR(3),
purchase_date DATE,
quantity NUMERIC(4,2));


ALTER TABLE purchase_test
ADD FOREIGN KEY (salesperson)
REFERENCES person_test (person_code);

CREATE TABLE product_test (
product_name VARCHAR(25),
product_price NUMERIC(8,2),
quantity_on_hand NUMERIC(5,0),
laststockdate DATE,
PRIMARY KEY (product_name));


ALTER TABLE purchase_test
ADD FOREIGN KEY (product_name)
REFERENCES product_test (product_name);


CREATE TABLE purchase_archive_test (
product_name VARCHAR(25),
salesperson VARCHAR(3),
purchase_date DATE,
quantity NUMERIC(4,2));


CREATE TABLE old_item_test(
item_id CHAR(20),
item_desc CHAR(25));




