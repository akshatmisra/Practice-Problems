import java.util.Arrays;
import java.util.*;

public class TestApp {

	public static void main(String args[])
	{
		int [] arr = {1,2,3,4,5,7,8,9};
		//calculate(arr);
		//MaxContigeous(arr);
		//FindMissingNumber(arr);
		System.out.println("Sum of digit = "+ Math.pow(10, 3));
	}
	
	static public int addDigits(int num) {
        int digit=0;

        while(num!=0)
        {
            digit += num%10;
            num = num/10;
        }
        num = digit;
        if(digit>10)
        	num = addDigits(digit);
        return num;
        
    }
	
	static public void FindMissingNumber(int [] arr)
	{
		int sum = (arr.length+1) * (arr.length +2)/2;
		for(int i = 0; i<arr.length;i++)
		{
			sum -= arr[i];
		}
		System.out.println("Missing number is :"+sum);
	}

	
	static public void MaxContigeous(int []arr)
	{
		int max = arr[0];
		int current = arr[0];
		
		for(int i = 1; i<arr.length;i++)
		{
			current = Math.max(arr[i], current+arr[i]);
			max = Math.max(max, current);
		}
		
		System.out.println("Max Sum : "+ max);
		
	}
	
	static public void OddOccurance(int [] arr)
	{
		int element = arr[0];
		for(int i = 1; i<arr.length; i++)
		{
			element = element ^ arr[i];
		}
		System.out.println(element);


	}
	
	
	static public void calculate(int [] arr)
	{
		int [] out = new int [arr.length];
		
		for(int i = 0; i< arr.length; i++)
		{
			int val = 1;
			for(int j = 0; j<arr.length;j++)
			{
				if(j!=i)
					val *= arr[j]; 
			}
			out[i]= val;
		}
		
//		for(int i: out)
//		System.out.println(i);
	}
	
	static public void Maxof3(int [] arr)
	{
		if(arr.length<3)
			return;
		
		int heighest_of_3 = arr[0]*arr[1]*arr[2];
		int heighest_of_2 = arr[0]*arr[1];
		int heighest = Math.max(arr[0],arr[1]);
		int lowest_of_2 = arr[0]*arr[1];
		int lowest = Math.min(arr[0],arr[1]);

		for(int i = 0; i< arr.length; i++)
		{
			int current = arr[i];
			heighest_of_3 = Math.max(Math.max(heighest_of_3, current*heighest_of_2), current * lowest_of_2);
			heighest_of_2 = Math.max(Math.max(heighest_of_2, current*heighest), current*lowest);
			heighest = Math.max(current,heighest);
			
			lowest_of_2 = Math.min(Math.min(lowest_of_2, current*lowest), current*heighest);
			lowest = Math.min(lowest,current);
		}
		System.out.println(heighest_of_3);
	}

	
	static public void MaxofThreeInList(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length-2;i++)
		{
			for(int j = 1; j<arr.length-1; j++)
			{
				for(int k = 2; k<arr.length;k++)
				{
					int product = arr[i]*arr[j]*arr[k];
					if(max < product)
						max = product;
				}
			}
		}
		System.out.println(max);
	}


}
