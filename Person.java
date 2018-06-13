package co.ke.startech;

public class Person {
    //Properties of a person
    String names;
    double weight;
    double height;
    boolean rightHanded;
    //Special function called a constructor

    public Person(String names, double weight, double height, boolean rightHanded) {
        this.names = names;
        this.weight = weight;
        this.height = height;
        this.rightHanded = rightHanded;
    }

    //getters and setters ==functions


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public void setRightHanded(boolean rightHanded) {
        this.rightHanded = rightHanded;
    }

    public void printDetails(){
        String hand =isRightHanded()?"Right Hnaded": "Left Handed";
        System.out.println(names+ ""+weight+ "" +height+ ""+hand);
    }
}
