package day2;

public class CircleArea {
	//필드
	private int radius;				//read,write
	private double area;	//캡슐화	read

	
	// 생성자
	public CircleArea() {}
	public CircleArea(int radius) {
		super();
		this.radius = radius;
	}
		
		
	//메서드 오버로딩(중복선언 : 같은이름 가능. 매개변수 타입,수 다름)
		public static double calArea(int r) { return  Math.PI * r * r; }
	
		//메서드
		public void calArea() { area = Math.PI * radius * radius; }
		
		//setter,getter

		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		public double getArea() {
			return area;
		}
		
	}
	

