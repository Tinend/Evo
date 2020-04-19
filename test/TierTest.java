import static org.junit.jupiter.api.Assertions.*;

class TierTest {

    @org.junit.jupiter.api.Test
    void kindZeugen() {
        Tier tier = new Tier(10, 7);
        Tier kind = tier.kindZeugen();
        assertEquals(7, tier.getEnergie() + kind.getEnergie());
    }
}