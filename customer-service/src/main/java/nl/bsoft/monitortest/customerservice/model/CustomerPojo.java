package nl.bsoft.monitortest.customerservice.model;

public class CustomerPojo {
    private Integer customerId;
    private String policyId;
    private String claimId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public CustomerPojo(Integer customerId, String policyId, String claimId) {
        this.customerId = customerId;
        this.policyId = policyId;
        this.claimId = claimId;
    }
}