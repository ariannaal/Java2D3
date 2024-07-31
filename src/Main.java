import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("ESERCIZIO 1");
        
        List<Product> prodotti = new ArrayList<>();

        Product prodotto1 = new Product(1, "Harry Potter", "Books", 80.99);
        prodotti.add(prodotto1);

        Product prodotto2 = new Product(2, "The Lord of The Rings", "Books", 130.99);
        prodotti.add(prodotto2);

        Product prodotto3 = new Product(3, "Pride and Prejudice", "Books", 160.99);
        prodotti.add(prodotto3);

        Product prodotto4 = new Product(4, "Wuthering Heights", "Books", 65.99);
        prodotti.add(prodotto4);

        Product prodotto5 = new Product(5, "Lolita", "Books", 110.99);
        prodotti.add(prodotto5);


        List<Product> libri = prodotti.stream()
                .filter(book -> book.getCategory().equals("Books") && book.getPrice() > 100)
                .toList();

        libri.forEach(book -> System.out.println(book));


    }
}