package Adapter.Main;

public class PrinterAdapter implements Printer {
    private LegacyPrnter legacyPrnter;

    public PrinterAdapter() {
        this.legacyPrnter = new LegacyPrnter();
    }

    @Override
    public void print() {
        legacyPrnter.printDocument();
    }
}
