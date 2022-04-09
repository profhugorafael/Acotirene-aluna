package application;

import entities.Player;

public class App {
  public static void main(String[] args) {

    Player jhon = new Player("Jhon", 12);

    jhon.marcaPonto();

    jhon.setName("Maria");

    System.out.println( jhon.getName() + " score is " + jhon.score);

  }

}
