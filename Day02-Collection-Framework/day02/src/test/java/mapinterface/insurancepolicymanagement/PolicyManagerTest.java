package mapinterface.insurancepolicymanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class InsurancePolicyManagementSystemTest {

    @BeforeEach
    void setUp() {
        InsurancePolicyManagementSystem.hashMapPolicies.clear();
        InsurancePolicyManagementSystem.linkedHashMapPolicies.clear();
        InsurancePolicyManagementSystem.treeMapPolicies.clear();

        InsurancePolicyManagementSystem.addPolicy(new Policy("P1", "savi", 20, "Health", 1000));
        InsurancePolicyManagementSystem.addPolicy(new Policy("P2", "rida", 40, "Car", 3000));
        InsurancePolicyManagementSystem.addPolicy(new Policy("P3", "raksh", 10, "Life", 2000));
    }

    @Test
    void testAddPolicy() {
        Policy policy = new Policy("P4", "Rahul", 50, "Home", 2500);
        InsurancePolicyManagementSystem.addPolicy(policy);

        assertEquals(policy, InsurancePolicyManagementSystem.getPolicyByNumber("P4"));
    }

    @Test
    void testGetPolicyByNumber() {
        Policy policy = InsurancePolicyManagementSystem.getPolicyByNumber("P1");
        assertNotNull(policy);
        assertEquals("savi", policy.getPolicyHolder());
    }

    @Test
    void testGetExpiringPoliciesSoon() {
        List<Policy> expiringPolicies = InsurancePolicyManagementSystem.getExpiringPoliciesSoon();
        assertEquals(2, expiringPolicies.size());
    }

    @Test
    void testGetPoliciesByHolder() {
        List<Policy> policies = InsurancePolicyManagementSystem.getPoliciesByHolder("savi");
        assertEquals(1, policies.size());
    }

    @Test
    void testRemoveExpiredPolicies() {
        InsurancePolicyManagementSystem.removeExpiredPolicies();
        assertEquals(1, InsurancePolicyManagementSystem.hashMapPolicies.size());
    }
}