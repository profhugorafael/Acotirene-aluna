package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
 
  // atributes
  private String question;
  private List<String> options;
  private String correctOption;
  Scanner scanner = new Scanner(System.in);
  
  // cosntructor
  public Question(String question){
      options = new ArrayList<>();
      addQuestion(question);
  }

  // getters and setters
  public String getQuestion() {
    return question;
  }

  public List<String> getOptions() {
    return options;
  }

  public String getCorrectOption() {
    return correctOption;
  }
    
  // methods
  public void addQuestion(String question){ 
    this.question = question;
    
    // minimum of 1 option
    addOption();
    String choice;

    do{ 
      choice = scanner.nextLine();
      System.out.print("do you want to add new option? (y/n) : ");

      if(choice == "n") break;
      addOption();        
    }while( true );

  }

  public void addOption(){
    System.out.println("Insert a new option: ");
    options.add( scanner.nextLine() );
  }

  public void setCorrect(String optionLetter){
    int numberOption = Integer.valueOf( optionLetter.toUpperCase().charAt(0) );
    int equivalentA = Integer.valueOf("A");

    numberOption -= equivalentA;

    correctOption = options.get(numberOption);
  }


}
