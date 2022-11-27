USE  tachan_db
GO
BEGIN TRAN

ALTER TABLE ta_game 
DROP CONSTRAINT FK_game_player_id;

ALTER TABLE ta_round
DROP CONSTRAINT FK_round_game_id;

ALTER TABLE ta_sequence
DROP CONSTRAINT FK_sequence_round_id;

ALTER TABLE ta_sequence_couleur
DROP CONSTRAINT FK_sequence_couleur_sequence_idsequence;
ALTER TABLE ta_sequence_couleur
DROP CONSTRAINT FK_sequence_couleur_couleur_idcouleur;

ALTER TABLE ta_resultat
DROP CONSTRAINT FK_resultat_round_id;
ALTER TABLE ta_resultat
DROP CONSTRAINT FK_resultat_sequence_id;
	
ROLLBACK TRAN
/*COMMIT TRAN*/