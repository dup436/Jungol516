import java.util.Scanner;

public class Jung516 {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 double a = sc.nextDouble();
	 double b = sc.nextDouble();
	 char c = sc.next().charAt(0);
	 /*String str = sc.next();
	  *char c1 = str.chatAt(0); �� �� ������ ���� �� �������� ����. 0�� 0��° ��¥�� �������ڴٴ� ��*/
	 sc.close();
	 
	 System.out.printf("%.2f\n",a);
	 System.out.printf("%.2f\n",b);
	 System.out.println(c);
 }
}