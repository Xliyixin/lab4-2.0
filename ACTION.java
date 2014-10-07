import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ACTION extends ActionSupport {
	private String isbn;// ͼ���isbn��
	private BOOK book;// ͼ��
	private ArrayList<BOOK> books;// ĳ���ߵ�����ͼ��
	private BOOKDATA bookdata = BOOKDATA.getInstance();// ����ͼ�������

	private String id;// ����id
	private String name;// ��������
	private AUTHOR author;// ����
	private ArrayList<AUTHOR> authors;// ���������б�
	private AUTHORDATA authordata = AUTHORDATA.getInstance();// �������ߵ�����

	/**
	first mod
	**/

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BOOK getBook() {
		return book;
	}

	public void setBook(BOOK book) {
		this.book = book;
	}

	public ArrayList<BOOK> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<BOOK> books) {
		this.books = books;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<AUTHOR> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<AUTHOR> authors) {
		this.authors = authors;
	}

	public AUTHOR getAuthor() {
		return author;
	}

	public void setAuthor(AUTHOR author) {
		this.author = author;
	}

	public String listauthor() {
		authors = authordata.getAuthors();
		return SUCCESS;
	}

	public String listbook() {
		id = authordata.getAuthorid(name);
		books = bookdata.getBooks(id);
		return SUCCESS;
	}

	public String bookinfo() {
		book = bookdata.getBook(isbn);
		author = authordata.getAuthor(book.getId());
		return SUCCESS;
	}

	public String removebook() {
		bookdata.removeBook(isbn);
		return SUCCESS;
	}

	public String editbook() {
		book = bookdata.getBook(isbn);
		bookdata.removeBook(isbn);
		return SUCCESS;
	}

	public String addbook() {
		bookdata.addBook(book);
		return SUCCESS;
	}
}
