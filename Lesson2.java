package co.ke.startech;

public class Lesson2 {
    public static void main(String[] args) {
        String original_username = "123@gmail.com";
        String original_password = "12345";

        String username = "123@gmail.com";
        String password = "12345";

        if (original_username == username && original_password == password) {
            System.out.println("logged in successfully");
        } else {
            System.out.println("Wrong username or password");
        }


    }
}