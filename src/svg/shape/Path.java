package svg.shape;

import java.util.ArrayList;


public class Path extends Shape {

    private ArrayList<PathOp> objectsOfPathOp ;
    private String expr;

	public Path(String label, String expr) {

		super(label);
		this.expr=expr;
		objectsOfPathOp = new ArrayList<PathOp>();
	
	}

	@Override
	public boolean load(String expr) {
		String str="";
		int j=0;
		int k=0;
		
		int len=expr.length();
		char c;
		for(int i=0;i<len;i++) {
	    
			c=expr.charAt(i);
			if(c=='d') {
				 k=i+2;
			}
			if(c=='z') {
				 j=i+1;
			}
		}

		str=expr.substring(k,j);
		
	if(str.contains("M")){
		objectsOfPathOp.add(PathOp.newInstance('M'));
		PathOp.load(str);
	}

    if(str.contains("Q")){
		objectsOfPathOp.add(PathOp.newInstance('Q'));
		PathOp.load(str);
	}
    if(str.contains("z")) {
		objectsOfPathOp.add(PathOp.newInstance('z'));
		PathOp.load(str);
}
			
	/*f (expr.contains("d="))
		{//m,q,z
			//m will be given to load method of moveto class
			//q to quad to
			//z to close
			
			final Double result = SVGParser.extractDouble(expr, "d=");
				double d;
				if (result != null)
			 	 	 d = result.doubleValue();
		}*/
		return true;
	}

}

