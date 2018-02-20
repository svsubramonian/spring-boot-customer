CREATE TABLE person ( id BIGINT NOT NULL AUTO_INCREMENT, first_name varchar(255) NOT NULL, last_name varchar(255) NOT NULL, PRIMARY KEY (id) );

CREATE TABLE hotel ( id BIGINT NOT NULL AUTO_INCREMENT, name varchar(255) NOT NULL, address varchar(255) NOT NULL, zip varchar(255) NOT NULL, version BIGINT NOT NULL, PRIMARY KEY (id) ); 

CREATE TABLE customer ( id BIGINT NOT NULL AUTO_INCREMENT, firstname varchar(255), lastname varchar(255), PRIMARY KEY (id) );

