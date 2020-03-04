create database db_saude;
use db_saude;

create table tb_hospital(
id_hospital int(6) primary key auto_increment,
nm_hospital varchar(100)not null,
ds_endereco varchar(155)not null
);



