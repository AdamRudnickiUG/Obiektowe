package warehousePackage;

//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Warehouse {

		Date lastUpdated = new Date();
		ArrayList<Product> products = new ArrayList<Product>();
		
        Map<Manufacturer, Integer> manufacturers = new HashMap<Manufacturer, Integer>();
		//lastUpdated = LocalDateTime.now();

//-----------------------------------------------------
	public void addProducts(Product newProduct) {
		products.add(newProduct);
		lastUpdated = new Date();
	}
	
//-----------------------------------------------------	
	public void deleteProduct(int id) {
		products.remove(id);
		lastUpdated = new Date();
	}
	
//-----------------------------------------------------	
	public void modifyProduct(int id, Product product) {
		products.set(id, product);
		lastUpdated = new Date();
	}
	
//-----------------------------------------------------	
	public Product getProduct(int id) {
		return products.get(id);
	}
	
//-----------------------------------------------------	
	public int getProductsCount() {
		return products.size();
	}
	
//-----------------------------------------------------	
	public void printProductsOfType(ProductType type) {
		//System.out.println(products.getType(type));
		for(int i = 0; i < products.size(); i++) {
			if (products.get(i).type == type){
				System.out.println(products.get(i));
			}
		}
	}
	
//-----------------------------------------------------	
	public void printManufacturerProducts(String manufacturerName) {
		for(int i = 0; i < products.size(); i++) {
			if (products.get(i).manufacturer.name == manufacturerName){
				System.out.println(products.get(i));
			}
		}		
	}
	
//-----------------------------------------------------	
	public ArrayList<Product> getProductsBelowPrice(double price) {
		ArrayList<Product> foundItems = new ArrayList<Product>();
		for(int i = 0; i < products.size(); i++) {
			if (products.get(i).price < price){
				foundItems.add(products.get(i));
			}
		}
		return foundItems;
	}

//-----------------------------------------------------
	public void printMostPopularManufacturer() {
//		ArrayList<Manufacturer> foundManufacturers = new ArrayList<Manufacturer>();
		for(int i = 0; i < products.size(); i++) {
				manufacturers.put(products.get(i).manufacturer, manufacturers(products.get(i).manufacturer)+1);
			}
		}
	
		Manufacturer biggest = products.get(0).manufacturer;
		int amountdOfBiggest = 0
	
		for(int i = 0; i < products.size(); i++) {
			if manufacturers.get(products.get(i).manufacturer)
		}
	}
//-----------------------------------------------------
	public List getProductsMadeBefore(Date date) {
		ArrayList<Product> foundItems = new ArrayList<Product>();
		for(int i = 0; i < products.size(); i++) {
			if (products.get(i).productionDate().before(date)){
				foundItems.add(products.get(i));
			}
		}
		return foundItems;
	}
	
//-----------------------------------------------------
}
