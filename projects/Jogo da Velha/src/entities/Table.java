package entities;

public class Table {
 
  // atributos
  private Player player1; // x
  private Player player2; // o
  private int dimension;
  private String[][] table;
  private String winner;

  // constructors
  public Table(Player player1, Player player2, int dimension) {
    this.player1 = player1;
    this.player2 = player2;
    this.dimension = dimension;
    table = new String[dimension][dimension];
  }
  
  // ----------------------------------------
  // play methods
  // play, reset, match

  public boolean play(int linha, int coluna, String attemp){
    linha--;
    coluna--;

    if(table[linha][coluna] == null){
      table[linha][coluna] = attemp;
      return true;
    } else return false; 

  }

  public void reset(){
    table = new String[dimension][dimension]; 

    if( winner.equals("X")) 
      player1.win();
    else if ( winner.equals("O") ) 
      player2.win();

    winner = null;
  }

  public void match(){
    if(winner == "X") player1.win();
    else if(winner == "0") player2.win();
    else System.out.println("No winner!");
  }

  // ----------------------------------------
  // verify methods
  // to find the winner

  public boolean verify(){

    if(table[0][0] == null) return false;

    // veryfing main diagonal
    winner = verifyMainDiagonal();
    if(winner != null) return true;

    winner = verifySecundaryDiagonal();
    if(winner != null) return true;

    winner = verifyColumns();
    if(winner != null ) return true;

    winner = verifyLines();
    if(winner != null) return true;

    if( isFull() ){
      winner = "-";
      match();
      return true;
    } return false;

  }

  // ----------------------------------------
  // testing methods
  // dont modify

  private boolean isFull(){
    for(int i=0; i<dimension; i++){
      for(int j=0; j<dimension; j++){
        if(table[i][j] == null) 
          return false;
      }
    }

    return true;
  }

  private String verifyColumns() {
    String hasWinner = null;

    for(int i=0; i<dimension; i++){
      String first = table[0][i];
      hasWinner = first; // reset

      for(int j=0; j<dimension; j++){
        if(table[j][i] == null || table[j][i] != first)
          hasWinner = null;
      }

      if(hasWinner != null) break; // already has a winner
    }

    return hasWinner;
  }

  private String verifyLines() {
    String hasWinner = null;

    for(int i=0; i<dimension; i++){
      String first = table[i][0];
      hasWinner = first; // reset

      for(int j=0; j<dimension; j++){
        if(table[i][j] == null || table[i][j] != first)
          hasWinner = null;
      }

      if(hasWinner != null) break; // already has a winner
    }

    return hasWinner;
  }

  private String verifySecundaryDiagonal() {
    String first = table[0][dimension-1];
    String hasWinner = first;

    for(int i=1; i<dimension; i++){
      if(table[i][dimension-i-1] == null || table[i][dimension-i-1] != first)
        hasWinner = null;
    }

    return hasWinner;
  }

  private String verifyMainDiagonal(){
    String first = table[0][0];
    String hasWinner = first;

    for(int i=1; i<dimension; i++){
      if(table[i][i] == null || table[i][i] != first)
        hasWinner = null;
    }

    return hasWinner;
  }

  // ----------------------------------------
  // printing methods

  public String showScores(){
    String aux = "------------------------\n";

    aux += player1 + "\n";
    aux += player2 + "\n";
    
    aux += "------------------------\n";

    return aux;
  }
  
  // to String
  @Override
  public String toString() {

    String aux = "";

    for(int i=0; i<dimension; i++){
      for(int j=0; j<dimension; j++){
        if(table[i][j] == null){
         aux += "  ";
        }else{
          aux += table[i][j] + " " ;
        }

        if(j != dimension-1) {
          aux += "| ";
        }
      }

      // new line
      aux += "\n";
    }


    return aux;
  }
  

}