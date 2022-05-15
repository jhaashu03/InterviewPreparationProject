package MyProjects.DesignPattern.BuilderDesign;


//We use this when we have multiple parameters to the constructors
//It is used to construct a complex object step by step and the final step will return the object.
// it can be used to create different representations of the same object
public class Shop {
    public static void main(String args[]){
        //use to specify all the paramters here to get an object
        //we don't have option to not pass one paramter, we have to pass all
        //Phone p = new Phone("OnePlus","Android",6,4000,40,5,5);
        Phone p = new PhoneBuilder().setName("OnePlus").setRam(6).getPhone();
        System.out.println(p);
    }
}
