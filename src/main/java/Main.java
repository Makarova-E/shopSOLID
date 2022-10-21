import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShopOfProducts shopOfProducts = new ShopOfProducts();
        shopOfProducts.printToConsole();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            shopOfProducts.addPurchase(product, count);
        }
        long sum = shopOfProducts.sum();
        System.out.println("ИТОГО: " + sum);
    }
}

