/* Lógicov2: */

CREATE TABLE Habitantes (
    id_habitante LONG PRIMARY KEY,
    nomeHabitante VARCHAR (40),
    dataNascHabitante DATE,
    sobrenomeHabitante VARCHAR (40),
    rendaHabitante DECIMAL,
    CPF VARCHAR (11),
    fk_Vila_id_vila LONG
);

CREATE TABLE Vila (
    nomeVila VARCHAR (40),
    id_vila LONG PRIMARY KEY,
    gastoTotal DOUBLE,
    orcamentoVila DOUBLE
);

CREATE TABLE Relatorios (
    orcamento DOUBLE,
    gastoTotal DOUBLE,
    id_relatorio LONG PRIMARY KEY,
    fk_Vila_id_vila LONG
);

CREATE TABLE Usuario (
    Senha LONG,
    E_mail VARCHAR (40),
    Id_usuario LONG PRIMARY KEY
);

CREATE TABLE Role (
    id_role LONG PRIMARY KEY,
    Descricao VARCHAR (40)
);

CREATE TABLE E (
    FK_Habitantes_id_habitante LONG,
    FK_Usuario_Id_usuario LONG
);

CREATE TABLE Permissao (
    fk_Usuario_Id_usuario LONG,
    fk_Role_id_role LONG
);
 
ALTER TABLE Habitantes ADD CONSTRAINT FK_Habitantes_2
    FOREIGN KEY (fk_Vila_id_vila)
    REFERENCES Vila (id_vila)
    ON DELETE CASCADE;
 
ALTER TABLE Relatorios ADD CONSTRAINT FK_Relatorios_2
    FOREIGN KEY (fk_Vila_id_vila)
    REFERENCES Vila (id_vila)
    ON DELETE CASCADE;
 
ALTER TABLE E ADD CONSTRAINT FK_E_1
    FOREIGN KEY (FK_Habitantes_id_habitante)
    REFERENCES Habitantes (id_habitante)
    ON DELETE SET NULL;
 
ALTER TABLE E ADD CONSTRAINT FK_E_2
    FOREIGN KEY (FK_Usuario_Id_usuario)
    REFERENCES Usuario (Id_usuario)
    ON DELETE SET NULL;
 
ALTER TABLE Permissao ADD CONSTRAINT FK_Permissao_1
    FOREIGN KEY (fk_Usuario_Id_usuario)
    REFERENCES Usuario (Id_usuario)
    ON DELETE SET NULL;
 
ALTER TABLE Permissao ADD CONSTRAINT FK_Permissao_2
    FOREIGN KEY (fk_Role_id_role)
    REFERENCES Role (id_role)
    ON DELETE SET NULL;