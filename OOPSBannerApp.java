public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create patterns
        CharacterPatternMap W = new CharacterPatternMap('W', new String[]{
            "W   W",
            "W   W",
            "W W W",
            "WW WW",
            "W   W"
        });

        CharacterPatternMap E = new CharacterPatternMap('E', new String[]{
            "EEEEE",
            "E    ",
            "EEEE ",
            "E    ",
            "EEEEE"
        });

        CharacterPatternMap L = new CharacterPatternMap('L', new String[]{
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "LLLLL"
        });

        CharacterPatternMap C = new CharacterPatternMap('C', new String[]{
            "C   C",
            "C    ",
            "C    ",
            "C    ",
            "C   C"
        });

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        });

        CharacterPatternMap M = new CharacterPatternMap('M', new String[]{
            "M   M",
            "MM MM",
            "M M M",
            "M   M",
            "M   M"
        });

        // Store word WELCOME
        CharacterPatternMap[] word = {W, E, L, C, O, M, E};

        // Print banner
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap ch : word) {
                line.append(ch.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}