-- Atividade 3 lista 2 dia 12/03

create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo varchar (255) not null,  -- remedio, cosmeticos.check
quantidade bigint not null,
entrega boolean not null,
primary key(id)
);

insert into tb_categoria (tipo, quantidade, entrega) values ("remedio", 2, true);
insert into tb_categoria (tipo, quantidade, entrega) values ("cosméticos", 10, true);
insert into tb_categoria (tipo, quantidade, entrega) values ("remedio", 15, false);
insert into tb_categoria (tipo, quantidade, entrega) values ("remedio", 200, true);
insert into tb_categoria (tipo, quantidade, entrega) values ("cosmésticos", 20, true);
insert into tb_categoria (tipo, quantidade, entrega) values ("cosmésticos", 5, true);
insert into tb_categoria (tipo, quantidade, entrega) values ("cosmésticos", 200, false);
insert into tb_categoria (tipo, quantidade, entrega) values ("cosmésticos", 1, true);

update tb_categoria set tb_categoria.tipo = "cosméticos" where id = 8;

select * from tb_categoria;

use db_farmacia_do_bem;

create table tb_produto(
id bigint auto_increment,
nome varchar (255) not null,
marca varchar (255) not null,
preco decimal not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto (nome, marca, preco, categoria_id) values ("dipirona", "generico", 15.00, 1);
insert into tb_produto (nome, marca, preco, categoria_id) values ("creme", "dove", 25.00, 2);
insert into tb_produto (nome, marca, preco, categoria_id) values ("losartana", "generico", 35.00, 3);
insert into tb_produto (nome, marca, preco, categoria_id) values ("ibuprofeno", "buscofem", 29.39, 4);
insert into tb_produto (nome, marca, preco, categoria_id) values ("ibuprofeno", "buscofem", 9.39, 1);
insert into tb_produto (nome, marca, preco, categoria_id) values ("creme de pentear", "salon line", 39.39, 5);
insert into tb_produto (nome, marca, preco, categoria_id) values ("esmalte", "risque", 10.50, 8);
insert into tb_produto (nome, marca, preco, categoria_id) values ("mascara de cilios", "quem disse berenice", 119, 7);

select * from tb_produto;

 select * from tb_produto where preco > 50; 
 
 select * from tb_produto where preco  BETWEEN 3 and 60;
 
 select * from tb_produto where marca LIKE "%b%";
 
 select * from  tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
     where tb_produto.nome like "%a%";
     
select * from tb_categoria where tipo IN ("cosméticos");








