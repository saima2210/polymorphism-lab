import java.util.ArrayList;

public class Bakery {

    private ArrayList<Cake> cakes;

    public Bakery(){
        this.cakes = new ArrayList<>();
    }

    public int countCake(){
        return this.cakes.size();
    }

    public void addCake(Cake cake){
        this.cakes.add(cake);
    }
}
