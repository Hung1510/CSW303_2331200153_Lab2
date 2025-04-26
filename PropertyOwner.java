
import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {

    private User user;
    private List<Property> listOfProperties = new ArrayList<>();

    public PropertyOwner(User user, List<Property> listOfProperties) {
        this.user = user;
        this.listOfProperties = listOfProperties;
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
