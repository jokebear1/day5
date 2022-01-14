package day5;

import java.util.Random;

public class omr {
	public static void main(String[] args) {
		Random ran=new Random();
		
		int[] answer= {1,2,3,4,5};
		int[] hgd=new int[5];
		
		int count=0;
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
		System.out.print(answer[i]+" ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		
	System.out.print("[");
	for(int i=0; i<5; i++)
	{
		int num = ran.nextInt(5)+1;
		hgd[i]=num;
		System.out.print(hgd[i]+" ");
	}
		System.out.print("]");
		System.out.println(" ");
		
		
		System.out.print("[");
		for(int i=0;i<5;i++)
		{
			if(answer[i] == hgd[i])
			{
			System.out.print("O ");
			count++;
			}
		else
		{
			System.out.print("X ");
		}
	}
	System.out.println("]");
		
	System.out.print("¼ºÀû: " + count*20);
		
		
}
	
}