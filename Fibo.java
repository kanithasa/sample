import java.util.Scanner;
public class Fibo {
    public static void main(String args[]){
        System.out.println("Enter number of terms in fibonacci series:");
        if (args.length>0){
            int count=Integer.parseInt(args[0]);}
        
            
        
        System.out.println("Fibonacci series:");
        for (int i=0;i<count;i++){
            System.out.print(fibonacci(i)+" ");
        }

        
        
    }

    public static int fibonacci(int i){
        // if fibonacci series not start with 0

        if (i<=1){
            return 1;
        }


        // if fibonacci series start with 0
        
        // if (i<=1){
        //     return i;
        // }

        return fibonacci(i-1)+fibonacci(i-2);
    }
    
}
