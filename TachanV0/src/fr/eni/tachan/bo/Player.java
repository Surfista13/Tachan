package fr.eni.tachan.bo;

public class Player {

    //Le player est crée en premier avant la game. Association unidirectionnelle.
    int idPlayer;
    String nickname = "";
    int age = 0;

    //Constructeurs
    public Player(int idPlayer, String nickname, int age) {
        this.idPlayer = idPlayer;
        this.nickname = nickname;
        this.age = age;

    }

    public Player(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    //Getters Setters
    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //TODO a supprimer avant mise en prod
    @Override
    public String toString() {
        return "Player{" +
                "idPlayer=" + idPlayer +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
