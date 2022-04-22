package services;

import java.util.ArrayList;
import java.util.List;

import entities.Question;

public class Match {
  
  private List<Question> questions;
  private List<String> userAnswers;

  public Match(){
    questions = new ArrayList<>();
    setQuestions();
  }

  public void setQuestions(){
  }

  public void play(){
  }

  public int scoreResult(){
    return 0;
  }

}
