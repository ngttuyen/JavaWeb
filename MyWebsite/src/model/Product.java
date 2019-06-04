package model;

public class Product {
	private int ProductID,Stock,Price;
	private String ProductName,ProductType,ImageSource;
	
	public Product(int productID, int stock, int price, String productName, String productType, String imageSource) {
		super();
		ProductID = productID;
		Stock = stock;
		Price = price;
		ProductName = productName;
		ProductType = productType;
		ImageSource = imageSource;
	}
	
	public Product() {
		super();
	}


	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public String getImageSource() {
		return ImageSource;
	}

	public void setImageSource(String imageSource) {
		ImageSource = imageSource;
	}
	
	
	
}
