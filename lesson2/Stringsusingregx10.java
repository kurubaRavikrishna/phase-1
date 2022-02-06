package com.lesson2;
import java.util.regex.*;

public class Stringsusingregx10{

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Ravi Krishna";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
}
}
