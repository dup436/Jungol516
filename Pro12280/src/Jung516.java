import java.util.Scanner;

public class Jung516 {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 double a = sc.nextDouble();
	 double b = sc.nextDouble();
	 char c = sc.next().charAt(0);
	 /*String str = sc.next();
	  *char c1 = str.chatAt(0); 이 두 문장이 위의 한 문장으로 요약됨. 0은 0번째 글짜를 가져오겠다는 뜻*/
	 sc.close();
	 
	 System.out.printf("%.2f\n",a);
	 System.out.printf("%.2f\n",b);
	 System.out.println(c);
 }
}