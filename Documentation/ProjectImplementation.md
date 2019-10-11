## Implementation

The project is a small desktop application. Technologies used are Java, Maven and Swing. Running the project opens a simple graphical user interface from which the user can interact with the application. The user can create a randomized map and shape it using customizable algorithms based on cellular automata. The implemented GUI uses 600x400 cavas that is populated with 300x200 int array.

### Implementation of algorithms

General steps in creating and shaping a map (where x is width and y is height):
  
    CreateMap() {
      for (y)
        for (x)
          Randomize pixel
    }
    
Here time complexity is O(n) where n is the total amount of pixels in the map.

    ShapeMap() {
      for (y)
        for (x)
          CountWalls()
          ChangePixel()
    }
    
Here CountWalls() iterates the desired amount of neighbouring tiles around the pixel. The amount is a constant (z) and for this applications purposes it ranges from 8 to 48. Thus time complexity is x*y*z where x*y is the amount of pixels and z is a constant and O(n) with large numbers.
