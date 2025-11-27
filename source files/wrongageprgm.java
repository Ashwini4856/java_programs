import java.util.Scanner;


class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    } 
}


class WrongSonAgeException extends Exception {
    public WrongSonAgeException(String message) {
        super(message);
    }
}


class Father {
    int fatherAge;

    Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}


class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAgeException, WrongSonAgeException {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongSonAgeException("Son's age must be less than father's age!");
        }

        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class wrongageprgm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Father's age: ");
            int fAge = sc.nextInt();

            System.out.print("Enter Son's age: ");
            int sAge = sc.nextInt();

            
            Son s = new Son(fAge, sAge);
        }
        catch (WrongAgeException | WrongSonAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
