import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupCakesTest {

    CupCakes cupcakes;

    @BeforeEach
    void setUp(){cupcakes = new CupCakes("Vanilla Cupcakes", "Vanilla","Sprinkles", "Gluten-free");}

    @Test
    void canGetToppings(){
        assertThat(cupcakes.getToppings()).isEqualTo("Sprinkles");
    }

    @Test
    void canSetToppings(){
        cupcakes.setToppings("Powdered sugar");
        assertThat(cupcakes.getToppings()).isEqualTo("Powdered sugar");
    }

    @Test
    void canDecorate__noArguments(){
        String expected = "Floral themed";
        String actual = cupcakes.decorate();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetDietaryRequirements(){
        String expected = "Gluten-free";
        String actual = cupcakes.getDietaryRequirements();
        assertThat(actual).isEqualTo(expected);
    }

}
