package fr.eni.tachan.test;

import fr.eni.tachan.bo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class Testbo {


    public static void main(String[] args) {

        //Instanciation des objets
        Player p1 = new Player("bruno",41);
        Game game = new Game(p1, LocalDate.of(2022, 12, 2));

        Couleur c1 = new Couleur("rouge","10,10,10");
        Couleur c2 = new Couleur("vert","100,100,100");
        Couleur c3 = new Couleur("jaune","50,50,50");

        Sequence s1 = new Sequence(TypeSequence.PLAYER);
        s1.setCouleurs(c1);
        s1.setCouleurs(c2);

        Sequence s2 = new Sequence(TypeSequence.COMPUTER);
        s1.setCouleurs(c2);
        s1.setCouleurs(c3);

        Round r1 = new Round(s1,game);
        Resultat re1 = new Resultat(s1,r1);

        System.out.println(p1);
        System.out.println(game);
        System.out.println(c1 + " " + c2 + " " + c3);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(r1);
        System.out.println(re1);
        System.out.println(game);

    }
    @Test
    public void TestBOPlayer () {
        Player p1 = new Player(1,"bruno",41);
        Assertions.assertEquals(1, p1.getIdPlayer());
        Assertions.assertEquals("bruno", p1.getNickname());
        Assertions.assertEquals(41, p1.getAge());
        p1.setAge(30);
        Assertions.assertEquals(30, p1.getAge());
        p1.setIdPlayer(3);
        Assertions.assertEquals(3, p1.getIdPlayer());
        p1.setNickname("Pierre");
        Assertions.assertEquals("Pierre", p1.getNickname());
    }
    //TODO finir les tests unitaires de la BO
    @Test
    public void TestBOGame () {
        Player p1 = new Player("bruno",41);
        Game game = new Game(p1, LocalDate.of(2022, 12, 2));
        Assertions.assertEquals(LocalDate.of(2022, 12, 2), game.getDateGame());
        Assertions.assertEquals(p1, game.getPlayer());
    }

    @Test
    public void TestBOSequence() {
        Couleur c1 = new Couleur("rouge","10,10,10");
        Couleur c2 = new Couleur("vert","100,100,100");
        Couleur c3 = new Couleur("jaune","50,50,50");
        Sequence s1 = new Sequence(TypeSequence.PLAYER);

        Assertions.assertEquals(TypeSequence.PLAYER, s1.getType());
    }

}
