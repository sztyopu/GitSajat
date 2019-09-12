insert into Blogger (id, age, name) VALUES (1, 21, 'Gyula');
insert into Blogger (id, age, name) VALUES (2, 26, 'Krisz');
insert into STORY (id,title,content,posted,blogger_id) values (1, 'Teszt cím','Teszt tartalom', '2019-08-17', (select id FROM BLOGGER where name = 'Gyula') );
insert into STORY (id,title,content,posted,blogger_id) values (2, 'Teszt2 cím','Teszt2 tartalom2', '2019-08-16', (select id FROM BLOGGER where name = 'Gyula') );
