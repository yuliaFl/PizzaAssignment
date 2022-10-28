/*
 * Yulia Flenova 
 * Assignment 2 
 * October 18, 2022
 * Pizza 
 */
public class PizzaOrder {
	private String size;
	private int quantity;
	private double price;
	private boolean tomato;
	private boolean pineapple;
	private boolean bacon;
	private boolean onion;
	private String cheese;

	public double getPrice() {
		if (size.equalsIgnoreCase("Small"))
			return  price=7.99;
		else if (size.equalsIgnoreCase("Medium"))
			return price=10.99;
		else if (size.equalsIgnoreCase("Large"))
			return price=11.99;
		else if (size.equalsIgnoreCase("X-Large"))
			return price=12.99;
		return price;
	}

	public double calculateCost() {
		if(cheese.equalsIgnoreCase("light"))
			return (getPrice()-1) * quantity;
		if(cheese.equalsIgnoreCase("double"))
			return (getPrice()+5)* quantity;
		return getPrice() * quantity;
	}

	public boolean isTomato() {
		return tomato;
	}

	public boolean isPinapple() {
		return pineapple;
	}

	public boolean isBacon() {
		return bacon;
	}

	public boolean isOnion() {
		return onion;
	}

	public void setTomato(boolean tomato) {
		this.tomato = tomato;

	}

	public void setPineapple(boolean pineapple) {
		this.pineapple = pineapple;

	}

	public void setBacon(boolean bacon) {
		this.bacon = bacon;

	}

	public void setOnion(boolean onion) {
		this.onion = onion;

	}
    public String getCheese() {
        return cheese;
    }

	public PizzaOrder(String size, int quantity, boolean tomato, boolean pineapple, boolean bacon, boolean onion, String cheese) {
		this.setTomato(tomato);
		this.setPineapple(pineapple);
		this.setBacon(bacon);
		this.setOnion(onion);
		this.size = size;
		this.quantity = quantity;
	    this.cheese = cheese;
	}

	public String toString() {
		String result = "Pay " + String.format("$%.2f", calculateCost()) + " for " + quantity + " " + size
				+ " sized pizza" + "\nToppings ordered \n";
		if (isTomato()) {
			result += "Tomato";
		}
		if(isPinapple()) {
			result += " Pineapple";
		}
		if(isBacon()) {
			result += " Bacon";
		}
		 if(isOnion()) {
			result +=  " Onion";
		}
		if (cheese != null) {
		    	result+="\nCheese amount: "+ getCheese();
		}
		return result;
	}
	
}
