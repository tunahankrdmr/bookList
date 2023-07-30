import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();

        books.add(new Book("Lolita",355,"Vladimir Nabokov","11.02.1986"));
        books.add(new Book("Muhteşem Gatsby",80," F. Scott Fitzgerald","12.05.2003"));
        books.add(new Book("Kayıp Zamanın İzinde",55,"Marcel Proust","06.07.1995"));
        books.add(new Book("Ulysses",122,"James Joyce","24.08.1932"));
        books.add(new Book("Dublinliler",250,"James Joyce","29.04.1999"));
        books.add(new Book("Yüzyıllık Yalnızlık",1050,"Gabriel Garcia Marquez","19.08.1972"));
        books.add(new Book("Ses ve Öfke",100,"William Faulkner","10.03.1988"));
        books.add(new Book("Deniz Feneri",653,"Virginia Woolf","01.10.2004"));
        books.add(new Book("Bütün Hikayeler",402,"Flannery O’Connor","30.09.2001"));
        books.add(new Book("Solgun Ateş",780,"Vladimir Nabokov","20.05.1944"));

        Map<String, String> bookName=new TreeMap<>();
        books.stream().forEach(i -> bookName.put(i.getName(),i.getAuthorName()));
        bookName.forEach((name,author)-> System.out.println("Kitap ismi : " + name + " Yazar ismi : " + author));

        System.out.println("------------------------------------------");
        System.out.println("Sayfa sayısı 100 den büyük olan kitaplar");
        System.out.println("------------------------------------------");
        List<Book> page100=books.stream().filter(i-> i.getPageNo()>100).collect(Collectors.toList());
        page100.forEach((i)-> System.out.println("Kitap ismi : " + i.getName() + " Sayfa sayısı : " + i.getPageNo()));
    }
}
