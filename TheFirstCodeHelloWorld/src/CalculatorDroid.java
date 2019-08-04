public class CalculatorDroid {
    private int numberOne;
    private int numberTwo;

    // üres construktor
    public CalculatorDroid() {
    }

    //összeadjuk numberOne-t és numberTwo-t és írjuk ki
    public void addNumbers() {
        System.out.println("numberOne + numberTwo = " + (numberOne + numberTwo));
    }

    // numberOne-ból kivonjuk numberTwo-t és írjuk ki
    public void subtractNumbers() {
        System.out.println("numberOne - numberTwo = " + (numberOne - numberTwo));
    }

    //összeszorozzuk numberOne-t és numberTwo-t és írjuk ki
    public void multiplyNumbers() {
        System.out.println("numberOne * numberTwo = " + numberOne * numberTwo);
    }

    //elosztjuk numberOne-t numberTwo-val és írjuk ki
    public void divideNumbers() {
        System.out.println("numberOne / numberTwo = " + numberOne / numberTwo);
    }

    //megnézzük az osztási maradékát, annak ha numberOne-t elosztjuk numberTwo-val és írjuk ki
    public void modNumbers() {
        System.out.println("numberOne % numberTwo = " + numberOne % numberTwo);
    }

    //elkérjük numberOne értékét
    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
}
