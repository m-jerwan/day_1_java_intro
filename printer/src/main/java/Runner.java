public class Runner {
    public static void main(String[] args) {

        Printer printer_01 = new Printer();

        System.out.println (printer_01.print(30));
        printer_01.refillPaper();
        System.out.println (printer_01.print(30));



    }
}

