import java.util.Scanner;
public class SumFunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int sum=add(number1,number2);
        System.out.println("the sum is "+ sum);
        sc.close();
    }
    public static int add(int number1, int number2){
        return number1+number2;
    }
        
}