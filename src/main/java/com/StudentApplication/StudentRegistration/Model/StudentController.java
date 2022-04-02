package com.StudentApplication.StudentRegistration.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("Student/details")
	public List<StudentDetails> getAlltheDetails()
	{
		return service.getAlldetails();
	}
	@PostMapping("Student/details/save")
	public StudentDetails savetheDetails(@RequestBody StudentDetails details)
	{
		return service.savetheDetails(details);
	}
	@PutMapping("Student/details/update")
	public StudentDetails updateTheDetails(@RequestBody StudentDetails details)
	{
		return service.updateTheDetails(details);
	}
	@DeleteMapping("Student/details/delete/{StudentId}")
	public String DeletetheUser(@PathVariable int StudentId)
	{
		return service.DeleteUser(StudentId);
	}
	@GetMapping("Student/details/{StudentId}")
	public Optional<StudentDetails> getById(@PathVariable int StudentId)
	{
		return service.getById(StudentId);
	}
}
