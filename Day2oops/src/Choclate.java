
public class Choclate {
	private String companyname;
	private double price;
	private double weight;
	private String packing;
	public Choclate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Choclate(String companyname, double price, double weight, String packing) {
		super();
		this.companyname = companyname;
		this.price = price;
		this.weight = weight;
		this.packing = packing;
		
	}
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	@Override
	public String toString() {
		return "Choclate [companyname=" + companyname + ", price=" + price + ", weight=" + weight + ", packing="
				+ packing + "]";
	}
	

}
