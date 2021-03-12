-- Atividade 6 lista 2 dia 12/03

create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_curso(
id bigint auto_increment,
nome varchar (255) not null,
nivel bigint not null,
primary key(id)
);

insert into tb_curso (nome, nivel) values ("Java", 1);
insert into tb_curso (nome, nivel) values ("Java", 2);
insert into tb_curso (nome, nivel) values ("Java", 3);
insert into tb_curso (nome, nivel) values ("HTML", 1);
insert into tb_curso (nome, nivel) values ("HTML", 2);
insert into tb_curso (nome, nivel) values ("SQL", 1);

select * from tb_curso;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
valor double (100,2) not null,
sala boolean not null,  -- aberta / fechada
NAlunos bigint not null, -- numero de alunos
curso_id bigint,
primary key(id),
foreign key (curso_id) references tb_curso(id)
);

insert into tb_categoria (valor, sala, NAlunos, curso_id) values (100, true, 12, 1);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (150, true, 20, 2);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (200, true, 10, 3);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (160, true, 120, 4);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (400, true, 30, 5);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (1000, true, 46, 6);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (100, false, 102, 1);
insert into tb_categoria (valor, sala, NAlunos, curso_id) values (180, false, 24, 3);

select * from tb_categoria;

select * from tb_categoria where valor > 50; 

select * from tb_categoria where valor  BETWEEN 3 and 60;

select * from tb_curso where nome LIKE "%j%";

  select * from  tb_curso
	inner join tb_categoria on tb_curso.id = tb_categoria.curso_id;
    
      select * from tb_curso where nome IN ("java");