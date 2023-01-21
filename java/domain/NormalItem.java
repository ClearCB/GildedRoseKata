package java.domain;

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
        
        return item.getName();
    }

    public int getSellIn(){

        return item.getSellIn();
    }

    public int getQuality(){

        return item.getQuality();
    }

    public void setName(String newName){

        item.setName(newName);
    }

    public void setSellIn(int value){

        item.setSellIn(value);
    }

    public void setQuality(int value){

        item.setQuality(value);
    }

    // Calculate the quality if the value is between 0 and 50.
    public void calculateQuality(int value){
        
        if (getQuality()>50){

            setQuality(50);
        }

        else if (getQuality() < 0){

            setQuality(0);
        }

        else {

            setQuality(getQuality()+value);
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
    }

}
