package entities;

public class Player {

  // atributos
  private String name;
  private int score;

  // construtor 
  public Player(String name) {
    this.name = name;
    this.score = 0;
  }  

  // getters and setters
  public String getName(){
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  // métodos
  public void win(){
    score++;
  }

  @Override
  public String toString() {
    return "Player [name=" + name + ", score=" + score + "]";
  }

}
