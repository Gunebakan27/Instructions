package day07stringmanipulations;


public class StringManipulatingExm2 {

	public static void main(String[] args) {
//		4)Check the password according to the given rule
//		a)No space character at the beginning and at the end
//		b)It must contain at least 1 digit
//		c)It must contain at least 1 lowercase letter
//		d)It must contain at least 1 uppercase letter
//		e)It must contain at least 1 character different from digits and letters
//
//		String psw="vdAf+8gdf";
//		boolean fc=psw.startsWith(" ");
//		boolean ec=psw.endsWith(" ");
//		
//		int dcn=psw.replaceAll("\\D", "").length();
//		int lcn=psw.replaceAll("[^a-z]", "").length();
//		int ucn=psw.replaceAll("[^A-Z]", "").length();
//		int ocn=psw.replaceAll("[^a-zA-Z0-9]", "").length();
//	
//		if(fc==true&&ec==true&&dcn!=0&&lcn!=0&&ucn!=0) {System.out.println("it is created");
//		}
//		if(fc) {
//			System.out.println("Your Password is invalid. Do not use Space at the beginning");
//			}
//		if (ec) {
//			System.out.println("Your Password is invalid. Do not use Space at the end");
//			}
//		if (dcn==0) {
//			System.out.println("Your Password is invalid. Use at least 1 digit");
//			}
//		if (lcn==0) {
//			System.out.println("Your Password is invalid. Use at least 1 lower case");
//			}
//		if (ucn==0) {
//			System.out.println("Your Password is invalid. Use at least 1 upper case");
//			}
//		if (ocn==0) {
//			System.out.println("Your Password is invalid. Use at least different character");
//			}
		
		String pwd="123sad/";
		boolean isFirstCharSpace=pwd.startsWith(" ");
		
		
		boolean isLastCharSpace=pwd.endsWith(" ");
		
		
		int numOfDigitCharacters=pwd.replaceAll("\\D", "").length();
		
		int numOfLowercaseChars=pwd.replaceAll("[^a-z]", "").length();
		
		int numOfUppercaseChars=pwd.replaceAll("[^A-Z]", "").length();
		
		int numOfCharsDifferentFromLetterAndDigits=pwd.replaceAll("[a-zA-Z0-9]", "").length();
		
		if(isFirstCharSpace) {
			System.out.println("Your Password is invalid. Do not use Space at the beginning");
			}
	if(isLastCharSpace) {
		System.out.println("Your Password is invalid. Do not use Space at the end");
	}
	if(numOfDigitCharacters==0) {
		System.out.println("Your Password is invalid. Use at least 1 digit");
	}
	if(numOfLowercaseChars==0) {
		System.out.println("Your Password is invalid. Use at least 1 lower case");
	}

		if(numOfUppercaseChars==0) {
			System.out.println("Your Password is invalid. Use at least 1 uper case");
		}

	if (numOfCharsDifferentFromLetterAndDigits==0) {
		System.out.println("Your Password is invalid. Use at least 1 character different form letters and digits");
	}
	else {System.out.println("ok");
	
	}
	}

}
