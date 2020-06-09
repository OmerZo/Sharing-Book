package SharingBook;

public class Address {
	private String Street;
	private String City;
	private int Num_of_bulding;

	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getNum_of_bulding() {
		return Num_of_bulding;
	}
	public void setNum_of_bulding(int num_of_bulding) {
		Num_of_bulding = num_of_bulding;
	}
	public Address(String street, String city, int num_of_bulding) {
		super();
		Street = street;
		City = city;
		Num_of_bulding = num_of_bulding;
	}

}
