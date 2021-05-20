public class Magic {
    public static void main(String[] args) {
        int myNumber = 78;
        // myNumber is the original number
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
    }
}