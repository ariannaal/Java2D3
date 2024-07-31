import java.time.LocalDate;
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

        System.out.println("ESERCIZIO 2");


        Product prodotto6 = new Product(6, "Peluche", "Baby", 25.99);
        prodotti.add(prodotto6);

        Product prodotto7 = new Product(7, "Giocattolo", "Baby", 13.99);
        prodotti.add(prodotto7);

        Product prodotto8 = new Product(8, "Puzzle", "Baby", 35.99);
        prodotti.add(prodotto8);
        

        Customer customer1 = new Customer(1L, "Arianna", 1);
        Customer customer2 = new Customer(2L, "Davide", 2);
        Customer customer3 = new Customer(3L, "Chiara", 2);
        Customer customer4 = new Customer(4L, "Gaia", 1);


        Order ordine1 = new Order(LocalDate.of(2024, 5, 21), 1, "delivered", LocalDate.of(2024, 5, 28), List.of(prodotto1, prodotto2), customer1);
        Order ordine2 = new Order(LocalDate.of(2024, 4, 19), 2, "delivered", LocalDate.of(2024, 5, 2), List.of(prodotto3, prodotto4), customer2);
        Order ordine3 = new Order(LocalDate.of(2024, 3, 14), 3, "delivered", LocalDate.of(2024, 3, 20), List.of(prodotto6), customer3);
        Order ordine4 = new Order(LocalDate.of(2024, 6, 5), 4, "delivered", LocalDate.of(2024, 6, 9), List.of(prodotto7, prodotto8), customer4);

        List<Order> ordini = new ArrayList<>();
        ordini.add(ordine1);
        ordini.add(ordine2);
        ordini.add(ordine3);
        ordini.add(ordine4);

        List<Order> ordiniBaby = ordini.stream()
                .filter(ordine -> ordine.getProducts().stream()
                        .anyMatch(prodotto -> prodotto.getCategory().equals("Baby"))) //verifica se la categoria è baby
                .toList();

        ordiniBaby.forEach(ordine -> System.out.println(ordine));


    }
}