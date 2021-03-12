-- atividade 1 lista 2 dia 12/03/2021

create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
nome varchar (255) not null,
funcao varchar (255) not null,
primary key(id)
);

insert into tb_classe (nome, funcao) values ("Cleopatra", "Farao");
insert into tb_classe (nome, funcao) values ("Oliver Queen", "Arqueiro");
insert into tb_classe (nome, funcao) values ("Clint Barton", "Arqueiro");
insert into tb_classe (nome, funcao) values ("Mulher Maravilha", "Heroina");
insert into tb_classe (nome, funcao) values ("Viuva Negra", "Heroina");

select * from tb_classe;

use db_generation_game_online;

create table tb_personagem(
id bigint auto_increment,
poderDefesa bigint not null,
poderAtaque bigint not null,
numeroVida bigint not null,
rapidez bigint not null,
maldade bigint not null,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classe(id)
);

insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (1000, 1500, 100, 20, 50, 1);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (2000, 500, 90, 50, 100, 2);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (1500, 500, 80, 40, 50, 3);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (3000, 15000, 100, 100, 40, 4);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (700, 2000, 10, 90, 100, 5);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (50, 150, 10, 2, 5, 1);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade) values (110, 150, 1, 200, 100);
insert into tb_personagem (poderDefesa, poderAtaque, numeroVida, rapidez, maldade, classe_id) values (8000, 7000, 100, 100, 50, 3);

select * from tb_personagem;

select * from tb_personagem where poderAtaque > 2000;

select * from tb_personagem where poderDefesa  BETWEEN 1000 and 2000;

select * from tb_classe where nome LIKE "%c%";

select * from  tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.classe_id;
    
select * from tb_classe where funcao IN ("arqueiro");


