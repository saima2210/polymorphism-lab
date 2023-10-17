public class TieredCakes extends Cake{
    private int tiers;

    public TieredCakes(String name, String baseFlavour){
        super(name, baseFlavour);
        this.tiers = 0;
    }

    public int getTiers(){
        return tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }

    @Override
    public String decorate(){
        return "Wedding themed";
    }

    public String decorate(String message){
        return "Wedding themed " + message + ".";
    }


}
