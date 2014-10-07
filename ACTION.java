import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ACTION extends ActionSupport {
	private String isbn;// 图书的isbn号
	private BOOK book;// 图书
	private ArrayList<BOOK> books;// 某作者的所有图书
	private BOOKDATA bookdata = BOOKDATA.getInstance();// 链接图书的数据

	private String id;// 作者id
	private String name;// 作者姓名
	private AUTHOR author;// 作者
	private ArrayList<AUTHOR> authors;// 所有作者列表
	private AUTHORDATA authordata = AUTHORDATA.getInstance();// 链接作者的数据

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
