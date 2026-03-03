import java.util.*;

public class OOPSBannerApp {

    // Main Method
    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap patternMap = new CharacterPatternMap();

        // Store each row of final banner
        StringBuilder[] bannerRows = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            bannerRows[i] = new StringBuilder();
        }

        // Build horizontal banner
        for (char ch : word.toCharArray()) {
            String[] pattern = patternMap.getPattern(ch);

            for (int i = 0; i < 5; i++) {
                bannerRows[i].append(pattern[i]).append("  ");
            }
        }

        // Print banner
        for (StringBuilder row : bannerRows) {
            System.out.println(row);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private final Map<Character, String[]> patternMap;

        // Constructor
        public CharacterPatternMap() {
            patternMap = new HashMap<>();
            loadPatterns();
        }

        // Load ASCII Patterns
        private void loadPatterns() {

            patternMap.put('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            });

            patternMap.put('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            });

            patternMap.put('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            });
        }

        // Getter Method
        public String[] getPattern(char ch) {
            return patternMap.getOrDefault(ch, new String[]{
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     "
            });
        }
    }
}