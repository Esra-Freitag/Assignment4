public class Line extends Shape{
	private Double x1, y1, 
			x2, y2;
	
	@Override
	public boolean load(String expr) {
		if (expr.contains(" x1="))
		{
			final Double result = SVGParser.extractDouble(expr, " x1=");
			if (result != null)
			x1 = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" y1="))
		{
			final Double result = SVGParser.extractDouble(expr, " y1=");
			if (result != null)
			y1 = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" x2="))
		{
			final Double result = SVGParser.extractDouble(expr, " x2=");
			if (result != null)
				x2 = result.doubleValue();
		} else {
			return false;
		}
		
		if (expr.contains(" y2="))
		{
			final Double result = SVGParser.extractDouble(expr, " y2=");
			if (result != null)
			y2 = result.doubleValue();
		} else {
			return false;
		}
	}
	
	@Override
	public String label() {
		String characteristics = "line: x1=" + x1 + " y1=" + y1 + 
										" x1=" + x2 + " y2=" + y2;
		return characteristics;
	}
}
