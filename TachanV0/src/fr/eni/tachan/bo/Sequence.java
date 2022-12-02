package fr.eni.tachan.bo;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    //Association unidirectionnelle avec couleurs

    //Déclaration
    int idSequence = 0;
    List<Couleur> couleurs;
    TypeSequence type;

    //Constructeurs
    public Sequence(int idSequence, TypeSequence type) {
        this.idSequence = idSequence;
        this.type = type;
        this.couleurs = new ArrayList<Couleur>();
    }

    public Sequence(TypeSequence type) {
        this.type = type;
        this.couleurs = new ArrayList<Couleur>();
    }

    //Getters Setters
    public int getIdSequence() {
        return idSequence;
    }

    public void setIdSequence(int idSequence) {
        this.idSequence = idSequence;
    }

    public List<Couleur> getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(Couleur couleur) {
        this.couleurs.add(couleur);
    }

    public TypeSequence getType() {
        return type;
    }

    public void setType(TypeSequence type) {
        this.type = type;
    }

    //TODO a supprimer avant prod
    @Override
    public String toString() {
        return "Sequence{" +
                "idSequence=" + idSequence +
                ", couleurs=" + couleurs +
                ", type='" + type + '\'' +
                '}';
    }
}
