package Ch18;
interface Shape {
	abstract double area();
}


class Circle01 implements Shape {
	private double radius;
	
	public Circle01(double radius) {
		this.radius = radius;	
	}
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}
public class C01Interface {
	public static void main(String[] args) {
		Shape newCir = new Circle01(3.0);
		System.out.println(newCir.area());
	}

}
