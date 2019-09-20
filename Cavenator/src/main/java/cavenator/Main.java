package cavenator;

import cavenator.domain.CaveGenerator;
import cavenator.ui.GUI;
import cavenator.ui.ConsoleUI;

/**
 * Main Class
 */
public class Main {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        String[][] map = new String[200][300];
        CaveGenerator cavegen = new CaveGenerator(map);
        ConsoleUI consoleUi = new ConsoleUI();
        GUI gui = new GUI(cavegen);
        gui.setVisible(true);

        String[][] map2 = new String[17][17];
        CaveGenerator cavegen2 = new CaveGenerator(map2);
        cavegen2.generateCaves(0);
        consoleUi.printMap(map2);
        cavegen2.shapeMap(1, 4);
        consoleUi.printMap(map2);
        cavegen2.shapeMap(1, 4);
        consoleUi.printMap(map2);
    }

}
