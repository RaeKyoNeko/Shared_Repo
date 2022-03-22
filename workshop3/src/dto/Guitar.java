package dto;

/**
 *
 * @author raekyo
 */
public class Guitar {

	private String serialNumber;
	private int price;
	private String builder;
	private String model;
	private String backWood;
	private String topWood;

	public Guitar() {
		serialNumber = null;
		price = 0;
		builder = null;
		model = null;
		backWood = null;
		topWood = null;
	}
	
	public Guitar(Guitar g){
		this(g.getSerialNumber(), g.getPrice(), g.getBuilder(), 
			g.getModel(), g.getBackWood(), g.getTopWood());
	}

	public Guitar(String serialNumber, int price, String builder, 
		String model, String backWood, String topWood)
		throws IllegalArgumentException {
			this.serialNumber = serialNumber;
			this.price = price;
			this.builder = builder;
			this.model = model;
			this.backWood = backWood;
			this.topWood = topWood;
		
	}
	
	
	public void createSound(){
		System.out.println("serialNumber: "+ serialNumber);
		System.out.println("pirce: " + price);
		System.out.println("builder: " + builder);
		System.out.println("model: " + model);
		System.out.println("backWood: " + backWood);
		System.out.println("topWood: "+ topWood );
			
	}
	

	// setter
	public void setSerialNumber(String serialNumber) throws IllegalArgumentException {
		if(serialNumber.isEmpty() || serialNumber == null) 
			throw new IllegalArgumentException("ERROR: SerialNumber cannot be Empty");
		else this.serialNumber = serialNumber;
	}

	public void setPrice(int price) throws IllegalArgumentException {
		if(price == 0) throw new IllegalArgumentException("ERROR: Price cannot be 0");
		else this.price = price;
	}

	public void setBuilder(String builder) throws IllegalArgumentException {
		if(builder.isEmpty() || builder == null) 
			throw new IllegalArgumentException("ERROR: Builder cannot be Empty");
		else this.builder = builder;
	}

	public void setModel(String model) throws IllegalArgumentException {
		if(model.isEmpty() || model == null)
			throw new IllegalArgumentException("ERROR: Model cannot be Empty");
		else this.model = model;
	}

	public void setBackWood(String backWood) throws IllegalArgumentException{
		if(backWood.isEmpty() || backWood == null)
			throw new IllegalArgumentException("ERROR: BackWood cannot be Empty");
		else this.backWood = backWood;
	}

	public void setTopWood(String topWood) throws IllegalArgumentException{
		if(topWood.isEmpty() || topWood == null)
			throw new IllegalArgumentException("ERROR: TopWood cannot be Empty");
		else this.topWood = topWood;
	}

	// getter
	public String getSerialNumber() {
		return serialNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getBackWood() {
		return backWood;
	}

	public String getTopWood() {
		return topWood;
	}

}// Guitar
