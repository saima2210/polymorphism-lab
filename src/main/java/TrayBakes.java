public class TrayBakes extends Cake{
    private int slices;
    private boolean healthierOption;

    public TrayBakes(String name, String baseFlavour, boolean healthierOption){
        super(name, baseFlavour);
        this.slices = 0;
        this.healthierOption = healthierOption;
    }

    public int getSlices(){
       return slices;
    }

    public void setSlices(int slices){
        this.slices = slices;
    }

    @Override
    public String decorate(){
        return "Unicorn themed";
    }


}
