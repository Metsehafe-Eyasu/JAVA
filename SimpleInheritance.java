public class SimpleInheritance {
    int i, j;
    void show(){
        System.out.println(i + " " + j);
    }
}

class B extends SimpleInheritance{
    int k;
    void showk(){
        System.out.println(k);
    }
    void sum(){
        System.out.println("Sum: " + (i+j+k));
    }
}

class Main{
    public static void main(String[] args) {
        SimpleInheritance val= new SimpleInheritance();
        B sec = new B();
        val.i = 10;
        val.j = 20;
        val.show();


        sec.i =7;
        sec.j =8;
        sec.k =9;

        sec.show();
        sec.showk();
        sec.sum();
    }
}
