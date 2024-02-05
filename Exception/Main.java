package Exception;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

       try{
//           divide(a , b);
           // more strick rules should above

           // mimicking
           String name = "Stephen";
           if(name.equals("Stephen")){
               throw new MyException("name is stephen");
           }
           throw new Exception("just for fun");

       } catch(MyException e){
           System.out.println(e.getMessage());

       }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
           // evry other expection are the sub class
           // of this exception so it has be below
       } catch (Exception e){
           System.out.println("normal exception");
       } finally {
           System.out.println("this will always run");
       }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by Zero");
        }
        return a / b;
    }
}
