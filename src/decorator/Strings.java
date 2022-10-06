package decorator;

import java.util.ArrayList;
import java.util.Iterator;

//장식될 실제 내용물.
public class Strings extends Item {

    private ArrayList<String> strings = new ArrayList<String>();

    public void add(String item){
        strings.add(item);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLenght() {
        Iterator<String> iter = strings.iterator();
        int maxWidth = 0;

        while (iter.hasNext()) {
            String string = iter.next();
            int width = string.length();

            if(width > maxWidth) maxWidth = width;
        }

        return maxWidth;
    }

    @Override
    public int getLenght(int index) {
        String s = strings.get(index);
        return s.length();
    }

    @Override
    public String getString(int index) {
        String string = strings.get(index);
        return string;
    }
}
