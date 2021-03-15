create database db_nome_minha_casa_mais_bonita;
use db_nome_minha_casa_mais_bonita;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
entrega boolean not null,
tamanho varchar (255) not null,
primary key(id)
);

insert into tb_categoria (tipo, entrega, tamanho) values ("cosméticos", true, "litro"),("cosméticos",false,"litro"),("remedio",true,"miligrama"),("remedio",false,"miligrama"),("comida",true,"kilos");
select * from tb_categoria;

use db_nome_minha_casa_mais_bonita;
create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
marca varchar (255) not null,
valor double (10,2) not null,
quantidade bigint not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Shampoo", "Salon line", 29.99, 5, 1);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Condicionador", "Salon line", 39.99, 7, 1);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Creme hidratante", "Pantene", 89.99, 15,2);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Oleo de coco", "Copra", 22.99, 50,2); 
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Losatana potássica", "neo quimica", 10.99,10,3);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("ibuprofeno", "Geolab", 15.99,80,3);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Clonazepam","Rivotril",90.99,100,4);
insert into tb_produtos (nome, marca, valor, quantidade, categoria_id) values ("Cloridrato de metilfenidato", "Ritalina",150.98,45,4);

select * from tb_produtos;

use db_nome_minha_casa_mais_bonita;

create table tb_usuario(
id bigint auto_increment,
nome varchar (255) not null,
email varchar (255) not null,
senha varchar (10) not null,
idade int not null,
localizacao varchar (255) not null,
primary key(id)
);

insert into tb_usuario (nome, email, senha, idade, localizacao) values ( "Abgail", "Adg@gmail", "12365", 18, "SP");
insert into tb_usuario (nome, email, senha, idade, localizacao) values ( "Carlos", "Carros@gmail", "15258", 68, "RJ");
insert into tb_usuario (nome, email, senha, idade, localizacao) values ( "Laro", "Laro@gmail", "15555", 20, "SP");
insert into tb_usuario (nome, email, senha, idade, localizacao) values ( "Dominic", "Dom@gmail", "11295", 17, "RJ");
insert into tb_usuario (nome, email, senha, idade, localizacao) values ( "Vitoria", "Vit@gmail", "53625", 45, "SP");

select * from tb_usuario;

select * from tb_produtos where valor > 50;

select * from tb_produtos where valor  BETWEEN 3 and 60;

select * from tb_produtos where nome LIKE "%b%";

select * from tb_usuario where nome LIKE "%c%";  -- busca

select * from  tb_produtos
	inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;   -- inner
    
SELECT AVG(valor) AS media FROM tb_produtos; -- media

SELECT SUM(valor)FROM tb_produtos;  -- soma

SELECT COUNT(*) FROM tb_produtos; -- quantidade

select * from tb_categoria where tipo IN ("remedio");

select * from tb_categoria where tipo IN ("cosméticos");

select * from  tb_produtos
	inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
	and tb_categoria.tipo = "cosméticos";
    


