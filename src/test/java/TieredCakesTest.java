import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakesTest {

    TieredCakes tieredcakes;

    @BeforeEach
    void SetUp() {tieredcakes = new TieredCakes("tieredcakes", "Chocolate");}

    @Test
    void canGetTiers(){
        assertThat(tieredcakes.getTiers()).isEqualTo(0);
    }

    @Test
    void canSetTiers(){
        tieredcakes.setTiers(3);
        assertThat(tieredcakes.getTiers()).isEqualTo(3);
    }

    @Test
    void canDecorate__noArguments(){
        String expected = "Wedding themed";
        String actual = tieredcakes.decorate();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canDecorate__withArguments(){
        String expected = "Wedding themed with a golden topper.";
        String actual = tieredcakes.decorate("with a golden topper");
        assertThat(actual).isEqualTo(expected);
    }
}
