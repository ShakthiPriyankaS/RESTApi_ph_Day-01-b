package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Address;

@RestController
public class ApiController1 {
	
	@GetMapping("di")
	
public List<Address> fun()
{
	return Arrays.asList(new Address("shakthi priyanka",15,"png Nagar",642002,"Mahalingapuram","Coimbatore","TamilNadu","India"));
}
}
