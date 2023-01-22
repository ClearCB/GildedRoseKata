package java.domain;

public class Sulfuras extends NormalItem{
    

    public Sulfuras(String name, int sellIn, int quality){
    
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){

        this.setQuality(80);
    }
}
