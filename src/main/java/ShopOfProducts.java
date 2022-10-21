import java.util.HashMap;
import java.util.Map;

public class ShopOfProducts implements PrintToConsole {
    protected HashMap<String, Integer> prices;
    protected Purchase[] purchases;

    public ShopOfProducts() {
        prices = new HashMap<>();
        prices.put("Хлеб", 56);
        prices.put("Масло", 153);
        prices.put("Колбаса", 211);
        prices.put("Пирожок", 45);
        purchases = new Purchase[prices.size()];
    }

       public long sum() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    @Override
    public void printToConsole() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : prices.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
