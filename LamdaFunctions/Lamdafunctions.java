package LamdaFunctions;



import java.util.ArrayList;

import java.util.function.Consumer;

public class Lamdafunctions {
    public static void main(String[] args) {
        int [] arr ={3,4,5,2};
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i =0; i<5; i++){
            arr1.add(i+1);
        }
        int a = 1;
        int b = 2;
        
        System.out.println(b);
        arr1.forEach((item) -> System.out.println(item+2));
        Consumer<Integer> fun = (item) -> System.out.println("Consumer "+ item * 2);

        arr1.forEach(fun);
//
//         Sum son = new Lamdafunctions();
//         son.sum(20,30);
         Operation sum = (a1, b1) ->a1 + b1;
         Operation sub = (a1, b1) ->a1 - b1;
         Operation mul = (a1, b1) ->a1 * b1;
         Operation div = (a1, b1) ->a1 / b1;
        System.out.println(sum.operate( a , b));
        Lamdafunctions myCalculator = new Lamdafunctions();
        System.out.println(myCalculator.operate(5,3,sub));
        System.out.println(myCalculator.operate(5,3,sum));

    }



    private int operate(int a, int b, Operation op) {
       return op.operate(a , b);
    }
}

interface Operation{
    int operate(int a, int b );

}

