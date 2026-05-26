package rvt.interbox;

public class interbox_main {
    public static void main(String[] args) {

        interbox_box box = new interbox_box(10);
        interbox_box anotherBox = new interbox_box(5);

        box.add(new interbox_book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 0.5)) ;
        box.add(new interbox_book("George R.R. Martin", "A Game of Thrones", 1.8));
        box.add(new interbox_book("J.R.R. Tolkien", "The Lord of the Rings", 2.5));

        box.add(new interbox_cd("The Beatles", "Abbey Road", 1969));
        box.add(new interbox_cd("Queen", "A Night at the Opera", 1975));
        box.add(new interbox_cd("David Bowie", "Ziggy Stardust and the Spiders from Mars", 1972));
        box.add(new interbox_cd("Led Zeppelin", "IV", 1971));

        anotherBox.add(new interbox_cd("Pink Floyd", "The Wall", 1979));
        anotherBox.add(new interbox_cd("Metallica", "Master of Puppets", 1986));
        anotherBox.add(new interbox_cd("Nirvana", "Nevermind", 1991));
        anotherBox.add(new interbox_cd("The Rolling Stones", "Sticky Fingers", 1971));

        box.add(anotherBox);

        System.out.println(box);
    }
}