public class Mercedes extends Cars{
    private int horsePower;
    private String color;

    public Mercedes(int horsePower, String color) {
        this.horsePower = horsePower;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Mercedes HP : " + horsePower + "\nMercedes color : " + color);

    }
}
