package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "Learning string handling";
        //this will return the first char of the string
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(4);
        //System.out.println("Character at 0 index is:" + ch1);
       // System.out.println("Character at 0 index is:" + ch2);
        //System.out.println("Character at 0 index is:" + ch3);
        String string = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";

        //This will return the first char of the string

        boolean isTrue = false;

        //System.out.println("Character at 0 index is: " + ch1);
       // System.out.println("Character at 1 index is: " + ch2);
       // System.out.println("Character at 4 index is: " + ch3);
       // System.out.println("Are str and allUpper equal: " + false);


        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        int result = str.length( ) - 1;
        System.out.println(result);
        // 2) Using the same string as above, what character is located at the 10th index?
        char result1 = str.charAt(10);
        System.out.println(result1);
        // 3)Do a check to see if the character at index 10 and 15 the same?
        char result2 = str.charAt(10);
        System.out.println(result2);
        char result3 = str.charAt(15);
        System.out.println(result3);
        if (result2 == result3);{
            System.out.println(true );
        }
        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        System.out.println(str.contains("b"));

    }
    }
