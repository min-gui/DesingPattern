package decorator.custom;

public class RedPepper extends SecondMaterialDeco{

    private Pasta pasta;

    public RedPepper(Pasta pasta) {
        super();
        this.pasta = pasta;
    }

    @Override
    public int cost() {
        return pasta.cost() + 500;
    }

    @Override
    public String getName() {
        return pasta.getName() + ", 고추 추가";
    }
}
