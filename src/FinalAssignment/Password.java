package FinalAssignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	static ArrayList<String> errors = new ArrayList<String>();

	public static void main(String[] args) {

		try (Scanner myObj = new Scanner(System.in)) 
			{
			System.out.print("1. A user name must have at least six characters.\n"
					+ "2. A user name consists of only letters.\n"
					+ "3. A user name must start with an uppercase English alphabet A to Z.\n"
					+ "Enter a user name (According to the above T&C): ");
			
			String name = myObj.nextLine();
			System.out.println(name);
			String uppercase = null;	

			System.out.print("1. A password must have at least eight characters.\n"
					+ "2. A password consists of only letters and digits.\n"
					+ "3. A password must contain at least two digits \n"
					+ "4. A Password cannot be any types of parentheses or whitespaces \n"
					+ "Input a password (According to the above T&C): ");

			String password = myObj.nextLine();

			validateUserName(name);
			validatePassword(password);
			validateIfUserNameAndPasswordNotSame(name, password);

			if (errors.size() != 0) {
				System.out.println("found list of errors here..");
				System.out.println(errors.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static ArrayList<String> validatePassword(String password) {
		// TODO Auto-generated method stub
		if (password == null || password.isEmpty()) {
			errors.add("password can not be blank.");
		}

		if (password.length() > 256 || password.length() < 15) {

			errors.add("password can not be less than 8 or greater than 256");
		}

		if (!Character.isUpperCase(password.codePointAt(0))) {
			errors.add("password name first letter should be upper case");
		}

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (is_Numeric(ch))
				numCount++;
			else if (is_Letter(ch))
				charCount++;
			else {

			}
		}

		if (numCount == 0)
			errors.add("password should contain atleast one number");

		if (charCount == 0)
			errors.add("password should contain atleast one charater");

		return errors;

	}

	static ArrayList<String> validateUserName(String userName) {

		if (userName == null || userName.isEmpty()) {
			errors.add("user name can not be blank.");
		}

		if (userName.length() > 15 || userName.length() < 6) {

			errors.add("user length can not be less than 6 or greater than 15");
		}

		if (!Character.isUpperCase(userName.codePointAt(0))) {
			errors.add("user name first letter should be upper case");
		}

		return errors;

	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean is_Numeric(char ch) {

		return (ch >= '0' && ch <= '9');
	}

	private static ArrayList<String> validateIfUserNameAndPasswordNotSame(String userName, String password) {
		if (userName.equals(password)) {
			errors.add("userand password can not be same");
		}
		return errors;
	}

}