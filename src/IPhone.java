public class IPhone extends Telefon{
    private String vid;

    public IPhone(String vid) {
        this.vid = vid;
    }

    @Override
    public void print() {
        System.out.println("Iphone have a vid: "+vid);
    }
}
