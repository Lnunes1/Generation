create database escola;

use escola;

create table tb_estudante(
    id bigint(5) auto_increment,
    nome varchar(20) not null,
    idade bigint,
    nota bigint,
    presente boolean,
    primary key (id)
    );

insert into tb_estudante (nome, idade, nota, presente) values ("Gustavo Scarpa", 11, 7, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Dudu", 10, 8, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Raphael Veiga", 8, 9, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Weverton", 11, 4, 0);
insert into tb_estudante (nome, idade, nota, presente) values ("Danilo", 12, 9, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Zé Rafael", 10, 5, 0);
insert into tb_estudante (nome, idade, nota, presente) values ("Felipe Melo", 13, 5, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Rony", 9, 7, 0);

select * from tb_estudante where nota > 7;

select * from tb_estudante where nota < 7;

update tb_estudante set nome = "Felipe M"
    where id = 7;