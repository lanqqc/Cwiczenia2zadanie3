public class Main {
    public static void main(String[] args) {
    int numNasennik = (int)(Math.random() * 100);
    if (numNasennik%2 == 0) System.out.println("Parzyste: " + numNasennik);
    else System.out.println("Nie parzyste: " + numNasennik);
    }
}