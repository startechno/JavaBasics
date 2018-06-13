package co.ke.startech;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
public class Lesson7 {
    public static void main(String[] args) {
        Person p1 =new Person("John", 65, 1.65, true);
        Person p2 =new Person("Mary", 56, 1.85, false);
        Person p3 =new Person("Dan", 68, 1.45, true);
        Person p4 =new Person("David", 54, 1.48, false);
        Person p5 =new Person("Ester", 53, 1.75, true);
        Person p6 =new Person("Eliza", 68, 1.35, false);
        Person p7 =new Person("Jose", 74, 1.83, true);
        Person p8 =new Person("Edwin", 57, 1.73, false);
        Person p9 =new Person("Timo", 60, 1.66, true);
        Person p10 =new Person("Grace", 58, 1.57, false);
        System.out.println(p4.getNames());
        p4.setNames("Davie");
        //p1 upto p10 are objects but ofcos they are variables
        //Object stores data plus fuctions
        System.out.println(p4.getNames());
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
        p5.printDetails();
        p6.printDetails();
        p7.printDetails();

        Person[] people = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        for (Person x:people ) {
            x.printDetails();
        }
        //Use arrays when you are sure that the data you are dealing with doesn't change or wont change e.g days of the week or number of months

        //Array Lists
        ArrayList<Person> persons=new ArrayList<>();
        for (Person p: people) {
            persons.add(p);
        }
        System.out.println(persons.size());
        persons.remove(0);
        System.out.println(persons.size());
        persons.add(p1);
        System.out.println(persons.size());
        Person z = persons.get(5);
        z.printDetails();
        //persons.clear();
        System.out.println(persons.size());
        persons.sort(Comparator.comparing(Person::getNames).reversed());

        for (Person p:persons) {
            p.printDetails();

        }

        HashMap<String, String> map=new HashMap<>();
        map.put("names", "Dan");
        map.put("color", "Black");
        map.put("gender", "male");
        System.out.println(map.get("names"));









    }
}
