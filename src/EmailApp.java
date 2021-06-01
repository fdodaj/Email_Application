import java.util.Scanner;

public class EmailApp {


    public static void main(String[] args) {
        String department;
        String email;

        System.out.println("Enter the department\n1 for sales \n2 for develop \n3 for accounting \n0 for none :\n");
          switch (new Scanner(System.in).nextInt()) {
            case 1:
                department = "Sales";
                break;
            case 2:
                department = "develop";
                break;
            case 3:
                department = "accounting";
                break;
            default:
                department = "random";
        }

        Email obj = new Email("Florian", "Dodaj",  randomPassword(8), department);

        obj.setEmail();
        System.out.println(obj.showInfo());



    }



    //generate a random password
    private static String randomPassword(int length) {
        String passwordSet = "qwertyuiopasdfghjklzxcvbnm123457890^%$&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }
}
