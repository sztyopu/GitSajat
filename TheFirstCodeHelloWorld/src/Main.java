public class Main {

    public static void main(String[] args) {

        //meghívjuk az üres constuktort
        CalculatorDroid szamologep1 =new CalculatorDroid();

        //beállítjuk a droid numberOne értékét
        szamologep1.setNumberOne(119);

        //beállítjuk a droid numberTwo értékét
        szamologep1.setNumberTwo(301);

        //hívjuk meg a CalculatorDroid.class addNumbers metódusát, és adjuk össze a két számot és irassuk ki
        szamologep1.addNumbers();

        //osszuk el őket
        szamologep1.divideNumbers();

        //vonjuk ki őket
        szamologep1.subtractNumbers();

        //szorozzuk meg őket
        szamologep1.multiplyNumbers();

        //moduló
        szamologep1.modNumbers();

        //új értéket állítunk a numberTwo-nak
        szamologep1.setNumberTwo(20);

        // új értéket állítunk a numberOne-nak
        szamologep1.setNumberOne(22);

        //írassuk ki az új számot
        szamologep1.addNumbers();

        //kiiratjuk a numberOne értékét
        System.out.println(szamologep1.getNumberOne());

        //kiiratjuk a numberTwo értékét
        System.out.println(szamologep1.getNumberTwo());

    }
}
