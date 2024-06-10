create database mymemo;
use mymemo;
create table memos (
	id int auto_increment primary key,
    descrizione varchar(100),
    testo varchar(200),
    dataCreazione date,
    completato boolean
);
select * from memos;