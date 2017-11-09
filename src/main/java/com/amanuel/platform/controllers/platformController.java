package com.amanuel.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class platformController {
	private String setup = "";
	private String forms = "";
	private String cards = "";
	private String advanced = "";
	private String binary = "";
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/m/{chapter}/0553/{assignmentNumber}")
	public String lesson(@PathVariable("chapter") String chapter, @PathVariable("assignmentNumber") String assignmentNumber , Model model) {
		if( assignmentNumber.equals("0733")) {
			this.setup = "Fortran Set up...., this holds set up.";
			model.addAttribute("links", this.setup);
			return "lessonPage";
		}
		
		else if(assignmentNumber.equals("0342")) {
			this.cards = "Fortran cards....., this holds cards.";
			model.addAttribute("links", this.cards);
			return "lessonPage";
		}
		else if(assignmentNumber.equals("0348")) {
			this.advanced = "Fortran Advanced....., this holds advanced.";
			model.addAttribute("links", this.advanced);
			return "lessonPage";
		}
		
		return "lessonPage";
	}
	@RequestMapping("/m/{lessonChap}/0483/{lessonAssignmentNum}")
	public String assignement(@PathVariable("lessonChap") String chap, @PathVariable("lessonAssignmentNum") String assignmentNum, Model model) {
		if( chap.equals("38") && assignmentNum.equals("0345")) {
			this.forms = "Fortran Forms...., this holds forms.";
			model.addAttribute("links", this.forms);
			return "assignmentPage";
		}
		else if(chap.equals("26") && assignmentNum.equals("2342")) {
			this.binary = "Fortran Binary...., this holds binary.";
			model.addAttribute("links", this.binary);
			return "assignmentPage";
		}
		return "assignmentPage";
	}
}
