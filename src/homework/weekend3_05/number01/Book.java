package homework.weekend3_05.number01;

public class Book {
	//Field
	private String title;
	private String kind;
	private int rentalPrice;
	
	//Constructor
	public Book() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	//toString() OverRiding
	public String toString() {
		return "Book [title="+title+",kind="+kind+", rentalPrice="+rentalPrice+"]";
	}
}
