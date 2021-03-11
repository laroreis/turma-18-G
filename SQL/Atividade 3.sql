create database db_escola;
use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar (255) not null,
serie bigint (10) not null,
materia varchar (100) not null,
nota float (10,2) not null,
primary key(id)
);

insert into tb_alunos (nome, serie, materia, nota) values ("Rachel",5,"Portugues",8.00);
insert into tb_alunos (nome, serie, materia, nota) values ("Maria",6,"Artes",10.00);
insert into tb_alunos (nome, serie, materia, nota) values ("Larissa",10,"Fisica",10.00);
insert into tb_alunos (nome, serie, materia, nota) values ("Roberto",4,"Portugues",2.50);
insert into tb_alunos (nome, serie, materia, nota) values ("Marcos",3,"Portugues",8.60);
insert into tb_alunos (nome, serie, materia, nota) values ("Luciana",5,"Matematica",5.00);
insert into tb_alunos (nome, serie, materia, nota) values ("Lucia",10,"Portugues",8.00);
insert into tb_alunos (nome, serie, materia, nota) values ("Eliza",6,"Artes",9.50);

select * from tb_alunos;

select * from tb_alunos where nota > 7.00;
select * from tb_alunos where nota < 7.00;

update tb_alunos set tb_alunos.nota = 4 where id = 5;

