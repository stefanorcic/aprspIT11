INSERT INTO tip_racuna ("id","naziv","oznaka","opis" ) 
values (nextval('tip_racuna_seq'), 'Debitni', 'rva', 'Neki tamo racun');

INSERT INTO tip_racuna ("id","naziv","oznaka","opis" ) 
values (nextval('tip_racuna_seq'), 'Debitni 2', 'rva 2', 'Neki tamo racun 2');

INSERT INTO tip_racuna ("id","naziv","oznaka","opis" ) 
values (nextval('tip_racuna_seq'), 'Debitni 3', 'rva 3', 'opis racun 3');

INSERT INTO kredit ("id","naziv","oznaka","opis" ) 
values (nextval('kredit_seq'), 'Gotovinski', 'na grejs period', 'Neki tamo kredit');

INSERT INTO kredit ("id","naziv","oznaka","opis" ) 
values (nextval('kredit_seq'), 'Gotovinski 2', 'oznaka kredit', 'Neki tamo kredit 2');

INSERT INTO kredit ("id","naziv","oznaka","opis" ) 
values (nextval('kredit_seq'), 'Kes kredit', 'oznaka kes kredit', 'Neki tamo kredit 3');

INSERT INTO klijent ("id","ime","prezime","broj_lk","kredit" ) 
values (nextval('klijent_seq'), 'Jovan', 'Jovanovic', 12, 1);

INSERT INTO klijent ("id","ime","prezime","broj_lk","kredit" ) 
values (nextval('klijent_seq'), 'Stefan', 'Stefanovic', 112, 2);

INSERT INTO klijent ("id","ime","prezime","broj_lk","kredit" ) 
values (nextval('klijent_seq'), 'Dejan', 'Dejanovic', 222, 3);

INSERT INTO racun ("id","naziv","oznaka","opis","tip_racuna", "klijent" ) 
values (nextval('racun_seq'), 'Neki racun', 'Neka oznaka', 'neki opis', 1, 1);

INSERT INTO racun ("id","naziv","oznaka","opis","tip_racuna", "klijent" ) 
values (nextval('racun_seq'), 'Neki racun 1', 'Neka oznaka 1', 'neki opis 1', 2, 2);

INSERT INTO racun ("id","naziv","oznaka","opis","tip_racuna", "klijent" ) 
values (nextval('racun_seq'), 'Neki racun', 'Neka oznaka', 'neki opis', 3, 2);

