public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization together (UC5)
        String[] banner = {
            String.join("  ", "W   W", "EEEEE", "L    ", "C   C", " OOO ", "M   M", "EEEEE"),
            String.join("  ", "W   W", "E    ", "L    ", "C    ", "O   O", "MM MM", "E    "),
            String.join("  ", "W W W", "EEEE ", "L    ", "C    ", "O   O", "M M M", "EEEE "),
            String.join("  ", "WW WW", "E    ", "L    ", "C    ", "O   O", "M   M", "E    "),
            String.join("  ", "W   W", "EEEEE", "LLLLL", "C   C", " OOO ", "M   M", "EEEEE")
        };

        // Loop (same as UC4)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}