import svg.SVGParser;
import svg.element.Element;

public class Circle extends Shape{
    private Double cx;
    private Double cy;
    private Double r;

    public Circle(){}
    
    public boolean load(String expr){
        if(expr.contains("cx=")){
            final Double result= SVGParser.extractDouble(expr,"cx=");
            if(result!= null){
                cx=result.doubleValue();
            }else{
                return false;
            }
        }
        if(expr.contains("cy=")){
            final Double result=SVGParser.extractDouble(expr,"cy=");
            if(result!= null){
                cy=result.doubleValue();
            }else{
                return false;
            }
        }

        if(expr.contains("r=")){
            final Double result= SVGParser.extractDouble(expr,"r=");
            if(result != null){
                r=result.doubleValue();
            }else{
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        String characteristics="circle: cx="+ cx + " cy=" +cy + " r="+r;
        return characteristics;
    }

    
}
