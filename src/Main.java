
public class Main {
    public static void main(String[] args) {
       Cars mercedes = createObject("Mercedes");
        Cars audi =  createObject("Audi");
        Cars bmw = createObject("BMW");

        Printable[] printables = {mercedes,audi,bmw};
        for (Printable printa :
                printables) {
            printa.print();
        }
    }
    public static Cars createObject(String className){
        switch (className) {
            case ("BMW") -> {
                return new BMW(2020, "M8");
            }
            case ("Mercedes") -> {
                return new Mercedes(777, "Black");
            }
            case ("Audi") -> {
                return new Audi(2, "Quatro drive");
            }
            default -> {
                return null;
            }
        }
    }
}