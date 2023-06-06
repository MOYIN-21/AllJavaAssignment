
public class Car{
	private String model;
	private String type;
	private double price;
	
	public Car(String model, String type, double price){
	this.model = model;
	this.type = type;
	this.price = price;
}
		public void setModel(String model){
	    		 this.model = model;
		}
	
		public String getModel(){
	  		   return model;
		}
	
		public void setType(String type){
	   		  this.type = type;
		}
	
		public String getType(){
			  return type;
		}
	
		public void setPrice(double price){
	    		if(price > 0)
			this.price = price;
		}
	
		public double getPrice(){
	   		  return price;
		}  
}

		/*public double getPrice(double price){
		if(price > 0){
			price = price;
		
			return price;
		


}*/