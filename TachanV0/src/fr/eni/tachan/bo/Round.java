package fr.eni.tachan.bo;

public class Round {

    //Association bidirectionnelle avec Game et unidirectionnelle avec Sequence

    //Déclaration
    private int idRound = 0;
    private Sequence sequenceAJouer;
    private Game game;

    //Constructeurs
    public Round(int idRound, Sequence sequenceAJouer, Game game) {
        this.idRound = idRound;
        this.sequenceAJouer = sequenceAJouer;
        this.game = game;
        game.setRounds(this);
    }

    public Round(Sequence sequenceAJouer, Game game) {
        this.sequenceAJouer = sequenceAJouer;
        this.game = game;
        game.setRounds(this);

    }

    //Getters Setters
    public int getIdRound() {
        return idRound;
    }

    public void setIdRound(int idRound) {
        this.idRound = idRound;
    }

    public Sequence getSequenceAJouer() {
        return sequenceAJouer;
    }

    public void setSequenceAJouer(Sequence sequenceAJouer) {
        this.sequenceAJouer = sequenceAJouer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    //TODO a supprimer avant prod

    @Override
    public String toString() {
        return "Round{" +
                "idRound=" + idRound +
                ", sequenceAJouer=" + sequenceAJouer +
                '}';
    }
}
