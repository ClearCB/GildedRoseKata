package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.domain.*;

public class App {
    public static void main(String[] args) {
        
    
    List<Updateable> items = new ArrayList<Updateable>(Arrays.asList(new NormalItem("+5 Dexterity Vest", 10, 20),
                                        new AgedBrie("Aged Brie", 2, 0),
                                        new NormalItem("Elixir of the Mongoose", 5, 7),
                                        new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                                        new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                                        new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                        new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                        new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49)));


    GildedRose shop = new GildedRose(items);

    System.out.println(shop.toString());
    shop.updateInventory();
    System.out.println(shop.toString());

    }
}