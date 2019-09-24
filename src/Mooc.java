import java.util.Scanner;

public class Mooc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What do you want me do? ");
        int selector = Integer.parseInt(reader.nextLine());
        switch(selector){

            case 0:
                //help for user
                //TODO branch to beginning

                System.out.print("Type 1 for an adder, 2 for divider");
                break;
            case 1:
                //simple adder
                //might combine all algorithmic functions in the future

                System.out.print("Type a number: ");
                int number1 = Integer.parseInt(reader.nextLine());
                System.out.print("Type another number: ");
                int number2 = Integer.parseInt(reader.nextLine());

                System.out.print(number1 + number2);
                break;

            case 2:
                //simple divider

                System.out.print("Type a number: ");
                double divnumber1 = Integer.parseInt(reader.nextLine());
                System.out.print("Type another number: ");
                double divnumber2 = Integer.parseInt(reader.nextLine());

                System.out.print(divnumber1 / divnumber2);
                break;

            case 3:
                //calculate circumference of a circle

                System.out.print("Type the radius: ");
                double circNumber1 = Integer.parseInt(reader.nextLine());
                System.out.print(2 * Math.PI * circNumber1);
                break;

            case 4:
                //returns bigger number

                System.out.print("Type a number: ");
                double bigNumber1 = Integer.parseInt(reader.nextLine());
                System.out.print("Type another number: ");
                double bigNumber2 = Integer.parseInt(reader.nextLine());

                System.out.print(Math.max(bigNumber1, bigNumber2));
                break;

            case 5:
                //combine age of two people
                System.out.print("Type your name: ");
                String name = reader.nextLine();
                System.out.print("Type your age: ");
                int age1 = Integer.parseInt(reader.nextLine());

                System.out.print("Type your name: ");
                String name2 = reader.nextLine();
                System.out.print("Type your age: ");
                int age2 = Integer.parseInt(reader.nextLine());

                System.out.print(name + " and " + name2 + " are " + (age1 + age2) + " years old in total." );
                break;


        }

    }

}
