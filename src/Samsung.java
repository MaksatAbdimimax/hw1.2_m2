public class Samsung extends Telefon{
    private String ruchka;

    public Samsung(String ruchka) {
        this.ruchka = ruchka;

    }

    public String getRuchka() {
        return ruchka;
    }

    @Override
    public void print() {
        System.out.println("Samsung have a ruchka: "+ruchka);
    }
}
