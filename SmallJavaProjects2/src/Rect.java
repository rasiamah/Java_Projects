
public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Rectangle with width 4 and height 40
				Rectangle firstRectangle = new Rectangle(4, 40);

				// Create a Rectangle with width 3.5 and height 35.9
				Rectangle secondRectangle = new Rectangle(3.5, 35.9);

				// Display the width, height, area, and perimeter of rectangle1
				System.out.println("\n Rectangle 1");
				System.out.println("-------------");
				System.out.println("Width:     " + firstRectangle.width);
				System.out.println("Height:    " + firstRectangle.height);
				System.out.println("Area:      " + firstRectangle.getArea());
				System.out.println("Perimeter: " + firstRectangle.getPerimeter());

				// Display the width, height, area, and perimeter of rectangle2
				System.out.println("\n Rectangle 2");
				System.out.println("-------------");
				System.out.println("Width:     " + secondRectangle.width);
				System.out.println("Height:    " + secondRectangle.height);
				System.out.println("Area:      " + secondRectangle.getArea());
				System.out.println("Perimeter: " + secondRectangle.getPerimeter());

	}

}
