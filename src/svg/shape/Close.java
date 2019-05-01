package svg.shape;

import svg.element.PathOp;

public class Close extends PathOp {

	public static void newInstance(String str) {
		new Close();
	
	}
	
	public boolean load(final String expr) {
	return true;
}

}
