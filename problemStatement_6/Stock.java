package problemStatement_6;

public class Stock {

	private String symbol;
	private double price;
	private double units;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public Stock(String symbol, double price, double units) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.units = units;
	}
	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", price=" + price + ", units=" + units + "]";
	}
	
	
}
