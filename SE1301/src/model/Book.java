package model;

public class Book {
	private static String bookID,title,author,category,keyword;

	public Book(String bookID, String title, String author, String category, String keyword) {
		super();
		Book.bookID = bookID;
		Book.title = title;
		Book.author = author;
		Book.category = category;
		Book.keyword = keyword;
	}

	public static String getBookID() {
		return bookID;
	}

	public static void setBookID(String bookID) {
		Book.bookID = bookID;
	}

	public static String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		Book.title = title;
	}

	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		Book.author = author;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Book.category = category;
	}

	public static String getKeyword() {
		return keyword;
	}

	public static void setKeyword(String keyword) {
		Book.keyword = keyword;
	}
	
	
}
