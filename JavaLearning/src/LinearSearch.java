
public class LinearSearch {
public static void main(String[] args)
{
	int[] numbers =new int[10];
	for(int i=0;i<10;i++)
	{
		numbers[i]=i*11+8;
	}
	
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]==30)
			System.out.println("Number found!!!");
	}
}
}
