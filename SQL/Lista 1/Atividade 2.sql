create database db_ecommece;
use db_ecommece;

create table tb_produtos(
id bigint auto_increment,
nome varchar (20) not null,
marca varchar (100) not null,
cor varchar (30) not null,
valor float (100,2) not null,
primary key(id)

);

insert into tb_produtos (nome, marca, cor, valor) values ("Celular","Samsung","Preta",8000.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Iphone","Apple","Cinza",4500.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Fone","Lenovo","Preta",500.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Ring Ligth","Rose","Branco",90.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Celular","Nokia","Rosa",450.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Celular","Samsung","Prata",1000.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Fone","Samsung","Branco",50.00);
insert into tb_produtos (nome, marca, cor, valor) values ("Ring Light","Rose","Preta",800.00);

select * from tb_produtos; 

select * from tb_produtos where valor > 500.00;

select * from tb_produtos where valor < 500.00;

update tb_produtos set tb_produtos.valor = 4500 where id = 9;

select * from tb_produtos