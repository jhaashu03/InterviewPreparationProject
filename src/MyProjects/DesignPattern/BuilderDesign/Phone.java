package MyProjects.DesignPattern.BuilderDesign;

public class Phone {
    String name;
    String OS;
    int ram;
    int battery;
    int camra;
    double screenSize;

    public Phone(String name, String OS, int ram, int battery, int camra, double screenSize) {
        this.name = name;
        this.OS = OS;
        this.ram = ram;
        this.battery = battery;
        this.camra = camra;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "name='" + name + '\'' +
                ", OS='" + OS + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", camra=" + camra +
                ", screenSize=" + screenSize +
                '}';
    }
}
