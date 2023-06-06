/*Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quan-
tity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchase-
Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
cation class named Petrol that demonstrates the capabilities of class PetrolPurchase.*/

public class PetrolPurchase{
	private String stationLocation;
	private String typeOfPetrol;
	private int quantity;
	private double pricePerLiter;
	private double percentageDiscount;
	
	public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount){
		this.stationLocation = stationLocation;
		this.typeOfPetrol = typeOfPetrol;
		this.quantity = quantity;
		this.pricePerLiter = pricePerLiter;
		this.percentageDiscount = percentageDiscount;	
	}
	
	public void setStationLocation(String stationLocation){
		this.stationLocation = stationLocation;
	}
	
		public void setTypeOfPetrol(String typeOfPetrol){
		this.typeOfPetrol = typeOfPetrol;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public void setPricePerLiter(double pricePerLiter){
		this.pricePerLiter = pricePerLiter;
	}
	public void setPercentageDiscount(double percentageDiscount){
		this.percentageDiscount = percentageDiscount;
	}
	
	public String stationLocation(){
		return stationLocation;
	}
	public String typeOfPetrol(){
		return typeOfPetrol;
	}
	public int quantity(){
		return quantity;
	}
	public double pricePerLiter(){
		return pricePerLiter;
	}
	public double percentageDiscount(){
		return percentageDiscount;
	}
	public double getNetPurchaseAmount(double netPurchaseAmount) {
	               if (pricePerLiter > 0.0) {
			netPurchaseAmount = quantity * pricePerLiter;
		 }
		return netPurchaseAmount;
	}
}