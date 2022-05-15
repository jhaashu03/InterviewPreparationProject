package MyProjects.DesignPattern.FactoryDesign;

public class OperatingSystemFactory {
    public OS getInstance(String name){
        if(name.equals("Open"))
            return new Android();
        else if(name.equals("Closed"))
            return new Android();
        else
            return new Android();
    }
}
