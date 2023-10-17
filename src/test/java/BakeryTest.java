import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    void setUp(){
        bakery = new Bakery();
    }

    @Test
    void canAddCake(){
        assertThat(bakery.countCake()).isEqualTo(0);
    }

}
