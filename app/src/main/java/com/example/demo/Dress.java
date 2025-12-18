package com.example.demo;

public class Dress {
	
	 private String name;
	    private String size;
	    private double price;

	    // Constructor
	    public Dress(String name, String size, double price) {
	        this.name = name;
	        this.size = size;
	        this.price = price;
	    }

	    // Getters and setters
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getSize() { return size; }
	    public void setSize(String size) { this.size = size; }

	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }
        
	

}
