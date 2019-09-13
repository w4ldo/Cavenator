package com.mapgen.cavenator;

/**
 * Main Class
 */
public class Main {

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        String[][] map = new String[30][60];
        CaveGenerator cavegen = new CaveGenerator(map);
        UI ui = new UI();

        cavegen.generateCaves(45);
        ui.printMap(map);
        for (int i = 0; i < 3; i++) {
            cavegen.shapeMap();
            ui.printMap(map);
        }
    }

}
