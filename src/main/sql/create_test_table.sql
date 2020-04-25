DROP TABLE IF EXISTS tier_arten;

CREATE TABLE IF NOT EXISTS tier_arten (
    id serial PRIMARY KEY,
    name VARCHAR(25)
);

INSERT INTO tier_arten(name) VALUES('Tiger');
INSERT INTO tier_arten(name) VALUES('Wolf');
INSERT INTO tier_arten(name) VALUES('Hase');