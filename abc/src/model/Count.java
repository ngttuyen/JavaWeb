package model;

public class Count {
	private int count;

	
	public Count(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count++;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
