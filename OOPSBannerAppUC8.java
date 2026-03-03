import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OOPSBannerAppUC8 {

    // Global Map to store character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        loadPatterns();   // Load patterns into Map

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toUpperCase();

        renderBanner(word);  // Render banner using function
    }

    // Function to load character patterns into Map
    private static void loadPatterns() {

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

    // Function to render banner
    private static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.getOrDefault(ch, new String[]{
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                });

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }
}
