CREATE TYPE role_name AS ENUM ('user', 'admin');
CREATE TYPE contact_type AS ENUM ('family', 'friend', 'work');

CREATE TABLE "users" (
  "user_id" INT GENERATED ALWAYS AS IDENTITY,
  "first_name" VARCHAR(50) NOT NULL,
  "last_name" VARCHAR(50) NOT NULL,
  "address_name" VARCHAR(50) NOT NULL,
  "username" VARCHAR(50)NOT NULL UNIQUE,
  "password" VARCHAR(50)NOT NULL,
  "role_name" role_name NOT NULL,
  PRIMARY KEY(user_id)
);


CREATE TABLE "contacts" (
  "contact_id" INT GENERATED ALWAYS AS IDENTITY,
  "first_name" VARCHAR(50) NOT NULL,
  "last_name" VARCHAR(50) NOT NULL,
  "phone_number" VARCHAR(50) NOT NULL,
  "user_id" INT NOT NULL,
  "contact_type" contact_type NOT NULL,
  PRIMARY KEY(contact_id),
    CONSTRAINT fk_users
       FOREIGN KEY(user_id)
	   REFERENCES users(user_id)
);
