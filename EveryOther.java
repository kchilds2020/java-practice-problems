import java.util.Scanner;

class EveryOther{

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String line = myScanner.nextLine();
        Boolean cap = true;

        for(int i = 0; i < line.length(); i++){
            Character c = line.charAt(i);
            if(c.equals(' ')){
                System.out.print(" ");
            }
            else if(cap == true){
                System.out.print(Character.toUpperCase(c));
                cap = false;
                
            }else{
                System.out.print(Character.toLowerCase(c));
                cap = true;
            }
            
        }
    }
}