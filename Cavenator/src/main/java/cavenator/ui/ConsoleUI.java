package cavenator.ui;

/**
 * UI class
 */
public class ConsoleUI {

    /**
     * Print given map
     *
     * @param map
     */
    public void printMap(String[][] map) {
        String print = "";
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                print += map[y][x];
            }
            print += "\n";
        }
        System.out.println(print);
    }
}
