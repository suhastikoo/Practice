import java.io.*;
public class Test {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String[] array1 = {"ab"};
        String[] array2 = {"azbde", "abcher", "acegk"};
        int power1 = 50;
        int power2 = 47;
        Calculate(array1,power1);
        //Calculate(array2,power2);
        char c = 'a' + '2';// + 'b';
        System.out.println(c);
        
    }
    
    public static void Calculate(String[] array, int power){
        int sum = 0;
        int value = 0;
        for(int i=0; i<array.length; i++){
            String temp = array[i];
            value = (int) Math.pow(temp.charAt(0), power);;
            for(int j=1; j<temp.length(); j++){
                int ascii = temp.charAt(j);
                System.out.println(ascii);
                value = (int) (value * Math.pow(ascii, power));
                System.out.println(value);
            }
            sum += value;
        }
        System.out.println(sum);
        if(sum+1%2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
