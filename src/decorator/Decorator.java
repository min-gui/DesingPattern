package decorator;

public class Decorator extends Item{

    protected Item item;

    public Decorator(Item item){
        this.item = item;
    }

    @Override
    public int getLinesCount() {
        return 0;
    }

    @Override
    public int getMaxLenght() {
        return 0;
    }

    @Override
    public int getLenght(int index) {
        return 0;
    }

    @Override
    public String getString(int index) {
        return null;
    }
}
