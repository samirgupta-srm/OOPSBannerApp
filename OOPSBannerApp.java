import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create Map
        Map<Character, String[]> map = new HashMap<>();

        // Add patterns
        map.put('W', new String[]{
            "W   W",
            "W   W",
            "W W W",
            "WW WW",
            "W   W"
        });

        map.put('E', new String[]{
            "EEEEE",
            "E    ",
            "EEEE ",
            "E    ",
            "EEEEE"
        });

        map.put('L', new String[]{
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "LLLLL"
        });

        map.put('C', new String[]{
            "C   C",
            "C    ",
            "C    ",
            "C    ",
            "C   C"
        });

        map.put('O', new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        });

        map.put('M', new String[]{
            "M   M",
            "MM MM",
            "M M M",
            "M   M",
            "M   M"
        });

        // Word to print
        String word = "WELCOME";

        // Print banner
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}