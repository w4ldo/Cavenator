package cavenator.domain;

import java.util.Date;
import java.util.Random;

/**
 * Class responsible for generating cave
 */
public class CaveGenerator {

    private String[][] map;

    /**
     * Constructor
     *
     * @param map
     */
    public CaveGenerator(String[][] map) {
        this.map = map;
    }

    /**
     * Generate initial walls to map based on fill percent. Derive random seed
     * from current time. Minimum thickness for ceiling and walls is 5 tiles and 10 tiles for floor.
     *
     * @param fill
     */
    public void generateCaves(int fill) {
        String seed = new Date().toString();
        Random random = new Random(seed.hashCode());

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (y < 5 || y > map.length - 11 || x < 5 || x > map[y].length - 6) {
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
    public void shapeMap(int distance, int walls) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                int surroundingWalls = surroundingWallCount(x, y, distance);
                if (surroundingWalls > walls) {
                    map[y][x] = "#";
                } else if (surroundingWalls < walls) {
                    map[y][x] = ".";
                }
            }
        }
    }

    /**
     * Return amount of surrounding wall tiles for tile in given coordinates.
     * Treat all tiles outside grid as walls.
     *
     * @param x coordinate
     * @param y coordinate
     * @param distance how far neighbours will be counted
     * @return
     */
    public int surroundingWallCount(int x, int y, int distance) {
        int walls = 0;
        for (int neighbourY = y - distance; neighbourY <= y + distance; neighbourY++) {
            for (int neighbourX = x - distance; neighbourX <= x + distance; neighbourX++) {
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

    public String[][] getMap() {
        return map;
    }
}
