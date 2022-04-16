package application;

import entities.Player;
import entities.Table;

public class App {
  public static void main(String[] args) {
    
    // Player p1 = new Player('Jhon');
    // Player p2 = new Player('Marta');
    // Table jogo = new Table(p1, p2, 3);

    Table jogo = new Table( new Player("Jhon") ,
                            new Player("Marta"),
                            3 );

    jogo.play(1, 1, "X");
    System.out.println(jogo);
    System.out.println(jogo.verify());

    jogo.play(2, 2, "0");
    System.out.println(jogo);
    System.out.println(jogo.verify());
    
    jogo.play(2, 1, "X");
    System.out.println(jogo);
    System.out.println(jogo.verify());

    jogo.play(2, 3, "X");
    System.out.println(jogo);
    System.out.println(jogo.verify());

    jogo.play(1, 3, "0");
    System.out.println(jogo);
    System.out.println(jogo.verify());
    
    jogo.play(3, 1, "0");
    System.out.println(jogo);
    System.out.println(jogo.verify());
    
  
    System.out.println( jogo.showScores() );

  }

}
