package application;

import services.Match;

public class GameApp {

  public static void main(String[] args) {

    Match round = new Match(1);
    round.play();
    
    System.out.println("|||| YOUR SCORE = " + round.scoreResult() + "|||");
    System.out.println("heeere");

  }

}
