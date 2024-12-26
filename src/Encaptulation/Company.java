package Encaptulation;

public class Company {

	private String name;
	private int empCount;
	private int sharePrice;

	public Company(String name, int empCount, int sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.sharePrice = sharePrice;
	}

	// public getter and setter: only for private variables.
	public String getName() { // getter is mandatory to get the value
		return name;
	}

//		public void setName(String name) {  //instead of setter we use constructor to assign/set the value at same time.
//			this.name = name;
//		}
	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public int getSharePrice() {
		return sharePrice;
	}
//		public void setSharePrice(int sharePrice) {
//			this.sharePrice = sharePrice;
//		}

}
