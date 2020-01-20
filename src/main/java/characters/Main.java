package characters;

public class Main {
    public static void main(String[] args) {

        Percent percent = Percent.getInstance(37);
        System.out.println("\'%\' ascii code in decimal: " + percent.getAsciiInDecimal());
        System.out.println("\'%\' ascii code in binary: " + percent.getAsciiInBinary());
        System.out.println("\'%\' ascii code in octal: " + percent.getAsciiInOctal());
        System.out.println("\'%\' ascii code in hexadecimal: " + percent.getAsciiInHex());
        Percent percent2 = Percent.getInstance(37);
        System.out.println(percent != percent2);
        Percent percent3 = Percent.getInstance(7);

        Ampersand ampersand = Ampersand.getInstance(38);
        System.out.println("\'&\' ascii code in decimal: " + ampersand.getAsciiInDecimal());
        System.out.println("\'&\' ascii code in binary: " + ampersand.getAsciiInBinary());
        System.out.println("\'&\' ascii code in octal: " + ampersand.getAsciiInOctal());
        System.out.println("\'&\' ascii code in hexadecimal: " + ampersand.getAsciiInHex());


        F f = F.getInstance(70);
        System.out.println("\'F\' ascii code in decimal: " + f.getAsciiInDecimal());
        System.out.println("\'F\' ascii code in binary: " + f.getAsciiInBinary());
        System.out.println("\'F\' ascii code in octal: " + f.getAsciiInOctal());
        System.out.println("\'F\' ascii code in hexadecimal: " + f.getAsciiInHex());


    }
}
