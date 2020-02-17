package kalkulator;

public class Logaritma {
    double x;
    public void setLog(double x){
        this.x = x;
    }
    public double getLog(){
        double Hlog = Math.log10(x);
        return Hlog;
    }
    
}
