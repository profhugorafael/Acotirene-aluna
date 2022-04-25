package com.example.model.entities;

@Entity
public class Player extends User{
	
	
	@
	private int id;
	private int score;
	private int[] correctAnswersPerStudyField; 

	public Player(int id, String name, int typeOfUser) {
		super(id, name, typeOfUser);
		// foreign key	problem	
		correctAnswersPerStudyField = new int[4];
	}
	
	
	
}
