package springDemo;

public class Triangle {

	private String type;
	private int height;
	
	public Triangle(String type){
		this.type=type;
	}
	
	public Triangle(int height){
		this.height=height;
	}
	
	public Triangle(String type, int height){//parameterized constructor
		this.type=type;
		this.height=height;
	}

	public String getType() {//getter method to print values
		return type;
	}

	public int getHeight() {
		return height;
	}
	
	public void draw() {

		System.out.println(getType() + " Triangle drawn of height " +getHeight());
	}
}
