package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        String numString1 = "";
        String numString2 = "";
        String numString3 = "";
        int num3 = num1 * num2;
        numString3 = String.valueOf(num3);
        numString1 = String.valueOf(num1);
        numString2 = String.valueOf(num2);
     	String returnString = numString1 + " x " + numString2 + " = " + numString3;
    	
    	return returnString;
    }
    
    public static boolean isPrime(int num) {
    	boolean primeTOF = true;
    	for (int i = 2; i < num-1; i++) {
			if(num%i == 0) {
				primeTOF = false;
			}
		}
    	
    	return primeTOF;
    }
    
    public static boolean isSquare(int num) {
    	boolean isSquare = false;
    	for (int i = 1; i <= num; i++) {
			if(num/i == i) {
				isSquare = true;
			}
		}
    	
    
  
    	return isSquare;
    }
    
    public static boolean isCube(int num) {
    	boolean isCube = false;
    	for(double i =1;i <= num; i++) {
    		if((num/i)/i == i) {
    			isCube = true;
    		System.out.println(i + " "+num);
    		}
    	}
    	return isCube;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
