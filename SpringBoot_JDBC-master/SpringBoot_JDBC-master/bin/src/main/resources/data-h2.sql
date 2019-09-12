insert into Blogger (id, age,name) VALUES (1, 21, 'Gyula');
insert into Blogger (id, age,name) VALUES (2, 26, 'Krisz');
insert into STORY (id, title,content,posted,blogger_id) values (1, 'Teszt cím','Teszt tartalom', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula') );
insert into STORY (id, title,content,posted,blogger_id) values (2, 'szia','Teszt2 tartalom2', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula') );