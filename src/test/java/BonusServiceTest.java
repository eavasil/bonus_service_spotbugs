import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void test() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        service.calculate(amount, registered);
    }
}

