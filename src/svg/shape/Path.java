package svg.shape;

import java.util.ArrayList;

import svg.element.Element;


public class Path extends Shape {
    private ArrayList<PathOp> pathOperation ;
	public Path(String label) {
		super(label);
		 pathOperation = new ArrayList<PathOp>();
	
	}
	@Override
	public Element newInstance() {
		return new Path("path");
		
	}
	@Override
	public boolean load(final String expr) {
		String str="";
		int j=0; int k=0;
		
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
			str=expr.substring(k,j);			
		}
		
	if(str.contains("M" )){
		MoveTo.newInstance(str);
		
	}
if(str.contains("Q")){
	QuadTo.newInstance(str);
	}
if(str.contains("z")) {
	Close.newInstance(str);
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

