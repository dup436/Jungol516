import java.util.Scanner;

public class Jungol518 {
 public static void main(String[] args) {
	 
	 Scanner sc= new Scanner (System.in);
	 
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  int z = sc.nextInt();
	  
	  int result1 = x + y + z;
	  int result2 = result1 /3;
	  sc.close();
	  
	  System.out.printf("sum : ");
	  System.out.println(result1);
	  System.out.printf("avg : ");
	  System.out.println(result2);
 }
}
