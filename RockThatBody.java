public class RockThatBody {
  

    public static void printLyrics() {
        // Each line is paired with a delay (in seconds)
        String[][] lines = {
            {"I wanna da-", "0.06"},
            {"I wanna dance in the lights", "0.05"},
            {"I wanna ro-", "0.07"},
            {"I wanna rock your body", "0.08"},
            {"I wanna go", "0.08"},
            {"I wanna go for a ride", "0.068"},
            {"Hop in the music and", "0.07"},
            {"Rock your body", "0.08"},
            {"Rock that body", "0.069"},
            {"come on, come on", "0.035"},
            {"Rock that body", "0.05"},
            {"(Rock your body)", "0.03"},
            {"Rock that body", "0.049"},
            {"come on, come on", "0.035"},
            {"Rock that body", "0.08"}
        };

        // Print each line with a delay
        for (String[] line : lines) {
            System.out.println(line[0]);
            try {
                double seconds = Double.parseDouble(line[1]);
                Thread.sleep((long)(seconds * 1000)); // convert sec → ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        printLyrics();
    }
}
    

