public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines inside a String array
        String[] banner = {
            String.join("  ", "W   W", "EEEEE", "L    ", "C   C", " OOO ", "M   M", "EEEEE"),
            String.join("  ", "W   W", "E    ", "L    ", "C    ", "O   O", "MM MM", "E    "),
            String.join("  ", "W W W", "EEEE ", "L    ", "C    ", "O   O", "M M M", "EEEE "),
            String.join("  ", "WW WW", "E    ", "L    ", "C    ", "O   O", "M   M", "E    "),
            String.join("  ", "W   W", "EEEEE", "LLLLL", "C   C", " OOO ", "M   M", "EEEEE")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}