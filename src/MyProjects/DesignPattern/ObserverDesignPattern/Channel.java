package MyProjects.DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    List<Subscriber> subscribers = new ArrayList<>();
    public String title;

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber subscriber: subscribers){
            subscriber.update();
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
