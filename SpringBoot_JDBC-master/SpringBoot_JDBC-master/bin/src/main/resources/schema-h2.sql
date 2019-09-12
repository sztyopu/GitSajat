DROP TABLE IF EXISTS Blogger;

CREATE TABLE Blogger(
 id bigint NOT NULL,
 name varchar(100), 
 age int,
 PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Story;

CREATE TABLE Story(
 id bigint NOT NULL,
 title varchar(100), 
 content varchar(400),
 posted date,
 blogger_id int,
 PRIMARY KEY (id)
);