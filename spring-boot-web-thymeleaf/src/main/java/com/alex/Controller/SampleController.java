package com.alex.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.alex.entity.jpa.Person;
import com.alex.entity.repository.PersonJPARespository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SampleController {

	@Value("${welcome.message:test}")
	private String message;
	
	@Autowired
	private PersonJPARespository dao;
	
	@GetMapping("/hello")
	public ModelAndView hello(){
		Person person=null;
		ModelAndView model = new ModelAndView();
		try{
			person = new Person();
			person.setId("1234");
			person.setName("Alex");
			dao.save(person);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		model.addObject("message", message+", "+person);
		model.setViewName("welcome");
		return model;
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Map<String, Object> model, @PathVariable int id){
		Person person=null;
		try{
			person = new Person(id);
			dao.delete(person);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		model.put("message", message);
		return "welcome";
	}

}
