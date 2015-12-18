package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() throws IllegalRectangle {
		
		
		if(this.getX() < 0 & this.getY() < 0)
		{
			throw new IllegalRectangle();
		}
}
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
