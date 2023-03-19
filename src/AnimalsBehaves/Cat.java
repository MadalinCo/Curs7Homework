package AnimalsBehaves;

public class Cat implements InterfaceForBehaves{
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "cat-talking";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }
}

