package Objectdemo;

public class Objectdemo {
    int num;
    float gdp;
    public Objectdemo(int num ,float gdp) {
        this.num = num;
        this.gdp = gdp;
    }


    // number representation of the object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((Objectdemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    public static void main(String[] args) {
        Objectdemo obj = new Objectdemo(34,12.3f);
        Objectdemo obj1 = new Objectdemo(34, 55.2f);
        Objectdemo obj3 = new Objectdemo(34,22.3f);
        Objectdemo obj2 = obj1;
        System.out.println(obj2.num);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


        if(obj3 == obj2){
            System.out.println("I am equal");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj is equal");
        }
        int a = 2;
        int b = 2;

        if(a == b){
            System.out.println("Hi");
        }

        System.out.println(obj instanceof Objectdemo);

    }
}
