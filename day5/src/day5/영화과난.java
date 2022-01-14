package day5;

import java.util.Scanner;

public class 영화과난 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []seat= {0,0,0,0,0,0,0};
		int count=0;
		
		while(true)
		{
			System.out.print("seat =");
			for(int i=0; i<7; i++)
			{
				System.out.print(seat[i]+" ");
			}
			System.out.println("");
			
			System.out.println("메뉴선택");
			System.out.println("[1]자리 선택");
			System.out.println("[2]계산");
			System.out.println("[2]종료");
			int select=sc.nextInt();
			
			if(select==1)
			{
				System.out.println("앉을 자리 선택");
				int choice=sc.nextInt();
				
				if(seat[choice]==0)
				{
					seat[choice]=1;
							count++;
				}
				else
				{
					System.out.println("예매됨");
				}
				
			}
			if(select == 2)
			{
				System.out.println("영화값: "+ count*12000);
			}
			if(select == 0)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
