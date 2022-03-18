package ex;

public class ex2 {
	   static int count = 0;
	   public static int seq(int n) {
	      count++;
	      if(n == 1) {
	      return  1;
	      }
	      else {
	      return seq(n-1)+3;
	      }
	   }
	   public static void main(String[] args) {
	      
	      System.out.println(seq(4));
	      System.out.println("seq 함수가 호출된 횟수는 "+count);

	   }

	}