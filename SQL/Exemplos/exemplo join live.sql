-- aula introdutoria na live 
-- criar banco de dados
create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao,ativo) values ("Bovino",true);
insert tb_categoria (descricao,ativo) values ("Suino",true);
insert tb_categoria (descricao,ativo) values ("Aves",true);
insert tb_categoria (descricao,ativo) values ("pertence feijoada",true);
insert tb_categoria (descricao,ativo) values ("imbutidos",true);
insert tb_categoria (descricao,ativo) values ("Outros",true);

select descricao,ativo from tb_categoria;

use db_cidade_das_carnes;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("ASA",40.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Picanha",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Coxa de Frango",20.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Bacon",30.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Hamburguer",60.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Cupim",20.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Peito de Frango",25.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Orelha de Porco",20.00,30,4);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Salame",18.00,30,5);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Medalhao",50.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Mocoto",20.00,30,2);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Chuleta",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto) values  ("Acendedor de Churrasqueira",20.00,30);



select * from tb_produtos;

select * from tb_produtos where nome Like "%a%";
SELECT * FROM tb_produtos WHERE preco IN(20,30,40);
SELECT * FROM tb_produtos WHERE preco BETWEEN 20 AND 40;

SELECT COUNT(*) FROM tb_produtos; -- quantidade de produtos cadastrados.
SELECT SUM(preco)FROM tb_produtos; -- soma a tabela

SELECT AVG(preco) AS media FROM tb_produtos;

-- drop table nomedatabela; -- deleta tabela