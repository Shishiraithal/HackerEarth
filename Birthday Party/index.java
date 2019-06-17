import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
       Scanner a =new Scanner(System.in);
       int T = a.nextInt();
       
       int[] N = new int[T];
       int[] M = new int[T];
       
       for(int i=0 ; i<T ; i++){
           N[i]= a.nextInt();
           M[i]= a.nextInt();
       }
       for(int i=0 ; i<T ; i++){
           System.out.println((M[i]%N[i]==0)? "Yes":"No");
       }
    }
}