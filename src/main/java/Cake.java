public abstract class Cake {
    protected String name;
    protected String baseFlavour;

    public Cake(String name, String baseFlavour) {
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

    public String getNewName() {
        return name;
    }

    public void setNewName(String name) {
        this.name = name;
    }

    public String getBaseFlavour(){
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }


    public abstract String decorate();

}

