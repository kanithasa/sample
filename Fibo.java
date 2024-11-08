import java.util.Scanner;
public class Fibo {
    public static void main(String args[]){
        System.out.println("Enter number of terms in fibonacci series:");
        Scanner n= new Scanner(System.in);
        int count=n.nextInt();
        
        System.out.println("Fibonacci series:");
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }

        n.close();
        
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
