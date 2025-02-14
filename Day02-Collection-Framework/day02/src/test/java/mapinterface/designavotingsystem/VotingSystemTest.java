package mapinterface.designavotingsystem;


import static mapinterface.designavotingsystem.VotingSystem.castVote;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class VotingSystemTest {

    @BeforeEach
    void setUp() {
        castVote("Raksha");
        castVote("Raksha");
        castVote("savi");
        castVote("savi");
        castVote("pak");
        castVote("Raksha");
        castVote("pak");
    }

    @Test
    void testCastVote() {
        assertEquals(3, VotingSystem.getVotes("Raksha"));
        assertEquals(2, VotingSystem.getVotes("pak"));
        assertEquals(2, VotingSystem.getVotes("savi"));
        assertEquals(0, VotingSystem.getVotes("ashi"));
    }

    @Test
    void testSortedResults() {
        Map<String, Integer> sortedResults = VotingSystem.getSortedResults();

        assertEquals(3, sortedResults.size());
        assertEquals(3, sortedResults.get("Raksha"));
        assertEquals(2, sortedResults.get("savi"));
        assertEquals(2, sortedResults.get("pak"));

        assertTrue(sortedResults.keySet().toArray()[0].equals("Raksha"));
        assertTrue(sortedResults.keySet().toArray()[1].equals("savi"));
        assertTrue(sortedResults.keySet().toArray()[2].equals("pak"));
    }

    @Test
    void testVotesInOrder() {
        Map<String, Integer> votesInOrder = VotingSystem.getVotesInOrder();

        assertEquals(3, votesInOrder.size());
        assertEquals(3, votesInOrder.get("Raksha"));
        assertEquals(2, votesInOrder.get("savi"));
        assertEquals(2, votesInOrder.get("pak"));

        assertTrue(votesInOrder.keySet().toArray()[0].equals("Raksha"));
        assertTrue(votesInOrder.keySet().toArray()[1].equals("savi"));
        assertTrue(votesInOrder.keySet().toArray()[2].equals("pak"));
    }
}
