package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book clean = new Book("Clean code", 464);
        Book java = new Book("Head first java", 720);
        Book algorithms = new Book("Grokking algorithms", 288);
        Book complete = new Book("Java: the complete reference", 1488);
        Book[] books = new Book[4];
        books[0] = clean;
        books[1] = java;
        books[2] = algorithms;
        books[3] = complete;
        for (int index = 0; index < books.length; index++) {
            System.out.println(
                    "Name : " + books[index].getName() + "; number of pages : " + books[index].getQuantity()
            );
        }
        System.out.println("Swap book[0] and book[3].");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(
                    "Name : " + books[index].getName() + "; number of pages : " + books[index].getQuantity()
            );
        }
        System.out.println("Show only name == Clean code");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(
                        "Name : " + books[index].getName() + "; number of pages : " + books[index].getQuantity()
                );
            }
        }
    }
}
