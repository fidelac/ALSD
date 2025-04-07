package jobsheet3;

public class Triangle {
    public int base, height;

    public Triangle(int a, int t){
        base = a;
        height = t;
    }

    public int countArea(){
        return base*height/2;
    }
    
    public int countPerimeter(){
        double hypotenuse = Math.sqrt((base*base) + (height*height)); //Calculate the hypotenuse using the pythagoras
        return (base + height + (int)hypotenuse);
    }
}
