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
  
  // métodos
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

  public void verify(){

  }

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

// [0][0] [0][1] [0][2] 
// [1][0] [1][1] [1][2]
// [2][0] [2][1] [2][2]

