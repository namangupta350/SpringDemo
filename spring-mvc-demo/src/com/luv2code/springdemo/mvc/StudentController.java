package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		//create a student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);		
		
		 // add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute ("student") Student thestudent,BindingResult theBindingResult)
	{
		
		System.out.println("First Name"+thestudent.getFirstName() 
							+"Last Name"+thestudent.getLastName());
		
		System.out.println( 
		"Last Name : |"+thestudent.getLastName()+"|");
		
		System.out.println("Fress Pass"+thestudent.getFreePass());
		
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}else {
		
		return "student-confirmation";
		}
	}
}
