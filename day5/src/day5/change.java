package day5;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {10,20,30,40,50};
		
		System.out.println("�ε���1 �Է� : ");
		int idx1=sc.nextInt();
		System.out.println("�ε���2 �Է� : ");
		int idx2=sc.nextInt();
		
		
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		System.out.println("�� 2���� �Է¹޾� �� ��ü�ϱ�");
		System.out.println("��1 �Է�: ");
		int va1=sc.nextInt();
		System.out.println("��2 �Է�");
		int va2=sc.nextInt();
		
	   int check1=0;
	   int check2=0;
	   
	   for(int i=0; i<5; i++)
	   {
		   if(arr[i] == va1)
		   {
			   check1 = i;
		   }
		   if(arr[i] == va2) 
		   {
			   check2 = i;
		   }
	   }
	   
	   temp = arr[check1];
	   arr[check1] = arr[check2];
	   arr[check2] = temp;
	   
	   System.out.print("[");
	   for(int i=0; i<5; i++)
	   {
		   System.out.print(arr[i]+" ");
		   System.out.println();
	   }
	   System.out.print("]");
	   System.out.println();
	   
	   System.out.println("");
	   System.out.println("�й�2���� �Է¹޾� �� ��ü�ϱ�");
	   System.out.println("�й�1 �Է�: ");
	   int datal=sc.nextInt();
	   System.out.println("����2 �Է�: ");
	   int datal2=sc.nextInt();
	   
	   check1=0;
	   check2=0;
	   int[] ids= {1001,1002,1003,1004,2005};
	   int[] score= {87,11,45,98,23};
	   
	   for(int i=0; i<5; i++)
	   {
		   if(ids[i] == datal)
		   {
			   check1 = i;
		   }
		   if(ids[i] == datal2)
		   {
			   check2 = i;
		   }
	   }
	   temp = score[check1];
	   score[check1] = score[check2];
	   score[check2] = temp;
	   
	   System.out.print("[");
	   for(int i=0; i<5; i++)
	   {
		   System.out.print(score[i]+" ");
	   }
	System.out.print("]");
	System.out.println();
		
	}

}
