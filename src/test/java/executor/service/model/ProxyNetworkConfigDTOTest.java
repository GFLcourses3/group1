package executor.service.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProxyNetworkConfigDTOTest {

    private static final String LOCALHOST = "localhost";
    private static final String SOMEHOST = "somehost";
    private static final Integer PORT_8080 = 8080;
    private static final Integer PORT_80 = 80;

    private ProxyNetworkConfigDTO proxyNetworkConfig1;
    private ProxyNetworkConfigDTO proxyNetworkConfig2;
    private ProxyNetworkConfigDTO proxyNetworkConfig3;

    @BeforeEach
    public void setUpEach() {
        proxyNetworkConfig1 = new ProxyNetworkConfigDTO(LOCALHOST, PORT_8080);
        proxyNetworkConfig2 = new ProxyNetworkConfigDTO(SOMEHOST, PORT_80);
        proxyNetworkConfig3 = new ProxyNetworkConfigDTO();
    }

    @Test
    public void testEquals() {
        ProxyNetworkConfigDTO proxyNetworkConfig4 = new ProxyNetworkConfigDTO(LOCALHOST, PORT_8080);
        proxyNetworkConfig3.setHostname(LOCALHOST);
        proxyNetworkConfig3.setPort(PORT_8080);
        assertFalse(proxyNetworkConfig1.equals(proxyNetworkConfig2));
        assertTrue(proxyNetworkConfig1.equals(proxyNetworkConfig3));
        assertTrue(proxyNetworkConfig1.equals(proxyNetworkConfig4));
    }

    @Test
    public void testNotHashCode() {
        assertNotEquals(proxyNetworkConfig1.hashCode(), proxyNetworkConfig2.hashCode());
        proxyNetworkConfig3.setHostname(LOCALHOST);
        proxyNetworkConfig3.setPort(PORT_8080);
        assertEquals(proxyNetworkConfig1.hashCode(), proxyNetworkConfig3.hashCode());
    }

    @Test
    public void testGetHostname() {
        assertEquals(LOCALHOST, proxyNetworkConfig1.getHostname());
        assertEquals(SOMEHOST, proxyNetworkConfig2.getHostname());
    }

    @Test
    public void testSetHostname() {
        assertEquals(LOCALHOST, proxyNetworkConfig1.getHostname());
        proxyNetworkConfig1.setHostname(SOMEHOST);
        assertNotEquals(LOCALHOST, proxyNetworkConfig1.getHostname());
        assertEquals(SOMEHOST, proxyNetworkConfig1.getHostname());
    }

    @Test
    public void testGetPort() {
        assertEquals(PORT_8080, proxyNetworkConfig1.getPort());
        assertEquals(PORT_80, proxyNetworkConfig2.getPort());
    }

    @Test
    public void testSetPort() {
        assertEquals(PORT_8080, proxyNetworkConfig1.getPort());
        proxyNetworkConfig1.setPort(PORT_80);
        assertNotEquals(PORT_8080, proxyNetworkConfig1.getPort());
        assertEquals(PORT_80, proxyNetworkConfig1.getPort());
    }
}