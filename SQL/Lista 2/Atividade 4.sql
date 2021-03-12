-- Atividade 4 lista 2 dia 12/03

create database db_cidade_das_carnes_veganas;
use db_cidade_das_carnes_veganas;

create table tb_produto(
id bigint auto_increment,
tipo varchar (255) not null,
entrega boolean not null,
primary key (id)
);

insert into tb_produto (tipo, entrega) values("jaca", true);
insert into tb_produto (tipo, entrega) values("soja", false);
insert into tb_produto (tipo, entrega) values("jaca", false);
insert into tb_produto (tipo, entrega) values("soja", true);
insert into tb_produto (tipo, entrega) values("tofu", true);
insert into tb_produto (tipo, entrega) values("quinoa", true);
insert into tb_produto (tipo, entrega) values("lentilha", true);

select * from tb_produto;

use db_cidade_das_carnes_veganas;
create table tb_categoria (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal (10,2) not null,
quantidade double not null,
produto_id bigint,
primary key(id),
foreign key(produto_id) references tb_produto(id)
);

insert into tb_categoria (nome, preco, quantidade, produto_id) values ("hamburguer", 25.99,5.10,1);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("file", 55.99,3,5);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("hamburguer", 105.99,10.20,6);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("almondega", 75.99,5.10,1);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("file", 15.99,1,3);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("file", 109.99,6,3);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("file", 126.99,1,3);
insert into tb_categoria (nome, preco, quantidade, produto_id) values ("file", 15.99,1,1);
insert into tb_categoria (nome, preco, quantidade) values ("coxinha", 105.99,8.50);

select * from tb_categoria;

select * from tb_categoria where preco > 50; 
 
 select * from tb_categoria where preco  BETWEEN 3 and 60;
 
 select * from tb_categoria where nome LIKE "%c%";
 
  select * from  tb_categoria
	inner join tb_produto on tb_produto.id = tb_categoria.produto_id;
    
select * from tb_categoria where nome IN ("file");


