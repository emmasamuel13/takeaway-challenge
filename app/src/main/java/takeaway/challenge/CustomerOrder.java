/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package takeaway.challenge;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerOrder {
    ArrayList<takeaway.challenge.MenuItem> Order = new ArrayList<>();

    public void AddToOrder(MenuItem Dish) {
        Order.add(Dish);
    }

    public ArrayList ViewOrder() {
        return Order;
    }

    public boolean CheckPrice(Double ExpectedPrice) {
        Double ActualPrice = 0.00;
        for (MenuItem Dish : Order) {
            ActualPrice += Dish.GetDishPrice();
        }
        Double ActualPriceRounded = Math.round(ActualPrice * 100.0) / 100.0;
        if (ActualPriceRounded.equals(ExpectedPrice)) {
            return true;
        } else {
            return false;
        }
    }

    public String PlaceOrder() {
        LocalDateTime ToFormat = LocalDateTime.now().plusHours(1);
        DateTimeFormatter Formatting = DateTimeFormatter.ofPattern("HH:mm");

        String InAnHour = ToFormat.format(Formatting);

        String Statement = String.format("Thank you! Your order was placed and will be delivered before %s", InAnHour);
        return Statement;
    }
}
