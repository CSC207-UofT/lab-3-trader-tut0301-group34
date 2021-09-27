public class Chicken implements Domesticatable, Tradable{

    public Chicken(){}

    //Price
    @Override
    public String sound() {return "Cluck Cluck!";}

    //Sound
    @Override
    public int getPrice() {return 5;}

    @Override
    public String toString(){
        return "This is a Chicken";
    }

}
