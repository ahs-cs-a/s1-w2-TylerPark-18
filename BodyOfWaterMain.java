public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Sean", 500, 300,true);
        BodyOfWater b1 = new BodyOfWater("Tyler", 300);
        b.printState();
        b.setName("Green");
        b.printState();
        b1.printState();
    }
}
