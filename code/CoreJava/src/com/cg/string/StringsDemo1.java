package com.cg.string;

public class StringsDemo1 {

	public static void main(String[] args) {
		String msg="Hello Bangalore it rains today";
		int nums[]= {1,2,3,4,5};
				System.out.println(msg.length());
		System.out.println(nums.length);
		
		String r=reverse(msg);
		System.out.println(r); //today rains it Bangalore Hello
		
		int numbers[]= {12,32,56,76,321,65,291};
		int result[]=sortByReverseNums(numbers);
		//iterate by for loop
	}
	 static int[] sortByReverseNums(int arr[]) {
		 //reverse each nos , then sort 
		 //and return it 
		 //21,23,65,67,123,56,192
		 return null;
	 }
	static String reverse(String msg) {
		String arr[]=msg.split(" ");
		String s="";
		for(int i=arr.length-1;i>=0;i--) {
			s=s+arr[i]+" ";
		}
		return s;
	}
}
