package entities;

public class Player {
  
  // atributos
  private String name;
  private int score;

  // construtor 
  public Player(String name, int score) {
    this.name = name;
    this.score = score;
  }  

  public Player(){
  }

  // getters and setters
  public String getName(){
    return name;
  }

  public int getScore() {
    return score;
  }

  // métodos
  public void marcaPonto(){
    System.out.println("entrando na marca ponto");
    score++; // soma 1 na variável score
    System.out.println("saindo da marca ponto");
  }


}
