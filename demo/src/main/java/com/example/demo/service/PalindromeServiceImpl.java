package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.PalindromeDAO;
import com.example.demo.Model.StringInfo;

import java.util.List;

@Service
public class PalindromeServiceImpl implements PalindromeService{
	//@Autowired
	private PalindromeDAO palindromeDAO;
	
	int longestPalindrome;
	String longestPalindromeString;
	
	@Autowired
	public PalindromeServiceImpl(PalindromeDAO palindromeDAO)
	{
		this.palindromeDAO = palindromeDAO;
	}
	
	public int expandAroundCenter(String str, int left, int right)
	{
		while( left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right) )
		{
			left--;
			right++;
		}
		return right - left - 1;
	}
	public void deleteIfExists()
	{
		palindromeDAO.deleteAll();
	}
	
	public boolean checkIsLongestPalindrome(StringInfo stringInfo) {
		String str = stringInfo.getString();
		int start = 0;
		int end = 0;
		System.out.println( str );
		for( int i = 0 ; i < str.length() ; i++ )
		{
			int len1 = expandAroundCenter(str, i, i);
			int len2 = expandAroundCenter(str, i, i+1);
			int len = Math.max( len1, len2 );
			System.out.println( len1 + " " + len2 + " " + end + " " + start );
			if( (end - start) < len )
			{
				start = i - (len - 1) / 2;
				end = i + len / 2;		
			}
		}
		System.out.println( (longestPalindrome) + " " + (end - start) );
		if( end - start > longestPalindrome )
		{
			longestPalindrome = end - start;
			//longestPalindromeString = str;
			deleteIfExists();
			StringInfo sInfo = new StringInfo();
			sInfo.setString( str.substring(start, end + 1) );
			saveString(sInfo);
			return true;
		}
		return false;
	}
	public void saveString(StringInfo str) {
		System.out.println( "save called with " + str.getString() + " " + str.getId() );
		palindromeDAO.save(str);
	}
	public String getString(){
		if( palindromeDAO.count() == 0 )
			return "database is empty, please make a post request first.";

		List<StringInfo> queryResult = (List<StringInfo>)palindromeDAO.findAll();
		return queryResult.get(0).getString();
		//return palindromeDAO.get();
	}

}
