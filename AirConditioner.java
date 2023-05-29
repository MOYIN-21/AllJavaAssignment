public class AirConditioner {
	private boolean isOn;
	private String productName;
	private int temperature;
	
		public AirConditioner(String AirConditioner) {}
		
		public void setTemperature(int newtemperature){
		this.temperature = newtemperature;
		}
		
		public int getTemperature () {
		return temperature;
		}
		public boolean isOn (){
		return true;
		}
		
		public void setOn(boolean newOn){
		if (isOn == true);
		isOn = newOn;
		}
		
		public void setproductName(String productName){
		this.productName = productName;
		}
		public String getproductName (){
		return productName;
		}
}
		
