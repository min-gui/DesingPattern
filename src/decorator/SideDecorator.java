package decorator;

public class SideDecorator extends Decorator{

    private Character ch;

    public SideDecorator(Item item, Character ch) {
        super(item);
        this.ch = ch;
    }

    @Override
    public int getLinesCount() {
        return item.getLinesCount();
    }

    @Override
    public int getMaxLenght() {
        return item.getMaxLenght()+2;
    }

    @Override
    public int getLenght(int index) {
        return item.getLenght(index) + 2;
    }

    @Override
    public String getString(int index) {
        return ch+item.getString(index)+ch;
    }
}
