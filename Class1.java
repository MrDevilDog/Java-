public class Class1
{
    int n;
    String s;
    public Class1()
    {
        System.out.println("Default Constructor");
        System.out.println("n="+n+"s="+s);

    }
    public void setN(int n1)
    {
        n=n1;   
    

    }
    public void setS(String s1)
    {
        s=s1;

    }
    public int getN()
    {
        return n;
    }
    public String getS()
    {
        return s;
    }
    public static void main(String args[])
    {
        Class1 c1 = new Class1();
        c1.setN(12);
        c1.setS("Harshit");
        System.out.println("n="+c1.getN());
        System.out.println("s="+c1.getS());

    } 
}