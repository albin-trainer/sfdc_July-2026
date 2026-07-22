package com.cg.string;

public class StringDemo2 {
public static void main(String[] args) {
	
	int num=198;
	//int to string
	String ss=num+"";
	//string to stringbuilder 
	//so that i can reverse 
	StringBuilder s3=new StringBuilder(ss);
	System.out.println(s3.reverse());
	
	//string to integer
	int x=Integer.parseInt(s3.toString());
	System.out.println(x);
}
}
