import java.util.Scanner;
public class triangle extends Triangle_{

			// TODO Auto-generated method stub
			public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter three sides of a triangle: ");
		        double[] sides = new double[3];
		        for (int i = 0; i < sides.length; i++) {
		            sides[i] = input.nextDouble();
		        }
		        System.out.print("Enter a triangle color: ");
		        String isFilledString = input.next();
		        boolean isFilled = (isFilledString.equals("true"));
		        String color = input.next();
		        System.out.print("Is the triangle filled? true/false: ");

		        Triangle_ shape = new Triangle_ (sides[0], sides[1], sides[2]);
		        shape.setColor(color);
		        shape.setFilled(isFilled);
		        System.out.println("Area = " + shape.getArea());
		        System.out.println("Perimeter = " + shape.getPerimeter());
		        System.out.println("Color = " + shape.getColor());
		        System.out.println("Is filled? " + shape.isFilled());

		}

	}

