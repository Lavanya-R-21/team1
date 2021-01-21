import java.security.Identity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main3 {

	public static List<Item> prefill(){
		List<Item> list = new ArrayList<>();
		list.add(new Item("Paneer Fried Rice",Double.parseDouble("150"),"Veg"));
		list.add(new Item("Chicken Fried Rice",Double.parseDouble("210"),"NonVeg"));
		list.add(new Item("Bucket Chicken",Double.parseDouble("479"),"Veg"));
		list.add(new Item("Ghee Roast",Double.parseDouble("75"),"Veg"));
		list.add(new Item("Masal Roast",Double.parseDouble("65"),"Veg"));
		list.add(new Item("Grill",Double.parseDouble("250"),"NonVeg"));
		list.add(new Item("Tomato Soup",Double.parseDouble("100"),"Veg"));
		list.add(new Item("Prawn Fry",Double.parseDouble("185"),"NonVeg"));
		list.add(new Item("Mushroom Briyani",Double.parseDouble("140"),"Veg"));
		list.add(new Item("Baby Corn Chilli",Double.parseDouble("80"),"Veg"));
		list.add(new Item("Barbeque Chicken",Double.parseDouble("400"),"NonVeg"));
		list.add(new Item("Veg Extravaganza",Double.parseDouble("99"),"Veg"));
		list.add(new Item("Margherita",Double.parseDouble("399"),"Veg"));
		list.add(new Item("Tandoori Chicken",Double.parseDouble("500"),"NonVeg"));
		list.add(new Item("Mutton Balls",Double.parseDouble("90"),"NonVeg"));
		return list;
		}

	public static void main(String[] args) {
			List<Item> items = prefill();
			Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Item::getType, Collectors.counting()));
			for(Entry<String, Long> e:result.entrySet())
				System.out.println(e);
	}	

}
