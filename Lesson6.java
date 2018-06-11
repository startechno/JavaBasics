package co.ke.startech;


import co.ke.startech.hidden.Hidden; //ALT+ENTER

public class Lesson6 {
    public static void main(String[] args) {
        Functions.area(5, 10);
        Functions x = new Functions();
        x.converter(19000, "USD", true);
        System.out.println(x.volume(5.6));
        Hidden h=new Hidden();
        h.add(7, 12);


    }
}
