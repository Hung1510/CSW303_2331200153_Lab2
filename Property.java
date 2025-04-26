public class Property {
    String propertyId;
    String description;
    String propertyOwnerId;

    public Property(String propertyId, String description, String propertyOwnerId) {
        this.propertyId = propertyId;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getPropertyOwnerId() {
        return propertyOwnerId;
    }
}