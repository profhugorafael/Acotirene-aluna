package com.acotirene.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.acotirene.quiz.entities.Question;

@Controller
public class QuestionControler {

	@GetMapping("/index")
	public String GetForm(Model model) {
		model.addAttribute("Question", new Question());
		return "index";
	}
	
	@PostMapping("/submition")
	public String PostForm(@ModelAttribute Question question, BindingResult result, Model model) {
		model.addAttribute("Question", question);
		return "submition";
	}
	
}
