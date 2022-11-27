USE  tachan_db
GO
BEGIN TRAN
/*Création de la table servant à persister les parties de tachan*/
CREATE TABLE ta_game (
	idgame int PRIMARY KEY IDENTITY(1,1),
	dategame date not null,
	idplayer int not null
);
CREATE TABLE ta_player (
	idplayer int PRIMARY KEY IDENTITY(1,1),
	nickname varchar(50) not null,
	age TINYINT CHECK (age > 0)
);
CREATE TABLE ta_round (
	idround int PRIMARY KEY IDENTITY(1,1),
	idgame int not null ,
	idsequence int not null
);
CREATE TABLE ta_sequence (
	idsequence int PRIMARY KEY IDENTITY(1,1),
	idround int not null ,
	typeseq varchar(5),
);
CREATE TABLE ta_sequence_couleur (
	idsequence int,
	idcouleur int,
	PRIMARY KEY (idsequence,idcouleur)
);
CREATE TABLE ta_couleur (
	idcouleur int PRIMARY KEY IDENTITY(1,1),
	designation varchar(20),
	red TINYINT CHECK (red <= 255 AND red >=0),
	green TINYINT CHECK (green <= 255 AND green >=0),
	blue TINYINT CHECK (blue <= 255 AND blue >=0),
);
CREATE TABLE ta_resultat (
	idresultat int PRIMARY KEY IDENTITY(1,1),
	idround int,
	idsequence int,
	winner varchar(5)
);

/*ROLLBACK TRAN*/
COMMIT TRAN