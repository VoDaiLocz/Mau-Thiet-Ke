public class PrintSpooler {
    private static PrintSpooler instance;

    private PrintSpooler() {
        init();
    }

    private void init() {
        System.out.println("Đang khởi tạo bộ nạp máy in...");
    }

    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String message) {
        System.out.println("Đang in: " + message);
    }
}
