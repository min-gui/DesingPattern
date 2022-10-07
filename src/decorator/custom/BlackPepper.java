package decorator.custom;

public class BlackPepper extends SecondMaterialDeco{

    private Pasta pasta;

    public BlackPepper(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public int cost() {
        return pasta.cost()+300;
    }

    @Override
    public String getName() {
        return pasta.getName() + ", 고추 추가";
    }
}
