create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
    id bigint auto_increment,
    funçao varchar (10) not null,
    arma varchar (10) not null,
    pais varchar (10) not null,
    primary key (id)
    );

insert into tb_classe (funçao, arma, pais) values ("Assasino","Adaga","Noruega" );
insert into tb_classe (funçao, arma, pais) values ("Mago", "Cajado", "Russia");
insert into tb_classe (funçao, arma, pais) values ("Guerreiro", "Espada", "Brasil");
insert into tb_classe (funçao, arma, pais) values ("Arqueiro", "Arco", "França");
insert into tb_classe (funçao, arma, pais) values ("Suporte", "Livro", "Espanha");

create table tb_personagem(
id bigint auto_increment primary key,
    poder bigint (10) not null,
    defesa bigint (10) not null,
    nome varchar (10) not null,
    experiencia bigint (10) not null,
    classe_id bigint not null,
    foreign key (classe_id) references tb_classe(id)
);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Felipe", 5000, 6000, 10, 1);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Wevertom", 1500, 10000, 7, 2);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Gustavo", 2000, 7000, 5, 2);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Luan", 1000, 6200, 3, 3);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Piquerez", 1100, 8000, 1, 5);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Danilo", 1400, 6100, 2, 3);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Dudu", 10000, 3000, 5, 4);
insert into tb_personagem (nome, poder, defesa, experiencia, classe_id) values ("Raphael", 9200, 2200, 10, 1);

select * from tb_personagem where poder > 2000;

select * from tb_personagem where defesa < 1000 and 2000;

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id;

select tb_classe.funçao, tb_personagem.nome from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id
where tb_classe.funçao like "%Ass%"