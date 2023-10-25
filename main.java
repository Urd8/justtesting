enum ShapeColor { Blue, Yellow, Red, Green, White };

interface ForTwoD{
    public double perimeter();
    public void recolor(ShapeColor sc);
};

interface Shape{
    public double area(
        //You can put some useful constants in this interface, for example the PI.
    );
};

interface ForThreeD{
    public double volume();
    public void resize(double percentage);
};


abstract class TwoD implements Shape, ForTwoD{
    protected ShapeColor sc;
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    private int a2;

    public TwoD(){
        //
    };
    public TwoD(ShapeColor sc, int a){
        //Circle or Square
    };
    public TwoD(ShapeColor sc, int a,int b){
        //Rectangle
    };
    public TwoD(ShapeColor sc, int a,int b,int c){
        //Triangle if can be made
    };
    public TwoD(ShapeColor sc, int a,int b,int c,int d){
        //For a Trapezoid maual says to take 5 numbers but only 3 provided
    };
    public TwoD(TwoD td){
        //
    };
    public int getA(){
        return a;
    };
    public int getB(){
        return b;
    };
    public int getC(){
        return c;
    };
    public int getD(){
        return d;
    };
    public ShapeColor getShapeColor(){
        return sc;
    };
    public void set(ShapeColor sc,int a){
        this.sc = sc;
        this.a =a;
    };
    public void set(ShapeColor sc,int a,int b){
        this.sc = sc;
        this.a = a;
        this.b= b;
    };
    public void set(ShapeColor sc,int a,int b,int c){
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    };
    public void set(ShapeColor sc,int a,int b, int c,int d){
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    };
    public void recolor(ShapeColor sc){
        this.sc = sc;
    }
    public String toString(){
        return("String message of TwoD");
    }


};

public class main {
    public static void main(String[] args) {

    }
}

