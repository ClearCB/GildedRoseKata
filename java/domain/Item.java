package java.domain;

/**
 * This java class will be the one that NormalItem will inerhitance and the
 * future methods and atributes for each item.
 * 
 * This will be the class that will construct the others, so we will set it
 * as final, so it cannot be changed in the future.
 */

final class Item{
    
    String name;
    int sellIn;
    int quality;

    // Constructor to the method
    public Item(String name, int sellIn, int quality){

        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString(){

        return ("Item name: "+ this.name +
                ". Sell-In date: "+ this.sellIn + 
                ". Actual quality: " + this.quality + ". ");

    }

    // For being strict to the initial kata, i will comment this part that
    // I created to keep in mind encapsulation.


    // Getters and Setters
    // public String getName(){
        
    //     return this.name;
    // }

    // public int getSellIn(){

    //     return this.sellIn;
    // }

    // public int getQuality(){

    //     return this.quality;
    // }

    // public void setName(String newName){

    //     this.name = newName;
    // }

    // public void setSellIn(int value){

    //     this.sellIn = value;
    // }

    // public void setQuality(int value){

    //     this.quality = value; 
    // }

    // Override the method toString, to all the classes.

}
