package chater03;

public class Goods {
	private static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public void setName(String name) { //세터
		this.name = name;//this 객체 자신
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0)
		{
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public String getName() {//게터
		return name;
	}
	void showInfo() {
		System.out.println(name);
	}
}


