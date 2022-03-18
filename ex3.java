package ex;

public class ex3 {
	   static int count = 0;
	   
	   public static int fib(int n) {
	      count++;
	   if(n == 1||n ==2 ) {
	      return 1;
	      }
	   else {
	      return fib(n-1)+fib(n-2);
	   }
	   }
	      
	   public static void main(String[] args) {
	      System.out.println(fib(5));
	      System.out.println("fib 함수가 호출된 횟수는 "+count); 
	      
	   }

	}