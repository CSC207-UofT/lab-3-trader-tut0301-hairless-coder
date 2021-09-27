/* A class called Cat that implements Tradable and Domesticatable
 */
public class Cat implements Domesticatable, Tradable{
    public Cat(){}
    @Override
    public String sound(){return "meow";}
    @Override
    public int getPrice(){return 2^32-1;}
    @Override
    public String toString(){
        return super.toString()+", the cat says " + this.sound();
    }
}