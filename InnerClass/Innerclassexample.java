package InnerClass;
// outside class cannot be static
public class Innerclassexample {

    // now because i am using static it is dependent on the class not the object
    // internally it can have objects only inside this class it is not dependent on object but it can have its
    // own object inside it
    // note static resovle during compile time , objects are created in run time but not static and classes
    static class Test{
         String name;
        Test(String name){
            this.name= name;
        }
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("stephen");
        Test b = new Test("ron");
//        System.out.println(a.name);
//        System.out.println(b.name);
        System.out.println(a);


    }

}

