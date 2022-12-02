package fr.eni.tachan.bo;

public class Resultat {
    //Association unidirectionnelle avec round et sequence

    //Déclaration
    Sequence sequenceJouee;
    boolean isWinner = false;
    Round round;

    //Constructeurs
    public Resultat(Sequence sequenceJouée, Round round) {
        this.sequenceJouee = sequenceJouée;
        this.round = round;
    }

    //Getters Setters
    public Sequence getSequenceJouée() {
        return sequenceJouee;
    }

    public void setSequenceJouée(Sequence sequenceJouée) {
        this.sequenceJouee = sequenceJouée;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    //TODO a supprimer avant prod
    @Override
    public String toString() {
        return "Resultat{" +
                "sequenceJouée=" + sequenceJouee +
                ", isWinner=" + isWinner +
                ", round=" + round +
                '}';
    }
}
