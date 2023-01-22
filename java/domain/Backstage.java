package java.domain;

public class Backstage extends NormalItem {
    
    public Backstage(String name, int sellIn, int quality){

        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){

        if (this.getSellIn()>10){
            this.calculateQuality(+1);

        }

        else if (this.getSellIn()>5){
            this.calculateQuality(+2);
        }

        else if (this.getSellIn() > 0){
            this.calculateQuality(3);
        }

        else {

            this.setQuality(0);
        }
        this.setSellIn();
    }
}
