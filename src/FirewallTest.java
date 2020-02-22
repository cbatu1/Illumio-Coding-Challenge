import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FirewallTest {
    private Firewall firewall;

    @Before
    public void setUp() throws IOException {
        firewall = new Firewall("inputRules.csv");
    }

    @Test
    public void test1() {
        assertTrue(firewall.accept_packet("outbound", "udp", 1000, "52.12.48.92"));
    }

    @Test
    public void test2() {
        assertTrue(firewall.accept_packet("outbound", "udp", 2000, "52.12.48.92"));
    }

    @Test
    public void test3() {
        assertFalse(firewall.accept_packet("outbound", "tcp", 20100, "192.168.10.11"));
    }

    @Test
    public void test4() {
        assertFalse(firewall.accept_packet("inbound", "udp", 24, "52.12.48.92"));
    }
}