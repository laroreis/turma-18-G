create database db_rh;
use db_rh;
create table tb_funcionarios(
id bigint auto_increment,
nome varchar (300) not null,
salario float (100,2) not null,
funcao varchar (100) not null,
horario float (10,2) not null,
primary key (id)
);

insert into tb_funcionarios (nome, salario, funcao, horario) values ("Camilla", 2222.22,"rh",8);
insert into tb_funcionarios (nome, salario, funcao, horario) values ("Larissa", 8000,"Dev",15);
insert into tb_funcionarios (nome, salario, funcao, horario) values ("Jorge", 1000,"jovem aprendiz",4);
insert into tb_funcionarios (nome, salario, funcao, horario) values ("Karen", 10000,"Presidente",20);
insert into tb_funcionarios (nome, salario, funcao, horario) values ("Leticia", 4822.28,"Contabilidade",8);


select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000.00;

select * from tb_funcionarios where salario < 2000.00;

update tb_funcionarios set tb_funcionarios.salario = 4500 where id = 1;

select * from tb_funcionarios;
