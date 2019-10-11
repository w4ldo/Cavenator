package cavenator;

import cavenator.domain.CaveGenerator;
import cavenator.ui.GUI;
import cavenator.ui.ConsoleUI;
import java.util.Date;

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
        GUI gui = new GUI(cavegen);
        gui.setVisible(true);

// Manual testing
//        String[][] testMap = new String[1000][1000];
//        CaveGenerator testCavegen = new CaveGenerator(testMap);
//        long initialTime = System.currentTimeMillis();
//        testCavegen.generateCaves(0);
//        long afterGeneration = System.currentTimeMillis();
//        testCavegen.shapeMapA(1, 4);
//        long afterShaping = System.currentTimeMillis();
//        System.out.println("GenerateCave: " + (afterGeneration - initialTime) + "ms");
//        System.out.println("ShapeCave: " + (afterShaping - afterGeneration) + "ms");
//        System.out.println("Total: " + (afterShaping - initialTime) + "ms");

    }

}
