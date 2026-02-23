public class BannerApp {
    public static void main(String[] args) {

        // Store banner lines in a String array
        String[] banner = {
            "***************",
            "*             *",
            "*   WELCOME   *",
            "*      TO     *",
            "*    JAVA     *",
            "*   PROGRAM   *",
            "*             *",
            "***************"
        };

        // Use loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
