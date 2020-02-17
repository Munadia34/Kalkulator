
package Trigono;


public class Arc {
    double x;
     public void setArc(double x){
        this.x = x;
    }
    public double getASin(){
    double Hsin = Math.asin(x);
    return Hsin;
    }
    public double getACos(){
    double Hcos = Math.acos(x);
    return Hcos;
    }
    public double getATan(){
    double Htan = Math.atan(x);
    return Htan;
    }
}
