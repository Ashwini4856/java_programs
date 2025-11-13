import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int num_pages;  

    Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;  
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setNumpages(int num_pages) {
        this.num_pages = num_pages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getNumpages() {
        return num_pages;
    }

    public String toString() {
        return "\nBook details:\n" +
               "Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nNumber of pages: " + num_pages;
    }
}

public class BookDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();  

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of book " + (i + 1) + ":");
            
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Author: ");
            String author = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            System.out.println("Number of pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine();  
            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\n-- Book information --");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }

        sc.close();
    }
}
