package AnimalsBehaves;

public class Duck implements InterfaceForBehaves {


    @Override
    public String walk() {
        return "duck-walking";
    }

    @Override
    public String talk() {
        return "duck-talking";
    }

    @Override
    public String eat() {
        return "duck-eating";
    }
}
