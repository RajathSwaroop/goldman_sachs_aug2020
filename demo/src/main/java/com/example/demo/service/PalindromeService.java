package com.example.demo.service;

import com.example.demo.Model.StringInfo;

public interface PalindromeService {
	boolean checkIsLongestPalindrome(StringInfo stringInfo);
	void saveString(StringInfo str);
	void deleteIfExists();
	String getString();
	//void deleteString(String str);
}
