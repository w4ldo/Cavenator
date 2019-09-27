package cavenator.domain;

import java.util.Date;
import java.util.Random;

/**
 * Class responsible for generating cave
 */
public class CaveGenerator {

    private String[][] map;
    private HashCodeGenerator hcGen;

    /**
     * Constructor
     *
     * @param map
     */
    public CaveGenerator(String[][] map) {
        this.map = map;
        this.hcGen = new HashCodeGenerator();
    }

    /**
     * Derive string from current time and invoke overloaded method.
     *
     * @param fill map fill percent
     */
    public void generateCaves(int fill) {
        String time = new Date().toString();
        generateCaves(fill, time);
    }

    /**
     * Derive random seed from parameter string and invoke overloaded method
     *
     * @param fill map fill percent
     * @param string custom seed
     */
    public void generateCaves(int fill, String string) {
        int seed = hcGen.generateStringHashCode(string);
        Random random = new Random(seed);
        generateCaves(fill, random);
    }

    /**
     * Generate initial walls to map based on fill percent. 
     * Minimum thickness for ceiling and walls is 5 tiles and
     * 10 tiles for floor.
     *
     * @param fill map fill percent
     * @param random randomizer
     */
    public void generateCaves(int fill, Random random) {
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
     * 
     * @param distance how far neighbours are checked 
     * e.g. distance = 1 -> check adjecant 8 neighhbours, distance = 2 -> check adjecant 24 neighbours...
     * @param wallLimit amount of neighbour walls that determines whether iterated tile will be wall or not
     */
    public void shapeMap(int distance, int wallLimit) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                int surroundingWalls = surroundingWallCount(x, y, distance);
                if (surroundingWalls > wallLimit) {
                    map[y][x] = "#";
                } else if (surroundingWalls < wallLimit) {
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
