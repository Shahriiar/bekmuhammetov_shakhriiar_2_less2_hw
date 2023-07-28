public class BMW extends Cars{
    private int year;
    private String model;

    public BMW(int year, String model) {
        this.year = year;
        this.model = model;
    }


    @Override
    public void print() {
        System.out.println("BMW year is  :" + year + "\nBMW model : " + model);
    }
}
