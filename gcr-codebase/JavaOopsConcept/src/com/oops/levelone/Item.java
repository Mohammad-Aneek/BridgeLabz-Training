package com.oops.levelone;

public class Item {
	String itemCode;
	String itemName;
	double price;
	
	//constructor
	Item(String itemName ,String itemCode,double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	// to display the details
	public void displayItems() {
		System.out.println("itemCode : "+itemCode);
		System.out.println("itemPrice : "+price);
		System.out.println("itemName : "+itemName);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		String[] itemName= {"Water bottle","Rice","blackboard"};
		String[] itemCode= {"01AA","01BB","02AA"};
		double[] price= {500,700,400};
		
		Item []item = new Item[3];
		for (int i = 0; i < item.length; i++) {
			item[i] = new Item(itemName[i], itemCode[i], price[i]);
		}
		
		for (int i = 0; i < price.length; i++) {
			item[i].displayItems();
		}
		
	}

}
