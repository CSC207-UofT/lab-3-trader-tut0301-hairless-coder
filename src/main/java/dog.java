/* A class called Dog that implements the given interfaces.
 */

public class Dog implements Domesticatable, Tradable {

    @Override
    public String sound() { return "woof woof!"; }

    @Override
    public int getPrice() { return 999;}

    @Override
    public String toString(){
    String id = super.toString();
    return id + "says" + this.sound();
    }
}
