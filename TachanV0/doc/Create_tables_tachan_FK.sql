USE  tachan_db
GO
BEGIN TRAN

ALTER TABLE ta_game 
ADD CONSTRAINT FK_game_player_id FOREIGN KEY (idplayer) REFERENCES ta_player(idplayer);

ALTER TABLE ta_round
ADD CONSTRAINT FK_round_game_id FOREIGN KEY (idgame) REFERENCES ta_game(idgame);

ALTER TABLE ta_sequence
ADD CONSTRAINT FK_sequence_round_id FOREIGN KEY (idround) REFERENCES ta_round (idround);

ALTER TABLE ta_sequence_couleur
ADD CONSTRAINT FK_sequence_couleur_sequence_idsequence FOREIGN KEY (idsequence) REFERENCES ta_sequence (idsequence);
ALTER TABLE ta_sequence_couleur
ADD CONSTRAINT FK_sequence_couleur_couleur_idcouleur FOREIGN KEY (idcouleur) REFERENCES ta_couleur (idcouleur);

ALTER TABLE ta_resultat
ADD CONSTRAINT FK_resultat_round_id FOREIGN KEY(idround) REFERENCES ta_round(idround);
ALTER TABLE ta_resultat
ADD CONSTRAINT FK_resultat_sequence_id FOREIGN KEY(idsequence) REFERENCES ta_sequence(idsequence);	
	
/*ROLLBACK TRAN*/
COMMIT TRAN