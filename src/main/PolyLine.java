public class PolyLine extends Shape {
	private List<Point2D> points;
	
	/** Default constructor without starting parameters
	*/
	public PolyLine () {
		setLabel("polyline");
		points = new ArrayList<Point2D>();
	}
	
	/** Parametric constrctor with a starting list of points
	*/
	public PolyLine (List<Point2D> startingPoints) {
		this();
		
		for (int i = 0; i < startingPoints.size(); i ++) {
			points.add(startingPoints.get(i));
		}
	}
	
	/** Adds a point to the list of points of the PolyLine
	
		@param newPoint, the new point to add to the list
	*/
	public void addPoint(Point2D newPoint) {
		if (points != null) {
			points.add(newPoint);
		}
	}
	
	/** Adds a point to the list of points of the PolyLine
		
		@param x, y, the coordinates of the point to add to the list
	*/
	public void addPoint(double x, double y) {
		addPoint(new Point2D(x, y));
	}
	
	/** Creates a new PolyLine object with the same contents as this Object
	
		@return the new PolyLine object with the same contents
	*/
	public PolyLine clone() {
		PolyLine newObject = new PolyLine(points);
		
		return newObject;
	}
	
	/** Return a string representing the PolyLine's points
	
		@return a string
	*/
	public String toString () {
		String result = label;
		
		for (int i = 0; i < points.size(); i ++) {
			result = result + points.get(i) + ", ";
		}
		
		return result;
	}
}