public class Horse extends Animal {
    private int power;

    public Horse(String food, String location, int power) {
        super(food, location);
        this.power = power;
    }

    @Override
    public void makeNoise () {
        System.out.println("Лошадь шумит");
    }

    @Override
    public void eat () {
        System.out.println("Лошадь ест");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power == 1)
           this.power = power;
    }
}
