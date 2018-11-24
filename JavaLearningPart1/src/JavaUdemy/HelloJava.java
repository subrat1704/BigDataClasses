package JavaUdemy;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {2,3,18,19,32,44,49,51,61,98,109,123,210};
		int searchedNumber=19;
		int firstIndex;
		int lastIndex;
		int midPoint=myArray.length/2;
		while(myArray[midPoint]!=searchedNumber && midPoint>1)
		{
			if(myArray[midPoint]<searchedNumber)
			{
				firstIndex=midPoint;
				lastIndex=myArray.length-1;
			}
			else
			{
				firstIndex=0;
				lastIndex=midPoint;
			}
			myArray=CreateSubArray(myArray,firstIndex,lastIndex);
			midPoint=myArray.length/2;
		}
		if(myArray[midPoint]==searchedNumber)
		System.out.println("Element found");
		else
			System.out.println("Element not found.");
	}
	static int[] CreateSubArray(int[] arrInput,int startIndex,int endIndex)
	{
		int length=endIndex-startIndex+1;
		int[] finalArr=new int[length];
		int index=0;
		for(int i=startIndex;i<=endIndex;i++)
		{
			finalArr[index]=arrInput[i];
			index++;
		}
		
		return finalArr;
	}
}

class Student
{
	String name;
	Integer age;
}
