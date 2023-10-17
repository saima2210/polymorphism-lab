import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    void setUp(){
        cake = new CupCakes ("cupcakes", "Vanilla", "Strawberries", "Vegan");
    }

    @Test
     public void hasNewName(){
        assertThat(cake.getNewName()).isEqualTo("Tiered Cakes");
    }

    @Test
     public void canSetNewName(){
        assertThat(cake.getNewName()).isEqualTo("Cupcakes");
    }

    @Test
    public void hasBaseFlavour(){
        assertThat(cake.getBaseFlavour()).isEqualTo("Vanilla");
    }

    @Test
    public void canSetBaseFlavour(){
        assertThat(cake.getBaseFlavour()).isEqualTo("Vanilla");
        }
    }


