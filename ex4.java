package ex;

public class ex4 {
	   static int count = 0;
	   static int count2 = 0;
	   public static void move(int n,char a,char b,char c) {
	      count++;
	      if(n>0) {
	         count2++;
	         move(n-1,a,c,b);
	         System.out.println(n+"��° ������ "+ a + " ��տ���  " + b + " ������� �̵�");
	         move(n-1,c,b,a);
	         
	      }
	      
	   }
	      
	   public static void main(String[] args) {
	      
	      move(3,'a','b','c');
	      System.out.println("move�Լ��� ȣ��� Ƚ���� "+count+"��");
	      System.out.println("������ �ű� Ƚ���� "+count2+"��");
	      
	   }

	}