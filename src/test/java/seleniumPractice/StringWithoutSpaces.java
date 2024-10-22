package seleniumPractice;

public class StringWithoutSpaces {

	public static void main(String[] args) {
		//print given string wothout spaces
		
		//String str1= "Java is a Object Oriented Programming Language";
		String str1= "t s t ng";
		String str2=str1.replaceAll(" ", "");
		System.out.println("string with spaces: "+ str1);
		System.out.println("String without spaces: "+ str2);

	}

}
