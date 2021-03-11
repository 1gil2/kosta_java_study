package com.kosta.day10;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private int price;
	private boolean eBook;
	
	public Book() {
		
	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book(String title, int price, boolean eBook) {
		super();
		this.title = title;
		this.price = price;
		this.eBook = eBook;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean iseBook() {
		return eBook;
	}
	public void seteBook(boolean eBook) {
		this.eBook = eBook;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", eBook=" + eBook + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (eBook ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (eBook != other.eBook)
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		//�⺻ sort�� ���� asc
		return price - o.price; //asc
	}
	
}
