/*
Name: Kendall Brogle
Date: 10/4/2022
Assignment: Number System Conversion
 */

import java.util.Scanner;

public class part2 {

    public static String bin = "bin"; 
    public static String dec = "dec";
    public static String oct = "oct";
    public static String hex = "hex";

    public static void binToDec(String val, String type) {
        
        int number = Integer.parseInt(val);
        int answer = 0;
        int y = number;
        int base = 1;
        while ( y > 0) {
            int last = y % 10;
            y = y / 10;
            answer += last * base;
            base = base * 2;

        }

        
        if (type.equals(hex)) {
            decToHex(answer);
        }

        if (type.equals(oct)) {
            decToOct(answer);

        }
        

        if (type.equals(dec)) {
            System.out.print("The result is: " + answer);
        }


        
    }


    

    public static void decToBin(int number) {

        String binary_out = "";
        while(number > 0){
            if((number & 1) == 1) {
                binary_out = "1" + binary_out;
            }
            else {
                binary_out = "0" + binary_out;
            } 
            number >>=1;
        }

        System.out.print("The result is:" + binary_out);
    }


  

    public static void octToDec(String val, String type) {
        System.out.print("this is the valu: "+ val +"\n this is the type: "+ type);
        String [] oct = new String []{"000","001","002","003","004","005" ,"006","007","010","011", "012", "013", "014", "015", "016","017"};
        int answer = 0; 
        for (int index = 0; index < 16; index ++) {
            if (val.compareTo(oct[index]) == 0) {
                answer = index;

            }
        }

        if (type.equals(bin)) {
            decToBin(answer);
        }

         if (type.equals(hex)) {
            decToHex(answer);
        }
    

        if (type.equals(dec)) {
            System.out.print("The result is: " + answer);
            
        }

    
    }

    public static void decToOct(int val) {
        

        char [] oct = new char []{'0','1','2','3','4','5' ,'6','7'};
        String answer = "";
        int quotient = 0;
        while ( val > 0) {

            quotient = val % 8;
            answer = oct[quotient] + answer;
            val = val / 8;

        }

        System.out.print( "The result is: " + answer);


        
    }

     public static void hexToDec(String val, String type) {

        char charVal = val.charAt(0);
        char [] hex = new char []{'0','1','2','3','4','5' ,'6','7','8','9','A','B','C','D','E','F'};
        int answer = 0;
        for (int index = 0; index < 16; index ++) {
            if (charVal == hex[index]) {
                answer = index;
            }
        }
        if (type.equals(bin)) {
            decToBin(answer);
        }

        if (type.equals(oct)) {
            decToOct(answer);

        }

        if (type.equals(dec)) {
            System.out.print("The result is: " + answer);
            
        }    

    }

     public static void decToHex(int number) {

        String [] hex_out = new String []{"0000","0001","0002","0003","0004","0005" ,"0006","0007","0008","0009","A","B","C","D","E","F"};
        int quotient = 0;
        quotient = number % 16;
        System.out.print( "The result is: " + hex_out[quotient]);
            
    }


    public static void main(String[] args){

        // get inputs 
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the name of a number system to convert from (bin, dec, oct, or hex): " ); 
        String number_format_in = input.nextLine();

        System.out.println( "Enter a number as a String: ");
        String original_number = input.nextLine();

        System.out.println( "Enter the name of a number system to convert to (bin, dec, oct, or hex): ");
        String number_format_out = input.nextLine();

        //Scanner.close();

         // if the user INPUTS decimal 
        if (number_format_in.equals(dec))  {
            int number = Integer.parseInt(original_number);
            // dec to dec
            if(number_format_out.equals(dec)) {
                System.out.print("The result is: " + number);
            }

            // dec to bin
            if (number_format_out.equals(bin)) {
                decToBin(number);
            }
            // dec to hex
            if (number_format_out.equals(hex)) {
                decToHex(number);
                }
            // dec to oct
            if (number_format_out.equals(oct)) {
                decToOct(number);
            }
                
        }




        // if the user inputs a number in bin system 
        if (number_format_in.equals(bin)) {
            //bin to bin
            if (number_format_out.equals(bin)) {
                System.out.print( "The result is: " + original_number);
            } else {
                binToDec(original_number, number_format_out); 
            }

        }



        //if the user inputs a number in oct system 
        if (number_format_in.equals(oct)) {

            // oct to oct
            if (number_format_out.equals(oct)) {
                System.out.print( "The result is: " + original_number);
            } else{
                 octToDec(original_number, number_format_out);
            }
        }



        // if the user inputs a number in hex system 
        if (number_format_in.equals(hex)) {

            //hex to hex
            if (number_format_out.equals(hex)) {
                System.out.print( "The result is: " + original_number);
            } else {
                hexToDec(original_number, number_format_out);
            }
           
           } 


    }

}


 
