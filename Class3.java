class A{
    private int i;
    private String s;
    public A(){
        System.out.println("Inside Default Constructor of A by Harshit");
    }
    public void setI(int i){
        this.i=i;
    }
    public void setS(String s){
        this.s=s;
    }
    public int getI(){
        return i;
    }
    public String getS(){
        return s;
    }
    public void display(){
        System.out.println("display function inside class A");
    }
}
class B extends A{
    public B(){
        System.out.println("Inside Default Constructor of B");
    }
    public void display(){
        System.out.println("display function inside class B");
    }
}
class C extends B{
    public C(){
        System.out.println("Inside constructor of C");
    }
    public void display(){
        System.out.println("display function inside class C");
    }
}
interface D1{
    public void display1();
}
interface D2 {
    public void display2();
}
class D extends A implements D1,D2{
    public void display1(){
        System.out.println("display1 of interface D1");
    }
    public void display2(){
        System.out.println("display2 of interface D2");
    }
}
public class Class3{
    public static void main(String arg[]){
        System.out.println("Calling constructor of A");
        A a=new A();
        System.out.println("Calling constructor of B");
        B b=new B();
        System.out.println("Calling constructor of C");
        C c=new C();
        System.out.println("Calling constructor of D");
        D d=new D();
        d.display();
        d.display1();
        d.display2();
        a.setS("Harshit Mishra ");
        a.setI(35);
        a.display();
        b.display();
        c.display();
    }
}