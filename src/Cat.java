public class Cat extends Animal {
    private int equanimity;

    public Cat(String food, String location, int equanimity) {
        super(food, location);
        this.equanimity = equanimity;
    }

    @Override
    public void makeNoise () {
        System.out.println("Кот шумит");
    }

    @Override
    public void eat () {
        System.out.println("Кот ест");
    }

    public int getEquanimity() {
        return equanimity;
    }

    public void setEquanimity(int equanimity) {
        if (equanimity >= 0 || equanimity <= 10)
            this.equanimity = equanimity;
    }
}
