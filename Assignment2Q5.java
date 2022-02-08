class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	String rectangle = new String("Drawing Rectangle.");
    	System.out.println(rectangle);
    	return rectangle;
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	String line = new String("Drawing Line.");
    	System.out.println(line);
    	return line;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	String cube = new String("Drawing Cube.");
    	System.out.println(cube);
    	return cube;
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape5 rectangle  = new Rectangle5();
		rectangle.draw();
		
		Shape5 line = new Line5();
		line.draw();
		
		Shape5 cube = new Cube5();
		cube.draw();

	}

}