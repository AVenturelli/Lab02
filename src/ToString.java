import jdk.internal.dynalink.beans.StaticClass;

public class ToString {
    private String a;
    private double b;

    private double ret_b;
    private String ret_a;

    public ToString()
    {
        this.a = "";
        this.b = 0;
    }
    public void setta(double x, String y)
    {
        this.a = y;
        this.b = x;
    }
    public double num()
    {
        return this.b;
    }
    public String str()
    {
        return this.a;
    }
    public String stringa(double k)
    {
        ret_a = Double.toString(k);
        return ret_a;
    }
    public double numero(String s)
    {
        ret_b = Double.valueOf(s);
        return ret_b;
    }
}
