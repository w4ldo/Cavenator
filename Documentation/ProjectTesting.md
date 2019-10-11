## Testing

The project has junit tests and linter for clean code. Reports are generated weekly as the project advances and attached to the documentation. Unit tests can be run locally by cloning the repository. Technologies used are Junit, Pit and Checkstyle.

[Pit](https://htmlpreview.github.io/?https://github.com/w4ldo/Cavenator/blob/master/Documentation/pit/index.html)

[Checkstyle](https://htmlpreview.github.io/?https://github.com/w4ldo/Cavenator/blob/master/Documentation/checkstyle.html)

## Performance

The application was tested with following inputs and results:

### 1000x1000(n=1000000)

    GenerateCave: 24ms

Shape checking 9 neighbours
   
    ShapeCave: 50ms
    Total: 74ms

Shape checking 24 neighbours

    ShapeCave: 125ms
    Total: 148ms

Shape checking 48 neighbours

    ShapeCave: 206ms
    Total: 229ms

##

### 10000x10000(n=100000000)

    GenerateCave: 1400ms
    
Shape checking 9 neighbours

    ShapeCave: 3539ms
    Total: 4985ms

Shape checking 24 neighbours

    ShapeCave: 10146ms
    Total: 11667ms

Shape checking 48 neighbours

    ShapeCave: 17795ms
    Total: 19195ms
