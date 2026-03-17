public class OOPSBannerApp {

    // Static methods for each letter
    static String[] getW() {
        return new String[]{
            "W   W",
            "W   W",
            "W W W",
            "WW WW",
            "W   W"
        };
    }

    static String[] getE() {
        return new String[]{
            "EEEEE",
            "E    ",
            "EEEE ",
            "E    ",
            "EEEEE"
        };
    }

    static String[] getL() {
        return new String[]{
            "L    ",
            "L    ",
            "L    ",
            "L    ",
            "LLLLL"
        };
    }

    static String[] getC() {
        return new String[]{
            "C   C",
            "C    ",
            "C    ",
            "C    ",
            "C   C"
        };
    }

    static String[] getO() {
        return new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    static String[] getM() {
        return new String[]{
            "M   M",
            "MM MM",
            "M M M",
            "M   M",
            "M   M"
        };
    }

    public static void main(String[] args) {

        String[] w = getW();
        String[] e = getE();
        String[] l = getL();
        String[] c = getC();
        String[] o = getO();
        String[] m = getM();

        // Build banner using loop
        for (int i = 0; i < 5; i++) {
            System.out.println(
                String.join("  ", w[i], e[i], l[i], c[i], o[i], m[i], e[i])
            );
        }
    }
}