-- Atividade 5 lista 2 dia 12/03

create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar (255) not null,
entrega boolean not null,
primary key (id) 
);

insert into tb_categoria (descricao, entrega) values ("hidráulica",true);
insert into tb_categoria (descricao, entrega) values ("hidráulica",false);
insert into tb_categoria (descricao, entrega) values ("insumo",true);
insert into tb_categoria (descricao, entrega) values ("insumo",false);
insert into tb_categoria (descricao, entrega) values ("acabamentos",true);
insert into tb_categoria (descricao, entrega) values ("acabamentos",false);

select * from tb_categoria;

use db_construindo_a_nossa_vida;

create table tb_produto(
id bigint auto_increment,
nome varchar (255) not null,
preco decimal (10,2) not null,
quantidade double not null,
produto_id bigint,
primary key(id),
foreign key(produto_id) references tb_produto(id)
);

insert into tb_produto (nome, preco, quantidade, produto_id) values ("cano", 25.99,1,1);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("cano", 75.99,3,2);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("tijolo", 55.99,100,3);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("areia", 1050.99,50,4);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("piso", 2025.99,100,1);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("azuleijo", 2555.99,100,6);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("pedra", 255.99,80,3);
insert into tb_produto (nome, preco, quantidade, produto_id) values ("cimento", 355.99,10,3);

select * from tb_produto;

update tb_produto set tb_produto.produto_id = 3 where id = 5;

select * from tb_produto where preco > 50; 

select * from tb_produto where preco  BETWEEN 3 and 60;

select * from tb_produto where nome LIKE "%c%";

   select * from  tb_categoria
	inner join tb_produto on tb_categoria.id = tb_produto.produto_id;
    
    select * from tb_categoria where descricao IN ("acabamentos");