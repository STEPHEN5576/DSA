package properties.inhertance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(box1);
//        System.out.println(box1.l+" "+box1.h+" "+box1.w);
//        Boxweight box3 = new Boxweight();
//        System.out.println(box3.wieght+" "+ box3.l);
//        Boxweight box4 = new Boxweight(4,4,4,20);
//        System.out.println(box4.l);

//        Box box5 = new Boxweight(2,3,4,8);
//        System.out.println(box5.wieght); you cannot acess the child value
//        in parent class


        // there are many variable in both parent and child classes
        // you are guven acess to variables that are in the ref type i.e BoxWieght
        // hence, you should have acess to weight variable
        //this also means, that the ones you are trying to acess should be initialised
        // but here, when the obj itself if of type parent class, how will you call the constructor of child class
        // this is why error

//        Boxweight box6 = new Box(12,23,23);
//        System.out.println(box6);

        BoxPeice box7 = new BoxPeice(12,32,12,32,32);
        System.out.println(box7.l);

        Box.greeting();

        BoxPeice box8 = new BoxPeice();
        System.out.println(box8.w);
        BoxPeice box9 = new BoxPeice(box8);
        System.out.println(box9.price);

    }
}
