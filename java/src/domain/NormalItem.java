package domain;


public class NormalItem implements Updateable {
    
    private final Item item;

    // Constructor to the method
    public NormalItem(String name, int sellIn, int quality){

        this.item = new Item(name, sellIn, quality);
    }

    // Override the method toString
    @Override
    public String toString(){
        return item.toString();
    }

    // Getters and Setters
    public Item getItem(){

        return this.item;
    }

    public String getName(){
        
        return item.name;
    }

    public int getSellIn(){

        return item.sellIn;
    }

    public int getQuality(){

        return item.quality;
    }

    public void setName(String newName){

        item.name = newName;
    }

    public void setSellIn(){

        item.sellIn = item.sellIn - 1;
    }

    public void setQuality(int value){

        item.quality = value;
    }

    // Calculate the quality if the value is between 0 and 50. Keeping encapsulation.
    public void calculateQuality(int value){
        
        if (getQuality() + value > 50){

            setQuality(50);
        }

        else if (getQuality() + value >= 0){

            setQuality(getQuality()+value);
        }

        else {

            setQuality(0);
        }

    }

    // Override the method updateQuality to this class.
    @Override
    public void updateQuality(){

        if (getSellIn()>0){
            calculateQuality(-1);
        }

        else if (getSellIn()<0){
            calculateQuality(-2);
        }

        this.setSellIn();
    }

}
