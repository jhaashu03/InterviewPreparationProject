package MyProjects.Interview.OnlineBookReaderSystem;

public class User {
    private int userId;
    private String name;
    private String details;

    public User(int userId, String name, String details) {
        this.userId = userId;
        this.name = name;
        this.details = details;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
