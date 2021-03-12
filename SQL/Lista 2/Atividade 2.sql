-- Atividade 2 lista 2 dia 12/03
create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar (255) not null,		-- doce ou salgada
tamanho varchar (30) not null, -- pequena/grande
unidade bigint not null,  -- 1 fatia 
primary key(id) 

);

insert into tb_categoria (tipo, tamanho, unidade) values ("doce", "pequena", 1);
insert into tb_categoria (tipo, tamanho, unidade) values ("salgada", "grande", 2);
insert into tb_categoria (tipo, tamanho, unidade) values ("doce", "grande", 5);
insert into tb_categoria (tipo, tamanho, unidade) values ("doce", "familia", 1);
insert into tb_categoria (tipo, tamanho, unidade) values ("salgado", "familia", 3);
insert into tb_categoria (tipo, tamanho, unidade) values ("salgado", "pequena", 1);
insert into tb_categoria (tipo, tamanho, unidade) values ("mista", "grande", 1);

select * from tb_categoria;

use db_pizzaria_legal;

create table tb_produto(
id bigint auto_increment,
sabor varchar (255) not null,
preco decimal not null,
entrega boolean not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)

);

insert into tb_produto (sabor, preco, entrega, categoria_id) values ("chocolate", 10, true, 1);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("calabresa", 15, false, 2);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("chocolate com morango", 25.00, true, 3);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("chocolate", 10, false, 4);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("frango com catupiry", 30, false, 5);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("portuguesa", 40, true, 6);
insert into tb_produto (sabor, preco, entrega) values ("prestigio", 15, true);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("chocolate com queijo", 35, true, 7);
insert into tb_produto (sabor, preco, entrega, categoria_id) values ("chocolate com queijo gouda", 65, true, 7);


select * from tb_produto;

 select * from tb_produto where preco > 45; 

select * from tb_produto where preco < 45; 

select * from tb_produto where preco  BETWEEN 29 and 60;

select * from tb_produto where sabor LIKE "%c%";

select * from  tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
select * from tb_categoria where tipo IN ("doce");


 