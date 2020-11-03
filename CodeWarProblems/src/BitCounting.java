

public class BitCounting {
    public BitCounting(){
        
    }

    public static int countBits(int n){
        String binary = Integer.toBinaryString(n);
        int ones = 0;
        for(int i = 0; i < binary.length(); i++ ){
            Character c = binary.charAt(i);
            if(c.equals('1')){
                ones++;
            }
        }
        return ones;
    }

}