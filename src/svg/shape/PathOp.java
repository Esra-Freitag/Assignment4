package svg.shape;

public class PathOp  {

protected char label;
protected boolean absolute;

    public PathOp(char s){

        absolute=false;
        label=s;

    }
    public PathOp(){}

    public static boolean load(String expr){
        if (expr.contains("M"))
        {
            MoveTo.load(expr);
        }
        if (expr.contains("Q"))
        {
            QuadTo.load(expr);
        }
        if (expr.contains("z"))
        {
            Close.load(expr);
        }

        return true;

    }

    public static PathOp newInstance(char s){
        return new PathOp(s);

    }

    public char getLabel(){
        return label;
    }

}

