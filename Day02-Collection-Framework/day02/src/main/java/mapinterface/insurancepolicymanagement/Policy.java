package mapinterface.insurancepolicymanagement;

public class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyHolder;
    int expiryDate; // Number of days until expiry
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolder, int expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    @Override
    public int compareTo(Policy other) {
        return Integer.compare(this.expiryDate, other.expiryDate);
    }
}