package Quiz;

public class Triangle {
    private int base;
    private int height;
    private int hypotenuse;

    Triangle(){
        this.base = 3;
        this.height = 4;
        this.hypotenuse = 5;
    }
    Triangle(int base, int height, int hypotenuse){
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public int getArea(){
        int area = base*height*hypotenuse;
        return area;
    }
    public int getPerimeter(){
        int perimeter = base + height + hypotenuse;
        return perimeter;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getBase(){
        return this.base;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHypotenuse(int hypotenuse){
        this.hypotenuse = hypotenuse;
    }
    public int getHypotenuse(){
        return this.hypotenuse;
    }
}