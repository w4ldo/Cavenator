## Cavenator

The goal of this project is to create a cave generating application on Java for roguelike/2d dungeons. The project will implement [cellular automaton](https://en.wikipedia.org/wiki/Cellular_automaton) to generate random cave formation from user controlled seed.

### Datastructures and algorithms

The project shouldn't require many advanced datastructures as caves can be easily represented and handled in two-dimensional arrays. The focus should be to implement an algorithm to generate random map data based on specifications provided by user and grooming it over steps to make a cohesive end result.

### Time complexity

Generating caves iterates over the width and height of the 2-dimensional array and results in O(n) where n = width * height.
Further shaping the caves takes multiple iterations of looping through the array and visiting neighbours each time visiting 9 adjecant nodes. E.g. with 5 reshapes total algorithm should result in n + 5 * 9n = 46n where 46 is constant and O(n).

### Sources

* https://en.wikipedia.org/wiki/Cellular_automaton
* https://gamedevelopment.tutsplus.com/tutorials/generate-random-cave-levels-using-cellular-automata--gamedev-9664
* http://www.roguebasin.com/index.php?title=Cellular_Automata_Method_for_Generating_Random_Cave-Like_Levels
* http://www.wesley-kerr.com/caves/
