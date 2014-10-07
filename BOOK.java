public class BOOK {
	private String isbn;// 图书的isbn
	private String title;// 图名
	private String id;// 图书作者id
	private String pub;// 图书出版社
	private String date;// 图书出版日期
	private double price;// 图书售价

	public BOOK() {

	}


	public BOOK(String isbn, String title, String id, String pub, String date,
			double price) {
		this.isbn = isbn;
		this.title = title;
		this.id = id;
		this.pub = pub;
		this.date = date;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
