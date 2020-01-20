package santa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Present {
    private final String name;
    private int[] ageRange = new int[2];
    static List<Present> list = Arrays.asList(new Present("Doll",new int[]{2,8}),
                                                     new Present("Turtle",new int[]{0,6}),
                                                     new Present("Car", new int[]{0,15}),
                                                     new Present("Helicopter", new int[]{14,15}));

    public Present(String name, int[] ageRange) {
        this.name = name;
        //this.ageRange = ageRange;
        setAgeRange(ageRange);
    }

    public String getName() {
        return name;
    }


    public int[] getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(int[] ageRange) {
        if (ageRange[0] >= 0 && ageRange[0] <= 15 && ageRange[1] >= 0 && ageRange[1] <= 15 && ageRange[0] <= ageRange[1]) {
            this.ageRange = ageRange;
        } else {
            System.out.println("The age range should be included in [0,15]." +
                    "Think of a valid range and invoke setAgeRange method once more!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Present{");
        sb.append("name='").append(name).append('\'');
        sb.append(", ageRange=").append(Arrays.toString(ageRange));
        sb.append('}');
        return sb.toString();
    }
}
