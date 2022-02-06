package com.lesson2;
    import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;



	public class ValidationOfEmail {
		
		
			   public static boolean isValidEmail(String email) {
				   String regex = "^(.+)@(.+)$";
				 //initialize the Pattern object
			       Pattern pattern = Pattern.compile(regex);
			       Matcher matcher = pattern.matcher(email);
			       return matcher.matches();
			   }

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			       // Valid email addresses      "
			       emails.add("abhishek@example.com");
			       emails.add("username@gmail.com");
			       emails.add("ramkrishna@example.com");
			       emails.add("krishnai@example.me.org");
			         // Invalid email addresses  
			       emails.add("aman.example.com");
			       emails.add("lokesh..bob#example.com");
			       emails.add(".rithi.example.com");
			       emails.add("@ravi.gmail.com");

			       for (String value : emails) {
			          System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
			       }
			       
			       System.out.println("Enter any email address to check");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}

