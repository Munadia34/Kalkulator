
package Trigono;


public class Sudut {
    double x = 0.0;
    public void setSudut(double x){
        this.x = x;
    }
    public double getSin(){
    double Hsin = Math.sin(Math.toRadians(x));
    return Hsin;
    }
    public double getCos(){
    double Hcos = Math.cos(Math.toRadians(x));
    return Hcos;
    }
    public double getTan(){
    double Htan = Math.tan(Math.toRadians(x));
    return Htan;
    }

}
