package com.acotirene.quiz.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acotirene.quiz.entities.enums.StudyField;

public class Question {
 
  // atributes
  private String question;
  private List<String> options;
  private String correctOption;
  private String correctAnswer;
  private StudyField field;
  
  // cosntructors
  
  public Question() {
	  options = new ArrayList<>();
  }

  public Question(String question, StudyField field){
    this.question = question;
    this.field = field;
    
    options = new ArrayList<>();
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

  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public StudyField getField() {
    return field;
  }
  
   
  public void setQuestion(String question) {
	this.question = question;
}

public void setOptions(List<String> options) {
	this.options = options;
}

public void setCorrectOption(String correctOption) {
	this.correctOption = correctOption;
}

public void setCorrectAnswer(String correctAnswer) {
	this.correctAnswer = correctAnswer;
}

public void setField(StudyField field) {
	this.field = field;
}

public void addOption(String newOption){
    options.add( newOption );
  }

  public void setCorrect(String optionLetter){
    correctOption = optionLetter.toUpperCase();
    int numberOption = Integer.valueOf( optionLetter.toUpperCase().charAt(0) ); // 96
    int equivalentA = Integer.valueOf("A".charAt(0) ); // 95

    numberOption -= equivalentA; // 1

    correctAnswer = options.get(numberOption); // 
  }

  public String toString(){
    String aux = "## Question: " + question + "\n";
    char c = 'A';

    for(int i=0; i<options.size(); i++){
      aux +=  "(" + c + ") " 
              + options.get(i);

      if( i!= options.size() - 1) aux += "\n";
      c++;
    }
    
    return aux;
  }


}