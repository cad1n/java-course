package Application;

public class Program {

    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (String s : vect) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        for(String obj : vect){
            System.out.println(obj);
        }
    }
}
