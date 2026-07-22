package com.cg.oops;
public class ShoppingAppVer1 {
	int x=10;//instance variable
	public static void main(String[] args) {
		int x=10; //local variables
    Product p1=	new Product();
    p1.setProductId(101);
    p1.setProdName("Laptop");
    p1.setCategory("Electronics");
    p1.setPrice(80000);
    System.out.println("p name is "+p1.getProdName());
    System.out.println("Price : "+p1.getPrice());
    update(p1);
    System.out.println("Price : "+p1.getPrice());
        //create 2 or more products
    Product p2=new Product();
    //store data
    Product p3=new Product();
    //store data
    Product products[]= {p1,p2,p3};
    Cart cart=new Cart();
    cart.setProducts(products);
    Customer c1=new Customer(10001,"Albin","Bangalore");
    c1.setCart(cart);
    System.out.println(c1.getCustId()+" "+c1.getCustName()+" "+c1.getAddress());
    
	}
	static void update(Product p) {
		p.setPrice(70000);
	}
}
