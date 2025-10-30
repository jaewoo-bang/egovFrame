package day2;

public class CalcuratorTest {
	public static void main(String[] args) {
		
	CircleArea circleArea = new CircleArea(5);
	circleArea.calArea();
	//circleArea.area = 10;
	System.out.println(circleArea.getArea());
	
	//정적메서드 호출
	double result = CircleArea.calArea(5);
	System.out.println(result);
	}
}
