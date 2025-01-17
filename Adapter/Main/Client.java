package Adapter.Main;

public class Client {
    public static void clientCode(Printer printer) {
        printer.print();
    }

    public static void main(String[] args) {
        PrinterAdapter adapter = new PrinterAdapter();
        clientCode(adapter);
    }
}
