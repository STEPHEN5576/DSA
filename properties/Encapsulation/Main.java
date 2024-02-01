package properties.Encapsulation;

import com.sun.source.tree.UsesTree;

public class Main {
    public static void main(String[] args) {


        A obj = new A(25,"Stephen");
        // need to do a few things
        // 1. acess the data memebers
        // 2. modify the data memebers
        System.out.println(obj.getNum());
        System.out.println(obj.setName("Ron"));
        obj.setNum(20);

        // it will not allow in different package if it was private
        int n = obj.num;
    }
}
