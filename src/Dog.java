public class Dog extends Animal {
    private int friendly;

    public Dog(String food, String location, int friendly) {
        super(food, location);
        this.friendly = friendly;
    }

    @Override
    public void makeNoise () {
        System.out.println("Собака шумит");
    }

    @Override
    public void eat () {
        System.out.println("Собака ест");
    }

    public int getFriendly() {
        return friendly;
    }

    public void setFriendly(int friendly) {
        if (friendly >= 0 || friendly <= 10)
            this.friendly = friendly;
    }
}
