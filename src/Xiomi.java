public class Xiomi extends Telefon{
    private String dostup;

    public Xiomi(String dostup) {
        this.dostup = dostup;
    }

    @Override
    public void print() {
        System.out.println("Xiomi have a dostup: "+dostup);
    }
}
