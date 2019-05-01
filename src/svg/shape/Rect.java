public class Rect extends Shape{
	private double x, y, rx, ry;
	private double width, height;
	
	@Override
	public boolean load(String expr) {
		if (expr.contains(" x="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " x=");
			 	 if (result != null)
			 	 	 x = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" y="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " y=");
			 	 if (result != null)
			 	 	 y = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" rx="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " rx=");
			 	 if (result != null)
			 	 	 rx = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" ry="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " ry=");
			 	 if (result != null)
			 	 	 ry = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" width="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " width=");
			 	 if (result != null)
			 	 	 width = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" height="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " height=");
			 	 if (result != null)
			 	 	 height = result.doubleValue();
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String characteristics = "rect: x=" + x +
								" y=" + y + 
								" rx=" + rx + 
								" ry=" + ry + 
								" width=" + width + 
								" height=" + height;
		return characteristics;
	}
}
