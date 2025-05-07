
public class constructor {

	
		class Rectangle {
		    int length;
		    int breadth;

		    
		    Rectangle() {
		        length = 1;           
		        breadth = 1;
		        System.out.println("Default Constructor: length = " + length + ", breadth = " + breadth);
		    }

		    
		    Rectangle(int l, int b) {
		        length = l;
		        breadth = b;
		        System.out.println("Parameterized Constructor: length = " + length + ", breadth = " + breadth);
		    }

		   
		    int getArea() {
		        return length * breadth;
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        
		        Rectangle rect1 = new Rectangle();

		      
		        Rectangle rect2 = new Rectangle(5, 10);

		        // Display area for each rectangle
		        System.out.println("Area of rect1 = " + rect1.getArea());
		        System.out.println("Area of rect2 = " + rect2.getArea());
		    }
		}


	}


