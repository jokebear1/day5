package day5;

public class Drainage {
	public static void main(String[] args) {
		
		int[] arr= {44,11,29,25,76};
		int[] temp=null;
		
		int count=0;
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				count++;
			}
		}
		
		temp = new int[count];
		int check = 0;
		
		for(int i=0; i<5; i++)
		{
			temp[check] = arr[i];
			check++;
		}
	
		System.out.println("[");
		for(int i=0; i<count; i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}

}
