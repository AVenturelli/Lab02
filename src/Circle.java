public class Circle {
    private int ascisse;
    private int ordinate;
    private int raggio;
    final double pigreco = 3.14;

    public Circle(int ascisse, int ordinate, int raggio) {
        this.ascisse = 0;
        this.ordinate = 0;
        this.raggio = 0;
    }
    public void print()
    {
        System.out.println(this.ascisse);
        System.out.println(this.ordinate);
        System.out.println(this.raggio);
        System.out.println(this.pigreco);
    }

}
