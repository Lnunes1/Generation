use db_serviço;

insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Gustavo Scarpa", 26, 2000, 3);
    insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Felipe Melo", 38, 6500, 4);
    insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Dudu", 29, 8000, 5);
    insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Weverton", 30, 7000, 1);
    insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Gustavo Gomez", 25, 9000, 4);
    insert into tb_informaçoes (nome, idade, salario, AnosDeEmpresa)
    values ("Marcos Rocha", 34, 7200, 3);


select * from tb_informaçoes where salario > 2000;

select * from tb_informaçoes where salario < 2000;

update tb_informaçoes set nome = "Gustavo G"
    where id = 5;
    
    select * from tb_informaçoes