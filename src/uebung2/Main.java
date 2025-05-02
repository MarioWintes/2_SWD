package uebung2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Bibliothekssystem ---");
            System.out.println("0. Beenden");
            System.out.println("1. Mitglied anlegen");
            System.out.println("2. Mitglieder auflisten");
            System.out.println("3. Buch anlegen");
            System.out.println("4. Bücher auflisten");
            System.out.println("5. Buch ausleihen");
            System.out.println("6. Buch zurückgeben");
            System.out.print("Auswahl: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Mitglieds-ID: ");
                    int mId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String mName = sc.nextLine();
                    library.addMember(new Member(mId, mName));
                    break;
                case 2:
                    System.out.println("Mitglieder:");
                    List<Member> members = library.listMembers();
                    for (Member member : members) {
                        System.out.println(member);
                    }
                    break;
                case 3:
                    System.out.print("Buch-ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titel: ");
                    String title = sc.nextLine();
                    System.out.print("Autor: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bId, title, author));
                    break;
                case 4:
                    System.out.println("Bücher:");
                    library.listBooks().forEach(System.out::println);
                    break;
                case 5:
                    System.out.print("Mitglieds-ID: ");
                    mId = sc.nextInt();
                    System.out.print("Buch-ID: ");
                    bId = sc.nextInt();
                    System.out.println(library.borrowBook(mId, bId) ? "Erfolgreich ausgeliehen." : "Ausleihe fehlgeschlagen.");
                    break;
                case 6:
                    System.out.print("Mitglieds-ID: ");
                    mId = sc.nextInt();
                    System.out.print("Buch-ID: ");
                    bId = sc.nextInt();
                    System.out.println(library.returnBook(mId, bId) ? "Erfolgreich zurückgegeben." : "Rückgabe fehlgeschlagen.");
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }
    }
}