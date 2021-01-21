import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
	private Integer id;
	private Double price;
	private String couponCode;
	private Date purchaseDate;
	private List<Order> orderList;
	public Purchase() 
	{
		orderList=new ArrayList<Order>();
	}
	public Purchase(Integer id, Double price, String couponCode, Date purchaseDate, List<Order> orderList) {
		super();
		this.id = id;
		this.price = price;
		this.couponCode = couponCode;
		this.purchaseDate = purchaseDate;
		this.orderList = orderList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public static void computePrice(List<Purchase> list)
	{
		//pending
		for(Purchase p:list)
		{
			Double total=0.0;
			for(Order o:p.getOrderList())
			{
				Double orderPrice=o.getItem().getPrice();
				Integer orderQuantity=o.getQuantity();
				Double orderValue=orderPrice*orderQuantity;
				total+=orderValue;						
			}
			//apply discount
			String coupon = p.getCouponCode();

			Double discount=0.0;
			total = applyCoupon(total, coupon);
			p.setPrice(total);
		}
	}
	private static Double applyCoupon(Double total, String coupon) {
//		FIRST	Rs.100 discount
//		BUYFIVE	Rs.500 discount
//		ORDER50	50% discount
//		ORDER75	75% discount
//		DEAL25	25% discount
//		CHICKEN70	70% discount
		Double discount;
		switch(coupon)
		{
		case "FIRST":
			total-=100;
			break;
		case "BUYFIVE":
			total-=500;
			break;
		case "ORDER50":
			discount=total*.5;
			total-=discount;
			break;
		case "ORDER75":
			discount=total*.75;
			total-=discount;
			break;
		case "DEAL25":
			discount=total*.25;
			total-=discount;
			break;
		case "CHICKEN70":
			discount=total*.7;
			total-=discount;
			break;
		}
		return total;
	}
}
