------Criação do Banco ------
create database Funcionalitester;

-----Criação das Tabelas-----

create table Pessoa (
id_Pessoa int not null auto_increment,
nome VARCHAR(45) NOT NULL,
sobrenome VARCHAR(45) NOT NULL,
dataNascimento VARCHAR(45) NULL,
atribuicoes varchar(50) not null,
PRIMARY KEY (id_Pessoa),
);

create table Usuario (	
Pessoa_idPessoa INT(11) NOT NULL,	
Login VARCHAR(40) NOT NULL,	
Senha VARCHAR(10) NOT NULL,	
Cargo VARCHAR(40) NOT NULL,	
Linguagem VARCHAR(30) NOT NULL,
PRIMARY KEY (Pessoa_idPessoa),
FOREIGN KEY (Pessoa_idPessoa) REFERENCES pessoa (id_Pessoa)
);


create table Software(
id_Software int not null auto_increment,
nome varchar (40) not null,
dataCriacao varchar (40) not null,
dono varchar (40) not null,
equipe varchar (40) not null,
id_analista int not null,
foreign key (id_Analista) references pessoa (id_Pessoa),
PRIMARY KEY (id_Software)
);


create table Funcionalidade(
id_Funcionalidade int not null auto_increment,
funcao VARCHAR(45) NOT NULL,
Software_idSoftware INT NOT NULL,
PRIMARY KEY (id_Funcionalidade ),
FOREIGN KEY (Software_idSoftware)
REFERENCES Software (id_Software)
);

create table Teste (
id_Teste int not null auto_increment,
ocorrencia VARCHAR(45) NULL,
area VARCHAR(45) NULL,
tipo VARCHAR(45) NULL,
prioridade VARCHAR(45) NULL,
situacao VARCHAR(45) NULL,
observacao VARCHAR(45) NULL,
funcionalidade_testada int not null,
id_testador int not null,
idDesenvolvedor INT NULL,
EmManutencao TINYINT NOT NULL,
primary key (id_Teste),
foreign key (id_Testador) references pessoa (id_Pessoa),
foreign key (funcionalidade_testada) references funcionalidade (id_Funcionalidade)
);


-----Inserção de valores nas devidas tabelas-------
SELECT login from Usuario WHERE (Login = ?) AND (Cargo = ?)
INSERT INTO Pessoa(nome, sobrenome, dataNascimento, atribuicoes) values(?, ?, ?, ?)
SELECT id_Pessoa FROM Pessoa ORDER BY id_Pessoa DESC LIMIT 1
INSERT INTO Usuario (Pessoa_idPessoa, login, senha, cargo, linguagem) VALUES (?, ?, ?, ?, ?)

insert into Pessoa(id_Pessoa,nome,sobrenome,dataNascimento,cargo, atribuicoes) values (default,'Bianca','santos','16/05/1998',1,' Teste');
insert into Pessoa (id_Pessoa,nome,sobrenome,dataNascimento,cargo,atribuicoes) values (default,'Maria','martins','22/06/1985', 2, 'Programador');
insert into Pessoa (id_Pessoa,nome,sobrenome,dataNascimento,cargo,atribuicoes) values (default,'Pedro','marinho','29/01/1971',3,'Cadastrar');

insert into Funcionalidade (id_Funcionalidade,funcao,Software_idSoftware) values (default,'Desenhar',0);
insert into Funcionalidade (id_Funcionalidade,funcao,Software_idSoftware) values (default, 'Gerenciar o computador',1);
insert into Funcionalidade (id_Funcionalidade,funcao,Software_idSoftware) values (default, 'Escrever documentor',2);

insert into Software(id_Software,nome,dataCriacao,dono,equipe,id_analista) values (default, 'Microsoft Word','26/01/1975','Richard Brodie','Microsoft',2);
insert into Software(id_Software,nome,dataCriacao,dono,equipe,id_analista) values (default,'Microsoft Windows','15/06/1965','Bill Gates','Microsoft',2);
insert into Software(id_Software,nome,dataCriacao,dono,equipe, id_analista) values (default,' Paint','16/05/2000','Igor Martins','Microsoft',2);

insert into Teste (id_Teste,ocorrencia,area,tipo,prioridade,situacao,observacao,funcionalidade_testada,id_testador,idDesenvolvedor,EmManutencao) values (default, 'mensagem de erro', 'inicio', 'mensagem', 'alta', 'grave', 'a mensagem aparece sem muita informação',2,3,1,0);
insert into Teste (id_Teste,ocorrencia,area,tipo,prioridade,situacao,observacao,funcionalidade_testada,id_testador,idDesenvolvedor,EmManutencao) values (default, 'programa fecha', 'meio do programa', 'média', 'grave', 'sem observação','a mensagem aparece sem muita informação',3,2,3,1);
insert into Teste (id_Teste,ocorrencia,area,tipo,prioridade,situacao,observacao,funcionalidade_testada,id_testador,idDesenvolvedor,EmManutencao) values (default, 'não executa ação', 'final', 'leve', 'grave', 'sem observação','a mensagem aparece sem muita informação',2,2,1,0);


---------------- Alterando os valores nas devidas tabelas--------

update Pessoa set nome = 'Marcos' where id_Pessoa = 1;
update Pessoa set sobrenome = 'Lopes' where id_Pessoa = 0;
update Pessoa set dataNascimento = '25/01/2002' where id_Pessoa = 2;


update Software set nome = 'Microsoft Excel' where id_Software = 2;
update Software set dataCriacao = '12/05/1970 'where id_Software = 0;
update Software set dono = 'Bill Gates' where id_Software = 1;


update Funcionalidade set funcao = 'Pintar' where id_Funcionalidade = 1;
update Funcionalidade set funcao = 'Jogar' where id_Funcionalidade = 2;
update Funcionalidade set funcao = 'Desligar' where id_Funcionalidade = 3;


update Teste set ocorrencia = 'erro' where id_Teste = 2;
update Teste set tipo = 'baixa' where id_Teste = 1;
update Teste set area = 'meio do programa' where id_Teste = 0;
-------------------------------------------------------------------------------
delete from Pessoa where id_Pessoa = '5';
delete from funcionalidade where id_Funcionalidade = '6';
delete from teste where id_Teste = '10';

SELECT id_Pessoa FROM Pessoa WHERE (id_Pessoa = (SELECT Pessoa_idPessoa FROM usuario WHERE (Login = ?) AND (Senha = ?) AND (Cargo = ?)))
DELETE FROM Usuario WHERE (Pessoa_idPessoa = ?)
DELETE FROM Pessoa WHERE (id_Pessoa = ?
--------------------Seleção---------------------
select * from cargo;
select * from pessoa;
select * from software;
select * from funcionalidade;
select * from teste;

---------Criaçoes das Seleções com join, left join, right join----------------
select p.dataNascimento  from pessoa as p where id_pessoa = 2;
select f.funcao, t.area from funcionalidade as f right join teste as t on id_funcionalidade = id_teste;
select t.situacao, t.id_teste, t.tipo from teste as t order by id_testador;
SELECT * FROM Pessoa WHERE (id_Pessoa = (SELECT Pessoa_idPessoa FROM Usuario WHERE (Login = ?) AND (Cargo = ?)))
SELECT * FROM Usuario WHERE (Login = ?) AND (Cargo = ?)

SELECT ocorrencia, area, tipo FROM TESTE WHERE idTeste > 1

SELECT nome, sobrenome from pessoa WHERE idPessoa = 0;

SELECT nome, dono from software where dataCriacao = '01/10/2017';

SELECT nome, sobrenome from pessoa where idPessoa > 0;

SELECT funcao from funcionalidade where funcao = 'escrever';

SELECT nome, dono from software where dono = 'Bill Gates';


-----Seleções com AVG, Count, Sum, Group by e Having-----

select AVG(id_Pessoa) as 'Quantidade de Pessoa' from Pessoa;
select count(id_Teste) from teste;
select sum(id_Software) from software where id_analista = 2;
select funcao,count(id_Funcionalidade) as 'Quantidade de funcao' from funcionalidade group by id_Funcionalidade;
select id_testador, count(id_Teste) from teste group by id_testador having count(id_Teste) > 1;

-----Criação das view----------------------------------------
CREATE VIEW exemplo AS SELECT ocorrencia, area FROM teste;
CREATE VIEW exemplo1 AS SELECT nome, funcao, dono FROM software;
CREATE VIEW exemplo2 AS SELECT sobrenome FROM pessoa;
CREATE  VIEW exemplo3 AS SELECT funcao FROM funcionalidade;
CREATE VIEW exemplo5 AS SELECT atribuicoes FROM pessoa;

drop view exemplo;
drop view exemplo2;
drop view exemplo3;

-----Triggers-----

delimiter $$
CREATE TRIGGER tg_exemplo_  after insert on teste for each row
begin
INSERT INTO teste(idTeste, ocorrencia, area, tipo, prioridade, situacao, observacao)
VALUES (1,"Mensagem de erro", "início", "mensagem", "alta", "grave","sem observação");
end;
$$ delimiter;

delimiter $$
CREATE TRIGGER tg_exemplo1_ after insert on teste for each row 
begin
INSERT INTO teste(idTeste, ocorrencia, area, tipo, prioridade, situacao, observacao)
VALUES (2,"programa fecha", "final", "ação de execução", "mais alta", "grave","sem observação");
end;


delimiter $$
CREATE TRIGGER tg_exemplo1_ after update on teste for each row 
begin
update funcionalidade set funcao = ' Desenhar' where id_Funcionalidade = 2;
end;
$$ delimiter;


delimiter $$
CREATE TRIGGER tg_exemplo3_ after insert on teste for each row 
begin
INSERT INTO teste(idTeste, ocorrencia, area, tipo, prioridade, situacao, observacao)
VALUES (3,"Mensagem de erro", "início", "mensagem", "alta", "grave","sem observação");
end;
$$ delimiter;

delimiter $$
CREATE TRIGGER tg_exemplo3_ after delete on teste for each row 
begin
delete from Pessoa where id_Pessoa = '1';
end;
$$ delimiter;

SHOW TRIGGERS;
-------------------------------------------------------------------------------------

delimiter $$
create procedure consulta_Teste (id_Teste int) 
begin 
select * from teste where id_Teste = id_Teste;
end;
$$ delimiter;

delimiter $$ 
create procedure consulta_Pessoa (id_Pessoa int)
begin 
select * from pessoa where id_Pessoa = id_Pessoa;
end;
$$ delimiter;

delimiter $$
create procedure cosulta_Software (id_Software int)
begin
select * from software where id_Software = id_Software;
end;
$$ delimiter;

-------------------Criação dos indices------------------------


CREATE INDEX meu_indice ON usuario (cargo(30));

CREATE INDEX meu_indice1 ON teste (ocorrencia(45));

CREATE INDEX meu_indice2 ON funcionalidade (id_Funcionalidade );

CREATE INDEX meu_indice3 ON pessoa (nome(45));

CREATE INDEX meu_indice4 ON software (dono(40));

----------Criação do Blob-------------------------------------------------

create table imagem(
codigo integer auto_increment,
nome varchar (30) not null,
tipo varchar (20) not null,
dados longblob not null,
primary key (codigo)
);

insert into imagem (nome,tipo,dados) values ('Cavalo_Branco','jfif', load_file("C:\\Users\\Bianca\P\ictures\\27-05-2017\\MySQL\\MySQLServer 5.7\\Uploads\\Cavalo_Branco.jfif"));
insert into imagem (nome,tipo,dados) values ('Folha_Verde','jfif', load_file("C:\\Users\\Bianca\\Pictures\\27-05-2017\\MySQL\\MySQLServer 5.7\\Uploads\\Folha_Verde.jfif"));
insert into imagem (nome,tipo,dados) values ('Flor_Branca','png', load_file("C:\\Users\\Bianca\\Pictures\\27-05-2017\\MySQL\\MySQLServer 5.7\\Uploads\\Flor_Branca.png"));

select * from imagem;

select dados into outfile 'C:\\Users\\Bianca\P\ictures\\27-05-2017\\MySQL\\MySQLServer 5.7\\Uploads\\flower.png' from imagem where codigo = 3;


