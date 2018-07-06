--insert into users (username, password, enabled) values ('bob', '{noop}bob', true);
insert into users (username, password, enabled) values ('bob', '{bcrypt}$2a$05$bK4zxLRoWvwHgkaxkMebKOYieU04/ORwux25tCTzGVuVq36/2Yr/S', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

--insert into users (username, password, enabled) values ('janice', '{noop}janice', true);
insert into users (username, password, enabled) values ('janice', '{bcrypt}$2a$05$mFi1T0CfT3GdOhruzrYO/O8im1jIvgjdAfntRFztz/h.N6qPzUYtW', true);
insert into authorities (username, authority) values ('janice', 'ROLE_USER');

--insert into users (username, password, enabled) values ('sara', '{noop}sara', true);
insert into users (username, password, enabled) values ('sara', '{bcrypt}$2a$05$IV3FUmQF95p9pMJKduSzZeHIlgGjJAmuJt1N6ESay3ksdZVB80Bm6', true);
insert into authorities (username, authority) values ('sara', 'ROLE_USER');
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');

--insert into users (username, password, enabled) values ('ken', '{noop}ken', true);
insert into users (username, password, enabled) values ('ken', '{bcrypt}$2a$05$80QU6WsjkjPz5BjnxOsI6.cS5haETLiKc9ggrYUOnBfx0QjmKNDky', true);
insert into authorities (username, authority) values ('ken', 'ROLE_USER');
insert into authorities (username, authority) values ('ken', 'ROLE_ADMIN');