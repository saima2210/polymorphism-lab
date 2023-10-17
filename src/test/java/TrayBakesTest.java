import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrayBakesTest {

    TrayBakes traybakes;

    @BeforeEach
    void SetUp() {
        traybakes = new TrayBakes("Traybake", "Red Velvet", false);
    }

    @Test
    void canGetSlices() {
        assertThat(traybakes.getSlices()).isEqualTo(0);
    }

    @Test
    void canSetSlices() {
        traybakes.setSlices(10);
        assertThat(traybakes.getSlices()).isEqualTo(10);
    }

    @Test
    void canDecorate__noArguments(){
        String expected = "Unicorn themed";
        String actual = traybakes.decorate();
        assertThat(actual).isEqualTo(expected);
    }
}

