package domain;

import java.util.List;

public class GildedRose {
    
    private List<Updateable> inventory;

    public List<Updateable> inventory(){
        return this.inventory;
    }

    public GildedRose(List<Updateable> inventory){

        this.inventory = inventory;
    }

    public void updateInventory(){

        for (Updateable item: this.inventory){

            item.updateQuality();
        }
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (Updateable item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }
}
