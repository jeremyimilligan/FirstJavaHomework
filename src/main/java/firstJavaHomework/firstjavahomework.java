package firstJavaHomework;

public class firstjavahomework {
    public static void main(String[] args) {
        System.out.println("This is my first Java Homework!"); //here's an example of a single line comment

        /* And here's an example
        of a multiline comment
         */

        float myFloat = 10.27f;
        byte myByte = (byte) myFloat;

        System.out.println(myFloat);
        System.out.println(myByte);

        int sum1 = 15;
        int sum2 = 3;
        System.out.println(sum1/sum2);

        String firstName = "Jeremy";
        String lastName = "Milligan";
        System.out.println("My name is " + firstName + " " + lastName);

        int x = 81;
        System.out.println(Math.sqrt(x));

        int randomNum = (int)(Math.random() * 11);
        System.out.println(randomNum);

    }

    }
