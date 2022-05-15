package MyProjects.DesignPattern.BuilderDesign;

public class PhoneBuilder {
    String name;
    String OS;
    int ram;
    int battery;
    int camra;
    double screenSize;

    //All setters no getter

    public PhoneBuilder setName(String name) {
        this.name = name;
        //return same object
        return this;
    }

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamra(int camra) {
        this.camra = camra;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name,OS,ram,battery,camra,screenSize);
    }

}
