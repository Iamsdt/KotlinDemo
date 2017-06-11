package firstKotlin;

import java.util.Scanner;

public class FristClass {

    private static String[] book = { "java", "c", "c++", "php", "javascript", "html" };

    private static Scanner scanner = new Scanner(System.in);

    private final static float studentdiscount = .3f;
    private final static float teacherdiscount = .2f;
    private static boolean flag = true;

    public static void main(String[] args) {
        if (flag) {
            pl("*************WELCOME TO OUR BOOK STORE**********");
        }
        pl("Which book do you want?");
        p();
        String bookname = scanner.nextLine();

        if (bookname.toLowerCase().equals(book[0])) {
            wantedbook(bookname);
            discount();

        } else if (bookname.toLowerCase().equals(book[1])) {
            wantedbook(bookname);
            discount();

        } else if (bookname.toLowerCase().equals(book[2])) {
            wantedbook(bookname);
            discount();

        } else if (bookname.toLowerCase().equals(book[3])) {
            wantedbook(bookname);
            discount();

        } else if (bookname.toLowerCase().equals(book[4])) {
            wantedbook(bookname);
            discount();

        } else if (bookname.toLowerCase().equals(book[5])) {
            wantedbook(bookname);
            discount();

        } else {
            pl("Sorry we don't have " + bookname + " book.");
        }

        pl("\nDo you Want more book?");
        p();
        String ans = scanner.nextLine();
        flag = false;

        if (ans.toLowerCase().equals("yes")) {
            pl("\n");
            main(null);
        } else {
            pl("\n");
            pl("********Thank YOU FOR SHOPPING********");
        }

    }

    // methods

    private static void discount() {
        pl("Are you Student or Teacher or General Customar?");
        p();
        String userinput = scanner.nextLine();

        if (userinput.toLowerCase().equals("student")) {
            calculateprice(studentdiscount);
        } else if (userinput.toLowerCase().equals("teacher")) {
            calculateprice(teacherdiscount);
        } else {
            pl("You Can not get Discount.");
            pl("your Total Payable Price is 200 TK.");

        }

    }

    private static void calculateprice(float discount) {
        double price = 200;
        price -= price * discount;
        showprice(price);
    }

    private static void showprice(double price) {
        String prices = String.format("%.2f", price);
        pl("your Total Payable Price is : " +prices+ " TK.");

    }

    private static void wantedbook(Object object) {
        pl("You Want " + object + " book. price 200 Tk.");
    }

    private static void p() {
        System.out.print("Answer: ");
    }

    private static void pl(Object object) {
        System.out.println(object);
    }
}