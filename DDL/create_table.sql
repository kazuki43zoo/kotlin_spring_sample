-- Create DB
CREATE DATABASE sample; 
USE sample;
-- Create Table
CREATE TABLE item(
    id INTEGER PRIMARY KEY AUTO_INCREMENT, 
    name VARCHAR(10), 
    price INTEGER, 
    type INTEGER
);
-- Insert Data
INSERT INTO 
    item(name, price, type) 
VALUES
    ('Apple', 150, 1), 
    ('Onion', 60, 2), 
    ('Cherry', 300, 1), 
    ('Carrot', 70, 2), 
    ('Banana', 80, 1)
;
