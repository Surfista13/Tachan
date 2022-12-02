package fr.eni.tachan.bo;

public class Couleur {
    //Déclaration
    int idCouleur = 0;

    String couleur = "";

    String rgb = "";


    //Constructeurs
    public Couleur(int idCouleur, String couleur,String rgb) {
        this.idCouleur = idCouleur;
        this.couleur = couleur;
        this.rgb = rgb;
    }

    public Couleur(String couleur,String rgb) {
        this.couleur = couleur;
        this.rgb = rgb;
    }

    //Getters Setters
    public int getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(int idCouleur) {
        this.idCouleur = idCouleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    //TODO a supprimer avant prod
    @Override
    public String toString() {
        return "Couleur{" +
                "idCouleur=" + idCouleur +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
