package in.shubs.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shubs.binding.student;
import in.shubs.entity.students;
import in.shubs.repository.studentsrepo;
import jakarta.persistence.Entity;

@Controller
public class mycontroller {
	
	@Autowired
	private studentsrepo repo;
	
	@GetMapping("/")
	private String setdata( Model model) {
		
		extracted(model);
		
		return "index";
	}

	private void extracted(Model model) {
		List<String> courselist = new ArrayList<>()	;
		courselist.add("java");
		courselist.add("devops");
		courselist.add("AWS");
		courselist.add("Spring boot");
		courselist.add("python");
		
		List<String> timinglist = new ArrayList<>();
		timinglist.add("morning");
		timinglist.add("afternoon");
		timinglist.add("evening");
		
		student s = new student();
		
		model.addAttribute("courses", courselist);
		model.addAttribute("timings", timinglist);
		model.addAttribute("student", s);
	}
	
	@PostMapping("/save")
	public String handlesubmit(student s,Model model) {
		System.out.println(s);
		
		extracted(model);
		students stud = new students();
		
		BeanUtils.copyProperties(s, stud);
		stud.setTimings(Arrays.toString(s.getTimings()));
		repo.save(stud);
		
		model.addAttribute("msg", "form data saved");
		return "index";
	}
	
	@GetMapping("/viewStudents")
	public String getvalue(Model model) {
		
		List<students>studentlist = repo.findAll();
		model.addAttribute("stud", studentlist);
		return "data";
	}

}
