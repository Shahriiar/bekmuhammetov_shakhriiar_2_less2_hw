public class Audi extends Cars{
    private int numberOfDoors;
    private String drive;

    public Audi(int numberOfDoors, String drive) {
        this.numberOfDoors = numberOfDoors;
        this.drive = drive;
    }

    @Override
    public void print() {
        System.out.println("Audi numbers of doors : " + numberOfDoors + "\nAudi drive : " + drive);

    }
}
