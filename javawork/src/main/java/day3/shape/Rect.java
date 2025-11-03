package day3.shape;

public class Rect extends Shape{
	private String color; //면색상
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("삼각형을 그리다");
	}
	
}
