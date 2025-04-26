public class RentalContract {
     String contractId;
     String propertyId;
     String tenantId;
     double rentAmount;

    public RentalContract(String contractId, String propertyId, String tenantId, double rentAmount) {
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
    }

    public void createContract() {
        System.out.println(contractId +propertyId);
    }

    public void terminateContract() {
        System.out.println(contractId+ " terminate");
    }

    public String getContractId() {
        return contractId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getTenantId() {
        return tenantId;
    }
}