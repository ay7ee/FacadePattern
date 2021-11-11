package com.company;

public class Csgo {

    public static void main(String[] args) {
	Facade facade = new Facade();


        System.out.println("Player 1");
        facade.player1();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Player 2");
        facade.player2();
    }
}
