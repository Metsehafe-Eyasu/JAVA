class A{
    public void a(){
        System.out.println('a');
    }
    public void b(){
        System.out.println('b');
    }
    // public String toString(){
    //     return "Class A";
    // }
}
public class TestA extends A {
    public static void main(String[] args) {
        TestA t = new TestA();
        System.out.println(t.toString());
        t.a();
        t.b();
    }
}
