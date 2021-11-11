package com.company;

public class Gamer {
    public void playGame(PrimeAcc primeAcc){
        if(primeAcc.isPrimeAccount()){
            System.out.println("Relax the game without cheaters");
        }
        else{
            System.out.println("Maybe in game there will be cheaters...");
        }
    }
}
