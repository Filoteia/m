package characters;

public abstract class Character {
    int ascii;

    public Character(int ascii) {
        this.ascii = ascii;
    }

    public int getAsciiInDecimal() {
        return ascii;
    }

    public String getAsciiInBinary() {
        return Integer.toBinaryString(ascii);
    }

    public String getAsciiInOctal() {
        return Integer.toOctalString(ascii);
    }

    public String getAsciiInHex() {
        return Integer.toHexString(ascii);
    }
}

class Percent extends Character {
    private static Percent item;

    private Percent(int ascii) {
        super(ascii);
    }

    public static Percent getInstance(int ascii) {
        if (item == null && (int) '%' == ascii) {
            item = new Percent(ascii);
            return item;
        } else if ((int) '%' != ascii) {
            System.out.println("Not the ascii code for this character!");
        }
        return item;
    }
}

class Ampersand extends Character {
    private static Ampersand item;

    private Ampersand(int ascii) {
        super(ascii);
    }

    public static Ampersand getInstance(int ascii) {
        if (item == null && (int) '&' == ascii) {
            item = new Ampersand(ascii);
            return item;
        } else if ((int) '&' != ascii) {
            System.out.println("Not the ascii code for this character!");
        }
        return item;
    }
}

class F extends Character {
    private static F item;

    private F(int ascii) {
        super(ascii);
    }

    public static F getInstance(int ascii) {
        if (item == null && (int) 'F' == ascii) {
            item = new F(ascii);
            return item;
        } else if ((int) 'F' != ascii) {
            System.out.println("Not the ascii code for this character!");
        }
        return item;
    }
}