package com.StudentApplication.StudentRegistration.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public List<StudentDetails> getAlldetails()
	{
		return repo.findAll();
	}
	
	public StudentDetails savetheDetails(@RequestBody StudentDetails details)
	{
		return repo.save(details);
	}
	
	public StudentDetails updateTheDetails(@RequestBody StudentDetails details)
	{
		return repo.save(details);
	}
	public String DeleteUser(@PathVariable int StudentId)
	{
		 repo.deleteById(StudentId);
		return "deleted Student: "+StudentId+"  Successfully";
	}

	public Optional<StudentDetails> getById(@PathVariable int StudentId)
	{
		return repo.findById(StudentId);
	}
}
