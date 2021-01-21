import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Purchase {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberof Purchase");
		int noOfPurchase=sc.nextInt();
		List<Purchase> purchaseList=new ArrayList<Purchase>();
		List<Item> itemList = Item.prefill();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		for(int i=0;i<noOfPurchase;i++)
		{
			System.out.println("Enter purchase detail "+(i+1));
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
//			Purchase p=new Purchase(id, price, couponCode, purchaseDate, orderList)
			Purchase p=new Purchase();
			p.setId(Integer.valueOf(arr[0]));
			p.setCouponCode(arr[1]);
			p.setPurchaseDate(sdf.parse(arr[2]));
			
			System.out.println("Enter the number of Orders");
			int noOfOrders=sc.nextInt();
			for(int j=0;j<noOfOrders;j++)
			{
				String input=sc.nextLine();
				if(input.equals(""))
					input=sc.nextLine();
				String[] arr2 = input.split(",");
				Order o=new Order();
				o.setQuantity(Integer.valueOf(arr2[0]));
				String itemName=arr2[1];
				//find Item object using item name
				for(Item item : itemList)
				{
					if(item.getName().equals(itemName))
						o.setItem(item);
				}
				p.getOrderList().add(o);
			}
			
			purchaseList.add(p);
		}
		Purchase.computePrice(purchaseList);
		System.out.format("%-5s %-10s %-12s %s\n","Id","Price","Coupon Code","Purchase Date");
		for(Purchase p: purchaseList)
			System.out.format("%-5s %-10s %-12s %s\n",p.getId(),p.getPrice(),p.getCouponCode(),sdf.format(p.getPurchaseDate()));
	}

}
