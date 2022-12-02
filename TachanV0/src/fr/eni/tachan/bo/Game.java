package fr.eni.tachan.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    // Pour créer une game il faut un player et une liste vide de round. Association bidirectionnelle avec round et unidirectionnelle avec Player.

    //Déclaration variables
    int igGame  = 0;
    Player player;
    LocalDate dateGame;
    List<Round> rounds;

    //Constructeurs
    public Game(int igGame, Player player, LocalDate dateGame) {
        this.igGame = igGame;
        this.player = player;
        this.dateGame = dateGame;
        this.rounds = new ArrayList<Round>();
    }

    public Game(Player player, LocalDate dateGame) {
        this.player = player;
        this.dateGame = dateGame;
        this.rounds = new ArrayList<Round>();
    }

    //Getters Setters
    public int getIgGame() {
        return igGame;
    }

    public void setIgGame(int igGame) {
        this.igGame = igGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public LocalDate getDateGame() {
        return dateGame;
    }

    public void setDateGame(LocalDate dateGame) {
        this.dateGame = dateGame;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(Round round) {
        this.rounds.add(round);
    }

    //TODO a supprimer avant prod
    @Override
    public String toString() {
        return "Game{" +
                "igGame=" + igGame +
                ", player=" + player +
                ", dateGame=" + dateGame +
                ",rounds =" + rounds +
                '}';
    }
}
