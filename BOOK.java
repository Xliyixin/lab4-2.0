public class BOOK {
	private String isbn;// ͼ���isbn
	private String title;// ͼ��
	private String id;// ͼ������id
	private String pub;// ͼ�������
	private String date;// ͼ���������
	private double price;// ͼ���ۼ�

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
