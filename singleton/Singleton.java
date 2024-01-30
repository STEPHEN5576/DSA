package singleton;

public class Singleton {
    private int a;

     private Singleton(){
         this.a= 10;

    }
    @Override
    public String toString() {
        return Integer.toString(a); // Convert int to String
    }

    private static Singleton instance;
     public static Singleton getInstance(){
         if(instance == null){
             instance = new Singleton();
         }
         return instance;
     }
}
