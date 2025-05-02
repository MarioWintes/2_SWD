package uebung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<Integer, Member> members = new HashMap<>();
    private Map<Integer, Book> books = new HashMap<>();

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public List<Member> listMembers() {
        return new ArrayList<>(members.values());
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books.values());
    }

    public boolean borrowBook(int memberId, int bookId) {
        Member m = members.get(memberId);
        Book b = books.get(bookId);
        if (m != null && b != null && !b.isBorrowed()) {
            m.borrowBook(b);
            b.setBorrowed(true);
            return true;
        }
        return false;
    }

    public boolean returnBook(int memberId, int bookId) {
        Member m = members.get(memberId);
        Book b = books.get(bookId);
        if (m != null && b != null && b.isBorrowed()) {
            m.returnBook(b);
            b.setBorrowed(false);
            return true;
        }
        return false;
    }
}