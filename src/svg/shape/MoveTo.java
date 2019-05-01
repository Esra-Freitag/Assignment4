package svg.shape;
import svg.SVGParser;

public class MoveTo extends PathOp {
	private  static double x;
	private static  double y;

	public static void newInstance(String str) {
		new MoveTo();
		load(str);
	}

	public static boolean load(final String expr) {
		if (expr.contains(" x="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " x=");
			 	 if (result != null)
			 	 	 x = result.doubleValue();
		}
		if (expr.contains(" y="))
		{
			 	 final Double result = SVGParser.extractDouble(expr, " y=");
			 	 if (result != null)
			 	 	 y= result.doubleValue();
		}
		return true;
	}
}

