package nl.bsoft.monitortest.customerservice.model;


import java.util.Objects;

public class CustomerPojo {
    private Integer customerId;
    private String policyId;
    private String claimId;

    public CustomerPojo(Integer customerId, String policyId, String claimId) {
        this.customerId = customerId;
        this.policyId = policyId;
        this.claimId = claimId;
    }

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

    @Override
    public String toString() {
        return "CustomerPojo{" +
                "customerId=" + customerId +
                ", policyId='" + policyId + '\'' +
                ", claimId='" + claimId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPojo that = (CustomerPojo) o;
        return customerId.equals(that.customerId) && policyId.equals(that.policyId) && claimId.equals(that.claimId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, policyId, claimId);
    }
}