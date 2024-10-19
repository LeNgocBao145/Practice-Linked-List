package Library;

public class Book {
	private int ISBN;
	private String name;
	private String author;
	private String publisher;
	private int publicYear;
	private String category;
	private int price;
	private int quantity;
	private int BookIsBorrowing;

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublicYear() {
		return publicYear;
	}

	public void setPublicYear(int publicYear) {
		this.publicYear = publicYear;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBookIsBorrowing() {
		return BookIsBorrowing;
	}

	public void setBookIsBorrowing(int bookIsBorrowing) {
		BookIsBorrowing = bookIsBorrowing;
	}

	public Book() {
	}

	public Book(String name, String author, String publisher, int publicYear, String category, int price, int quantity,
			int bookIsBorrowing) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publicYear = publicYear;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		BookIsBorrowing = bookIsBorrowing;
	}

}
