package Sorting;

// // Java code to explain how to generate random 
// // password 

// // Here we are using random() method of util 
// // class in Java 
// import java.util.*; 

// class NewClass 
// { 
// 	public static void main(String[] args) 
// 	{ 
// 		// Length of your password as I have choose 
// 		// here to be 8 
// 		int length = 10; 
// 		System.out.println(Id_Password(length)); 
// 	} 

// 	// This our Password generating method 
// 	// We have use static here, so that we not to 
// 	// make any object for it 
// 	static char[] Id_Password(int len) 
// 	{ 
// 		System.out.println("Generating password using random() : "); 
// 		System.out.print("Your new password is : "); 

// 		// A strong password has Cap_chars, Lower_chars, 
// 		// numeric value and symbols. So we are using all of 
// 		// them to generate our password 
// 		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
// 		String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
// 		String numbers = "0123456789"; 
// 		String symbols = "!@#$%^&*_=+-/.?<>)"; 


// 		String values = Capital_chars + Small_chars + 
// 						numbers + symbols; 

// 		// Using random method 
// 		Random rndm_method = new Random(); 
// 		char[] password = new char[len]; 
// 		for (int i = 0; i < len; i++) 
// 		{ 
// 			// Use of charAt() method : to get character value 
// 			// Use of nextInt() as it is scanning the value as int 
// 			password[i] = 
// 			values.charAt(rndm_method.nextInt(values.length())); 

// 		} 
// 		return password; 
// 	} 
// }

import java.security.SecureRandom;

class NewClass {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(generatePassword(length));
    }

    static char[] generatePassword(int len) {
        System.out.println("Generating password using SecureRandom: ");
        System.out.print("Your new password is: ");

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
        SecureRandom random = new SecureRandom();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = characters.charAt(random.nextInt(characters.length()));
        }

        return password;
    }
}
