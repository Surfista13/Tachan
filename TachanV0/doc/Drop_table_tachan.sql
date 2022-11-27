USE  tachan_db
GO
BEGIN TRAN

DROP TABLE ta_couleur;
DROP TABLE ta_game;
DROP TABLE ta_player;
DROP TABLE ta_resultat;
DROP TABLE ta_round;
DROP TABLE ta_sequence;
DROP TABLE ta_sequence_couleur;

ROLLBACK;