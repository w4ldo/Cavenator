
import com.mapgen.cavenator.CaveGenerator;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class CaveGeneratorTest {

    private CaveGenerator cavegen;
    private String[][] map;

    @Before
    public void setUp() {
        this.map = new String[5][5];
        this.cavegen = new CaveGenerator(map);
    }

    @Test
    public void afterCaveGeneratedAllEdgesAreWalls() {
        cavegen.generateCaves(45);
        for (int y = 0; y < map[0].length; y++) {
            assertEquals("#", map[y][0]);
        }
        for (int y = 0; y < map.length; y++) {
            assertEquals("#", map[y][map.length - 1]);
        }
        for (int x = 0; x < map[0].length; x++) {
            assertEquals("#", map[0][x]);
        }
        for (int x = 0; x < map[0].length; x++) {
            assertEquals("#", map[map[0].length - 1][x]);
        }
    }

    @Test
    public void withZeroFillInnerTilesAreNotWalls() {
        cavegen.generateCaves(0);
        for (int y = 1; y < map.length - 1; y++) {
            for (int x = 1; x < map[y].length - 1; x++) {
                assertEquals(".", map[y][x]);
            }
        }
    }

    @Test
    public void withHundredPercentFillAllInnerTilesWalls() {
        cavegen.generateCaves(100);
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                assertEquals("#", map[y][x]);
            }
        }
    }

    @Test
    public void surroundingWallCountIsReturnedCorrectly() {
        cavegen.generateCaves(0);
        assertEquals(5, cavegen.surroundingWallCount(1, 1));
        cavegen.generateCaves(100);
        assertEquals(8, cavegen.surroundingWallCount(1, 1));
    }

    @Test
    public void shapingMapAffectsWallsCorrectly() {
        cavegen.generateCaves(0);
        cavegen.shapeMap();
        assertEquals("#", map[1][1]);

        cavegen.generateCaves(0);
        cavegen.shapeMap();
        assertEquals(".", map[1][2]);
    }

    @Test
    public void shapingMapMultipleTimesWorksCorrectly() {
        cavegen.generateCaves(0);
        assertEquals(".", map[1][2]);
        cavegen.shapeMap();
        assertEquals(".", map[1][2]);
        cavegen.shapeMap();
        assertEquals("#", map[1][2]);
    }
}
