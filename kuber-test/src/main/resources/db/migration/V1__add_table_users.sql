CREATE TABLE IF NOT EXISTS users
(
    id   bigint generated always as identity primary key,
    name varchar(255) not null,
    age  integer      not null
)