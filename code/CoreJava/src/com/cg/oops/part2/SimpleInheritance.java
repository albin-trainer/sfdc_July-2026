package com.cg.oops.part2;
public class SimpleInheritance {
public static void main(String[] args) {
	new Child();
}
}
class Parent{
	public Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
	public Child() {
		//super(); // default 1st stmt ....
	System.out.println("Child constructor");
	}
}/*
class Parent1{
	Parent1(String s){
		System.out.println("Parent constructor");
	}
}
class Child1 extends Parent1{
	Child1(){
		super("Hello"); //here its must
	}
}*/
