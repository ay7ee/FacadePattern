package com.company;

public class Facade {
    Gamer gamer = new Gamer();
    Game game = new Game();
    PrimeAcc primeAcc = new PrimeAcc();

    public void player1(){
        primeAcc.withPrimeAccoung();
        game.gaming();
        gamer.playGame(primeAcc);
    }
    public void player2(){
        primeAcc.withoutPrimeAccount();
        game.gaming();
        gamer.playGame(primeAcc);
    }
}
