package project.product.entity;

import java.util.List;

public class Type {
	private Integer tid;
	private String tname;
	private List<Product> productList;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public Type(Integer tid, String tname, List<Product> productList) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.productList = productList;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Type(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
	
	
}
