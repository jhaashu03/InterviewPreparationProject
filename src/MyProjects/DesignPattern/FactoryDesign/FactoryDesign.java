package MyProjects.DesignPattern.FactoryDesign;

public class FactoryDesign {
    public static void main(String args[]){
        //OS phone = new Android(); // instread of creating direct class create a factoy class for objects.
        //phone.spec();


        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj = operatingSystemFactory.getInstance("Open");
        obj.spec();

    }
}
