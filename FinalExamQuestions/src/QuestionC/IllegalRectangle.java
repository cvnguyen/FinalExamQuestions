package QuestionC;

public class IllegalRectangle extends Exception {
	
	private int X;
	private int Y; 
	
	public IllegalRectangle(int X, int Y)
	   {
	      this.X = X;
	      this.X = Y;
	   } 
	   public double ComputeArea()
	   {
	      return X*Y;
	   }
}

/* I want to test via Junit that the exception is actually thrown. Check out this page (right above 10.4) to see how:

http://www.vogella.com/tutorials/JUnit/article.html#juniteclipse_test

If either X or Y is not greater than zero, I want you to capture both the X and Y values and throw a new exception. To complete, you'll have to:

1) Create a new exception class. Call it IllegalRectangle.

2). Change the Rectangle class so it throws the new exception (based on the X & Y values given).

3). Add a unit test to make sure the new exception is thrown.
*/
