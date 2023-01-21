package java.domain;

public class AgedBrie extends NormalItem  {
    
    public AgedBrie(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){
        ;
    }
}
