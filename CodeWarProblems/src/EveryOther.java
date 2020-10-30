package CodeWarProblems.src;

import java.util.Scanner;

class EveryOther{

    public static String capitalizeEveryOtherLetter(String sentence){
        Boolean cap = true;
        String returnString = "";
        for(int i = 0; i < sentence.length(); i++){
            Character c = sentence.charAt(i);
            if(c.equals(' ')){
                returnString += " ";
            }
            else if(cap == true){
                returnString += Character.toUpperCase(c);
                cap = false;
                
            }else{
                returnString += Character.toLowerCase(c);
                cap = true;
            }
            
        }
        return returnString;
    }
}