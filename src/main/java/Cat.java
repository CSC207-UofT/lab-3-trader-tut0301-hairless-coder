public class Cat implements Tradable, Domesticatable, Drivable{
    private int max_speed;

    public int getPrice(){
        return 21000;
    }

    public String sound(){
        return "meow";
    }

    public Cat(int speed) {
        this.max_speed = speed;
    }

    public void upgradeSpeed(){
        this.max_speed += 10;
    }

    public void downgradeSpeed() {
        this.max_speed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }
}
