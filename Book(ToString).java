import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

 
    public String toString() {
        return "Book name: " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of pages: " + this.numPages + "\n";
    }
}

class BookDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;

        System.out.println("Enter the number of books:");
        n = s.nextInt();
        s.nextLine();

        Books b[] = new Books[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.println("Name:");
            name = s.nextLine();
            System.out.println("Author:");
            author = s.nextLine();
            System.out.println("Price:");
            price = s.nextInt();
            System.out.println("Number of pages:");
            numPages = s.nextInt();
            s.nextLine();

            b[i] = new Books(name, author, price, numPages);
        }
        System.out.println("Name: Krithika\nUSN:1BM23CS159");
        System.out.println("Book Details:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Details for book " + (i + 1) + ":");
            System.out.println(b[i].toString());
        }

    }
}
