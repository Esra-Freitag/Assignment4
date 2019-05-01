package svg.shape;

import svg.SVGParser;
import svg.element.PathOp;

public class QuadTo extends PathOp {
	private static double x1;
	private static double y1;
	private  static double x2;
	private  static double y2;
	
	public static void newInstance(String str) {
	new QuadTo();
	load(str);
		
	}
	public static boolean load(final String expr) {
		if (expr.contains(" x1="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " x1=");
			 	 if (result != null)
			 	 	 x1 = result.doubleValue();
		}
		if (expr.contains(" y1="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " y1=");
			 	 if (result != null)
			 	 	 y1= result.doubleValue();
		}
		if (expr.contains(" x2="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " x1=");
			 	 if (result != null)
			 	 	 x1 = result.doubleValue();
		}
		if (expr.contains(" y2="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " y1=");
			 	 if (result != null)
			 	 	 y1= result.doubleValue();
		}
		
		return true;
	}
}



