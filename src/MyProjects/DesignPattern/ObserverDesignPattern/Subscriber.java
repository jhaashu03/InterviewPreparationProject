package MyProjects.DesignPattern.ObserverDesignPattern;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " +name+" Video uploaded "+ channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
