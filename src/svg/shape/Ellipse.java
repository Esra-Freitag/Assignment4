public class Ellipse{
    private Double cx;
    private Double cy;
    private Double rx;
    private Double ry;

    public Ellipse(){}
    
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

        if(expr.contains("rx=")){
            final Double rxResult= SVGParse.extractDouble(expr,"rx=");
            if(rxResult != null){
                rx=result.doubleValue();
            }
        }

        if(expr.contains("ry=")){
            final Double ryResult= SVGParse.extractDouble(expr,"ry=");
            if(ryResult != null){
                ry=result.doubleValue();
            }
        }
        
    }
   @Override
   public String toString(){
        String characteristics="ellipse: cx="+ cx + " cy=" +cy + " rx="+rx +" ry=" +ry;
        return characteristics;
    }
    
}