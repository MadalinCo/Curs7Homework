package AnimalsBehaves;

public class Chicken implements InterfaceForBehaves{
    @Override
    public String walk() {
        return "chicken-walking";
    }

    @Override
    public String talk() {
        return "chicken-talking";
    }

    @Override
    public String eat() {
        return "chicken-eating";
    }
}
