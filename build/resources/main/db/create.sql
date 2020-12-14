SET MODE postgreSQL;

CREATE TABLE IF NOT EXISTS restaurants(

id int PRIMARY KEY auto_increment,

name VARCHAR,
address VARCHAR,
zipcode VARCHAR,
email VARCHAR,
website VARCHAR,
phone VARCHAR
);

CREATE TABLE IF NOT EXISTS reviews(

 id int PRIMARY KEY auto_increment,

 name VARCHAR,
 writtenBy VARCHAR,
 content VARCHAR,
 rating VARCHAR,
 restaurantId INTEGER

);

CREATE TABLE IF NOT EXISTS foodtypes(

id int PRIMARY KEY auto_increment,
name VARCHAR

);

CREATE TABLE IF NOT EXISTS restaurants_foodtypes(
id int PRIMARY KEY auto_increment,
foodtypeId INTEGER,
restaurantId INTEGER
);
