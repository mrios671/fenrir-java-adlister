USE adlister_db;

CREATE TABLE users(
    id       INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    username VARCHAR(255)                   NOT NULL,
    email    VARCHAR(255) UNIQUE            NOT NULL,
    password VARCHAR(255)                   NOT NULL
);

CREATE TABLE ads(
    id          INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    user_id     INTEGER                        NOT NULL,
    title       VARCHAR(255)                   NOT NULL,
    description VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users (id)
);