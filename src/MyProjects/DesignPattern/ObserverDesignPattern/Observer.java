package MyProjects.DesignPattern.ObserverDesignPattern;

//The Observer Pattern defines a one to many dependency between objects
// so that one object changes state,
// all of its dependents are notified and updated automatically.
//for exapmle subscribe button on youtube once you click on subscribe we will get a notification
//everytime that channel is uploading video instead of we going and checking is the video uploaded
//So channel will be subject and subscribes will be Observer
public class Observer {
    public static void main(String args[]){
        Channel ashutosh = new Channel();
        Subscriber s1 = new Subscriber("A");
        Subscriber s2 = new Subscriber("B");
        Subscriber s3 = new Subscriber("C");
        Subscriber s4 = new Subscriber("D");

        ashutosh.subscribe(s1);
        ashutosh.subscribe(s2);
        ashutosh.subscribe(s3);
        ashutosh.subscribe(s4);

        s1.subscribeChannel(ashutosh);
        s2.subscribeChannel(ashutosh);
        s3.subscribeChannel(ashutosh);
        s4.subscribeChannel(ashutosh);

        ashutosh.upload("My first video");

    }
}
