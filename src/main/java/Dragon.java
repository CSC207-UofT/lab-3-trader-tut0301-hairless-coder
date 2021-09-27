public class Dragon implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Dragon() {
        this.maxSpeed = 100;
    }

    @Override
    public String sound() {
        return "NIUB!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
