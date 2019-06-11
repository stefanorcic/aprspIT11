DROP TABLE IF EXISTS tip_racuna CASCADE;
DROP TABLE IF EXISTS kredit CASCADE;
DROP TABLE IF EXISTS klijent CASCADE;
DROP TABLE IF EXISTS racun CASCADE;

DROP SEQUENCE IF EXISTS tip_racuna_seq CASCADE;
DROP SEQUENCE IF EXISTS kredit_seq CASCADE;
DROP SEQUENCE IF EXISTS klijent_seq CASCADE;
DROP SEQUENCE IF EXISTS racun_seq CASCADE;


CREATE TABLE tip_racuna(
	id integer NOT NULL,
	naziv varchar(100) NOT NULL,
	oznaka varchar(20) NOT NULL,
	opis varchar(500)
);

CREATE TABLE kredit(
	id integer NOT NULL,
	naziv varchar(100) NOT NULL,
	oznaka varchar(20) NOT NULL,
	opis varchar(500)
);

CREATE TABLE klijent(
	id integer NOT NULL,
	ime varchar(50) NOT NULL,
	prezime varchar(50) NOT NULL,
	broj_lk integer NOT NULL,
	kredit integer NOT NULL
);

CREATE TABLE racun(
	id integer NOT NULL,
	naziv varchar(100) NOT NULL,
	oznaka varchar(20) NOT NULL,
	opis varchar(500),
	tip_racuna integer NOT NULL,
	klijent integer NOT NULL
);

ALTER TABLE tip_racuna ADD CONSTRAINT PK_tip_racuna
	PRIMARY KEY(id);
ALTER TABLE kredit ADD CONSTRAINT PK_kredit
	PRIMARY KEY(id);
ALTER TABLE klijent ADD CONSTRAINT PK_klijent
	PRIMARY KEY(id);
ALTER TABLE racun ADD CONSTRAINT PK_racun
	PRIMARY KEY(id);
	
ALTER TABLE klijent ADD CONSTRAINT FK_klijent_kredit
	FOREIGN KEY (kredit) REFERENCES kredit (id);
ALTER TABLE racun ADD CONSTRAINT FK_racun_tip_racuna
	FOREIGN KEY (tip_racuna) REFERENCES tip_racuna (id);
ALTER TABLE racun ADD CONSTRAINT FK_racun_klijent
	FOREIGN KEY (klijent) REFERENCES klijent (id);
	
CREATE INDEX IDXFK_klijent_kredit
	ON klijent (kredit);
CREATE INDEX IDXFK_racun_tip_racuna
	ON racun (tip_racuna);
CREATE INDEX IDXFK_racun_klijent
	ON racun (klijent);
	

CREATE SEQUENCE tip_racuna_seq
INCREMENT 1;
CREATE SEQUENCE kredit_seq
INCREMENT 1;
CREATE SEQUENCE klijent_seq
INCREMENT 1;
CREATE SEQUENCE racun_seq
INCREMENT 1;