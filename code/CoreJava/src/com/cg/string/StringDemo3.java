package com.cg.string;

public class StringDemo3 {
public static void main(String[] args) {
	String s="Hello";
	
	System.out.println(s.charAt(4));//to get the char by index
	System.out.println("-----------");
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	
	//it must return Emeqiaou
	String str=convert("Elephant");
}

  //convert all consonents into next alphabet and return
  static String convert(String s) {
	  return "";
  }
}
