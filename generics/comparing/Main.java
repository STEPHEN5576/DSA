package generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student stephen = new Student(12,89.76f);
        Student ron = new Student(5,91.67f);

        if(stephen.compareTo(ron) < 0){
            System.out.println("Ron has more marks");
        }


    }
}
