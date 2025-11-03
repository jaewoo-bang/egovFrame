package day3.shape;

public class Circle extends Shape {
	private String color; //면색상

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Shape [sx=" + this.getEx() + ", sy=" + this.getEy() + ", ex=" + this.getSx() + ", ey=" + this.getSy() + "]";
	}

	@Override
	public void draw() {
		System.out.println("원을 그리다");
	}
	
}
