package project.product.entity;

public class Product {
	private Integer pid; 
	private String pname; 
	private String picture; 
	private Double price;
	
	private String description;

	public Product(Integer pid, String pname, String picture, Double price, String description) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.picture = picture;
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", picture=" + picture + ", price=" + price
				+ ", description=" + description + "]";
	}

	public Product() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
