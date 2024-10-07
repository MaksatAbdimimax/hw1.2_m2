public class Main {
    public static Printable createObject(String className){
        if (className == "Samsung"){
            return new Samsung("big ruchka");

        }else if (className=="Xiomi"){
            return new
                    Xiomi("dostup for all");
        }else if(className=="IPhone")

        { return new IPhone("beautiful vid");}
        return null;
    };
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Printable samsung = (Printable) createObject("Samsung");
        Printable xiomi = (Printable) createObject("Xiomi");
        Printable iphone = (Printable) createObject("IPhone");
        Printable[] printables = {samsung, xiomi, iphone};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}