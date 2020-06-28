package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello world");
    Scanner in=new Scanner(System.in);
    int amount=100;
    int price = 0 ;
    System.out.println("请输入票面：");
    amount=in.nextInt();
    System.out.println("请输入金额");
    price=in.nextInt();
    System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
