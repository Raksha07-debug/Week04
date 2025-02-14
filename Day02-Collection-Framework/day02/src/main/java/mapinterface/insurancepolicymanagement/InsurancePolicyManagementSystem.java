package mapinterface.insurancepolicymanagement;

import java.util.*;

public class InsurancePolicyManagementSystem {

    public static Map<String, Policy> hashMapPolicies = new HashMap<>();
    public static Map<String, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    public static TreeMap<Integer, Policy> treeMapPolicies = new TreeMap<>();

    public static void addPolicy(Policy policy) {
        hashMapPolicies.put(policy.policyNumber, policy);
        linkedHashMapPolicies.put(policy.policyNumber, policy);
        treeMapPolicies.put(policy.getExpiryDate(), policy);
    }

    public static Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    public static List<Policy> getExpiringPoliciesSoon() {
        List<Policy> expiringPolicies = new ArrayList<>();
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.getExpiryDate() <= 30) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    public static List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(policyHolder)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public static void removeExpiredPolicies() {
        for (Map.Entry<String, Policy> entry : linkedHashMapPolicies.entrySet()) {
            if (entry.getValue().getExpiryDate() <= 30) {
                hashMapPolicies.remove(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        Policy policy1 = new Policy("P1", "savi", 20, "Health", 1000);
        Policy policy2 = new Policy("P2", "rida", 40, "Car", 3000);
        Policy policy3 = new Policy("P3", "raksh", 10, "Life", 2000);

        addPolicy(policy1);
        addPolicy(policy2);
        addPolicy(policy3);

        System.out.println("Policy by Number (P1): " + getPolicyByNumber("P1"));
        System.out.println("Expiring Soon: " + getExpiringPoliciesSoon().size());
        System.out.println("Policies by Holder (raksh): " + getPoliciesByHolder("raksh").size());

        removeExpiredPolicies();
        System.out.println("Policies after removing expired: " + hashMapPolicies.size());
    }
}