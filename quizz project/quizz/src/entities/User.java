package entities;

import java.util.ArrayList;
import java.util.List;

import services.Match;

public class User {
  
  private List<Match> matchmakes;

  public User(){
    matchmakes = new ArrayList<>();
  }

}
