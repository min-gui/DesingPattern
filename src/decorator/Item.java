package decorator;

public abstract class Item {

    //문자열이 몇줄인지 반환.
    public abstract int getLinesCount();
    //가장긴 문자열 반환.
    public abstract int getMaxLenght();
    public abstract int getLenght(int index);
    public abstract String getString(int index);

    public void print(){
        int cntLines = getLinesCount();
        for (int i =0; i<cntLines; i++){
            String string = getString(i);
            System.out.println(string);
        }
    }
}
