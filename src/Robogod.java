@ByTheWay(name="Xela", age = 1, data = "the day that Christ was born")
@Immortal
public class Robogod {
    int seed = 7;
    @Deprecated
    public int generateAbsolutelyRandomSeed(){
        if (seed == 7)
            return 42;
        if (seed == 42)
            return 228;
        if (seed == 228)
            return 7;
        return -1;
    }

    public String createWorld(){
        seed = generateAbsolutelyRandomSeed();
        int randomPlanetCode = 1234 / seed;
        if (randomPlanetCode > 28)
            return "New world is great";
        return "You created Hell...";
    }
}

