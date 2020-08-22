package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StringInfo;
import com.example.demo.service.PalindromeService;

@RestController
@RequestMapping("/palindrome_checker")
public class StringController {

	//@Autowired
	private PalindromeService palindromeService;
	
	@Autowired
	public StringController(PalindromeService palindromeService) {
		// TODO Auto-generated constructor stub
		this.palindromeService = palindromeService;
	}
	@GetMapping("/longest_palindrome")
	public String get() {
		//return employeeService.get();
		return palindromeService.getString();
	}
	
	@PostMapping("/palindrome")
	public String save(@RequestBody StringInfo stringInfo ) {
		//employeeService.save(employeeObj);
		//return employeeObj;
		if( palindromeService.checkIsLongestPalindrome(stringInfo) )
		{
			return " The longest palindromic substring found so far is: " + palindromeService.getString();
		}	
		
		return "This is not the longest palindromic string";
	}
}
