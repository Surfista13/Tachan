package fr.eni.tachan.test;

import fr.eni.tachan.bo.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Testbo {


    Game game = new Game();


    @Test
    public void Testg (){
        int result = game.add(2,2) ;
        Assertions.assertEquals(4,result );
    }

}
