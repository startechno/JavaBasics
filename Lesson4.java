package co.ke.startech;

public class Lesson4 {
    public static void main(String[] args) {
        //Array Creating many people with different heights and weight
        double[] heights = {1.89, 1.90, 1.76, 2.04, 1.27};
        String[] names = {"John", "Mary", "Dan", "Ken", "Dav"};
        //Acceess element == position
        System.out.println(names[0]);
        System.out.println(names[4]);
        System.out.println(names[0] + " " + heights[0]);
        System.out.println(names[3] + " " + heights[3]);
        System.out.println(names[2] + " " + heights[2]); //An error is known as an Exception


        try {
            double results = 10/0;
            System.out.println(names[5] + " " + heights[5]);
        } catch (Exception X) {
            System.out.println("Error While Printing");
        }


    }
}
