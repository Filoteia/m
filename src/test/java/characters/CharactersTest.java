package characters;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharactersTest {

    @Test
    public void percentGetInstanceWhenValidAscii() {
        Percent percent;

        percent = Percent.getInstance(37);

        assertThat(percent).isNotNull();
    }

    @Test
    public void percentGetInstanceWhenNotValidAscii() {
        Percent.getInstance(3);

    }


}
