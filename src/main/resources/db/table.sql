CREATE TABLE users(
    id int auto_increment primary key,
    user_id varchar,
    user_name varchar,
    user_password varchar,
    email varchar,
    nickname varchar,
    role varchar default '새싹회원',
    created_at timestamp,
    update_at timestamp
);
CREATE TABLE mail(
    id int auto_increment primary key,
    email_id varchar,
    title varchar,
    contents varchar,
    created_at timestamp
);