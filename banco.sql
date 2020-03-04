create database db_saude;
use db_saude;

create table tb_hospital(
id_hospital int(6) primary key auto_increment,
nm_hospital varchar(100)not null,
ds_endereco varchar(155)not null
);

create table tb_pacientes(
id_paciente int(6) primary key auto_increment,
nm_paciente varchar(60)not null, 
nr_CPF varchar(14)not null,
nr_RG varchar(40)not null,
nr_idade int(3)not null,
ds_senha varchar(50),
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id_hospital)
);

create table tb_funcionarios(
id_funcionario int(6) primary key auto_increment,
nm_funcionario varchar(60)not null, 
nr_CPF varchar(14)not null,
nr_RG varchar(40)not null,
nr_idade int(3)not null,
ds_senha varchar(50),
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id_hospital),
vl_hora decimal(5, 2)not null
);

create table tb_medico(
cd_medico int(6)auto_increment primary key not null,
nr_crm varchar(50)not null,
ds_especialidade varchar(50)not null,
id_funcionario int(6)not null,
foreign key(id_funcionario)references tb_funcionarios(id_funcionario)
);

create table tb_enfermeiro(
cd_enfermeiro int(6)auto_increment primary key not null,
nr_coren varchar(45)not null,
id_funcionario int(6)not null,
foreign key(id_funcionario)references tb_funcionarios(id_funcionario)
);

create table tb_ps(
cd_prontoS int(6)primary key auto_increment not null,
ds_endereco varchar(100)not null,
id_hospital int not null,
foreign key(id_hospital) references tb_hospital(id_hospital)
)


