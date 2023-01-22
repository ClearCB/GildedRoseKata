package java.domain;

public class AgedBrie extends NormalItem  {
    
    public AgedBrie(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){
        
        if (this.getSellIn() >= 0){
            this.calculateQuality(+1);
        }

        else{
            this.calculateQuality(+2);
        }
        this.setSellIn();
    }
}
