package santa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SantaClaus {
    private static SantaClaus santa;
    private static List<Present> presentList = Present.list;

    private SantaClaus() {
    }

    public Present givePresent(int age) {
        Supplier<Integer> integerSupplier = () -> new Random().nextInt(presentList.size());
        int i;
        if(age>0 && age<20) {
            do {
                i = integerSupplier.get();
            } while (age < presentList.get(i).getAgeRange()[0] || age > presentList.get(i).getAgeRange()[1]);
        } else return new Present("",new int[]{0,0});
        return presentList.get(i);
    }

    public static SantaClaus getInstance() {
        if (santa == null) {
            santa = new SantaClaus();
            return santa;
        }
        return santa;
    }
    //distributePresent

}
//TODO: 10 singletons
//catel, purcel, pisica
//proprietar -> catel, purcel, pisica
//unit testing
//niste cod pe git