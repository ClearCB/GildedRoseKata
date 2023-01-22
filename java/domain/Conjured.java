package java.domain;

public class Conjured extends NormalItem{
    

    public Conjured(String name, int sellIn, int quality){

        super(name, sellIn, quality);

    }

    @Override
    public void updateQuality(){

        if (this.getSellIn()>=0){

            this.calculateQuality(-2);
        }

        else if (this.getSellIn()<0){

            this.calculateQuality(-4);
        }

        this.setSellIn();
    }

}
