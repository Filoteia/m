package santa;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SantaClausTest {



    @Test
    public void givePresentToAValidAgeKid() {
        SantaClaus santaClaus = SantaClaus.getInstance();

        Present present = santaClaus.givePresent(13);

        assertThat(present).isNotNull();
    }

    @Test
    public void getInstanceSanta_WhenNotNull(){

        assertThat(SantaClaus.getInstance()).isNotNull();

    }

    @Test
    public void givePresentToANotValidAgeKid_NameTest() {
        SantaClaus santaClaus = SantaClaus.getInstance();

        Present present = santaClaus.givePresent(-3);

        assertThat(present.getName()).isEmpty();
    }

    @Test
    public void givePresentToANotValidAgeKid_AgeRangeTest() {
        SantaClaus santaClaus = SantaClaus.getInstance();

        Present present = santaClaus.givePresent(-3);
        int[] v = new int[2];
        assertThat(present.getAgeRange()).isEqualTo(v);
    }
}
