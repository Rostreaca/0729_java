package com.solo.prac;

public class Sort {

	public int[] sort(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			int temp = 0;
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		return arr;
	}
}