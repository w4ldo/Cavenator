package com.mapgen.cavenator;

import java.util.Date;
import java.util.Random;

/**
 * Class responsible for generating cave
 */
public class CaveGenerator {

    private String[][] map;
    
    /**
     * Constructor
     * @param map
     */
    public CaveGenerator(String[][] map) {
        this.map = map;
    }

    /**
     * Generate initial walls to map based on fill percent.
     * Derive random seed from current time.
     * @param fill
     */
    public void generateCaves(int fill) {
        String seed = new Date().toString();
        Random random = new Random(seed.hashCode());

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (y == 0 || y == map.length - 1 || x == 0 || x == map[y].length - 1) {
                    map[y][x] = "#";
                } else if (random.nextInt(100) < fill) {
                    map[y][x] = "#";
                } else {
                    map[y][x] = ".";
                }
            }
        }
    }

    /**
     * Iterate over map and rearrange walls based on set rules.
     */
    public void shapeMap() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                int surroundingWalls = surroundingWallCount(x, y);
                if (surroundingWalls > 4) {
                    map[y][x] = "#";
                } else if (surroundingWalls < 4) {
                    map[y][x] = ".";
                }
            }
        }
    }

    /**
     * Return amount of surrounding wall tiles for tile in given coordinates.
     * Treat all tiles outside grid as walls.
     * @param x coordinate
     * @param y coordinate
     * @return
     */
    public int surroundingWallCount(int x, int y) {
        int walls = 0;
        for (int neighbourY = y - 1; neighbourY <= y + 1; neighbourY++) {
            for (int neighbourX = x - 1; neighbourX <= x + 1; neighbourX++) {
                //Make sure processed tile is within map boundries.
                if (neighbourY >= 0 && neighbourY < map.length && neighbourX >= 0 && neighbourX < map[y].length) {
                    if (neighbourX != x || neighbourY != y) {
                        if (map[neighbourY][neighbourX].equals("#")) {
                            walls++;
                        }
                    }
                } else {
                    walls++;
                }
            }
        }
        return walls;
    }
}
