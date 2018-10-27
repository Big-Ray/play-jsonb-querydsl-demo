# --- !Ups
CREATE TABLE IF NOT EXISTS dog (
  id SERIAL NOT NULL PRIMARY KEY,
  name TEXT NOT NULL,
  age INT NOT NULL,
  biteable bool NOT NULL DEFAULT false
);

INSERT INTO dog (name, age) VALUES ('Farah', 8);


# --- !Downs
DELETE FROM dog;
DROP TABLE dog;