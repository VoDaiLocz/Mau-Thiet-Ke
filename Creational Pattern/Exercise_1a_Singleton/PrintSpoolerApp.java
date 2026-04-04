public class PrintSpoolerApp {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();
        spooler.print("Tài liệu kiểm tra");
    }
}
