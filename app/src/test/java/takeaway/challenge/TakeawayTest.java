/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package takeaway.challenge;

import org.junit.Test;
import static org.junit.Assert.*;

public class TakeawayTest {
    @Test public void ReturnsNameAndPrice() {
        MenuItem Dish = new MenuItem("Chicken korma", 5.99);
        assertEquals("returns the name", String.valueOf("Chicken korma"), Dish.GetDishName());
        assertEquals("returns the price", Double.valueOf(5.99), Dish.GetDishPrice());
    }

    @Test public void AddsDishesToMenu() {
        TakeawayMenu Menu = new TakeawayMenu();
        MenuItem KormaDish = new MenuItem("Chicken korma", 5.99);
        MenuItem TikkaMasalaDish = new MenuItem("Prawn tikka masala", 5.89);
        TakeawayMenu.AddToMenu(KormaDish);
        TakeawayMenu.AddToMenu(TikkaMasalaDish);
        assertEquals("returns the menu with two dishes", Double.valueOf(5.99), Menu.ViewMenu());
    }
}
