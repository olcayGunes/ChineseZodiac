import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short yearOfBirth;

        System.out.print("Doğum Yılınızı Giriniz: ");
        yearOfBirth = input.nextShort();

        if (yearOfBirth % 12 == 0) {
            System.out.println("Maymun");
        } else if (yearOfBirth % 12 == 1) {
            System.out.println("Horoz");
        } else if (yearOfBirth % 12 == 2) {
            System.out.println("Köpek");
        } else if (yearOfBirth % 12 == 3) {
            System.out.println("Domuz");
        } else if (yearOfBirth % 12 == 4) {
            System.out.println("Fare");
        } else if (yearOfBirth % 12 == 5) {
            System.out.println("Öküz");
        } else if (yearOfBirth % 12 == 6) {
            System.out.println("Kaplan");
        } else if (yearOfBirth % 12 == 7) {
            System.out.println("Tavşan");
        } else if (yearOfBirth % 12 == 8) {
            System.out.println("Ejderha");
        } else if (yearOfBirth % 12 == 9) {
            System.out.println("Yılan");
        } else if (yearOfBirth % 12 == 10) {
            System.out.println("At");
        } else if (yearOfBirth % 12 == 11) {
            System.out.println("Koyun");
        }
    }
}
