public class Circle{
    private Double cx;
    private Double cy;
    private Double r;

    public Circle(){}
    
    public void load(String expr){
        if(expr.contains("cx=")){
            final Double cxResult= SVGParser.extractDouble(expr,"cx=");
            if(cxResult!= null){
                cx=result.doubleValue();
            }
        }
        if(expr.contains("cy=")){
            final Double cyResult=SVGParse.extractDouble(expr,"cy=");
            if(cyResult!= null){
                cy=result.doubleValue();
            }
        }

        if(expr.contains("r=")){
            final Double rResult= SVGParse.extractDouble(expr,"r=");
            if(rResult != null){
                r=result.doubleValue();
            }
        }
    }
    public String label(){
        String characteristics="circle: cx="+ cx + " cy=" +cy + " r="+r;
        return characteristics;
    }
    
}
