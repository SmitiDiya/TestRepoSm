package Programs;



public class Circle
{
    double pi;
    static double result;
    
    static {
        Circle.result = 0.0;
    }
    
    public Circle() {
        this.pi = 3.14;
    }
    
    double area(final int radius) {
        final int rsquare = square(radius);
        return pi * rsquare;
    }
    
    private int square(int r) {
		// TODO Auto-generated method stub
		return r*r;
	}

	public static void main(final String[] args) {
        final Circle c = new Circle();
        Circle.result = c.area(5);
        System.out.println(Circle.result);
    }
}