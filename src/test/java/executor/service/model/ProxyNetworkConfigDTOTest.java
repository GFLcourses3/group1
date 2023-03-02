package executor.service.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProxyNetworkConfigDTOTest {

    ProxyNetworkConfigDTO proxyNetworkConfig1;
    ProxyNetworkConfigDTO proxyNetworkConfig2;
    ProxyNetworkConfigDTO proxyNetworkConfig3;

    @BeforeEach
    void setUpEach() {
        proxyNetworkConfig1 = new ProxyNetworkConfigDTO("localhost", 8080);
        proxyNetworkConfig2 = new ProxyNetworkConfigDTO("somehost", 80);
        proxyNetworkConfig3 = new ProxyNetworkConfigDTO();
    }

    @Test
    void testEquals() {
        ProxyNetworkConfigDTO proxyNetworkConfig4 = new ProxyNetworkConfigDTO("localhost", 8080);
        proxyNetworkConfig3.setHostname("localhost");
        proxyNetworkConfig3.setPort(8080);
        assertFalse(proxyNetworkConfig1.equals(proxyNetworkConfig2));
        assertTrue(proxyNetworkConfig1.equals(proxyNetworkConfig3));
        assertTrue(proxyNetworkConfig1.equals(proxyNetworkConfig4));
    }

    @Test
    void testNotHashCode() {
        assertNotEquals(proxyNetworkConfig1.hashCode(), proxyNetworkConfig2.hashCode());
        proxyNetworkConfig3.setHostname("localhost");
        proxyNetworkConfig3.setPort(8080);
        assertEquals(proxyNetworkConfig1.hashCode(), proxyNetworkConfig3.hashCode());
    }

    @Test
    void testGetHostname() {
        assertEquals("localhost", proxyNetworkConfig1.getHostname());
        assertEquals("somehost", proxyNetworkConfig2.getHostname());
    }

    @Test
    void testSetHostname() {
        assertEquals("localhost", proxyNetworkConfig1.getHostname());
        proxyNetworkConfig1.setHostname("somehost");
        assertNotEquals("localhost", proxyNetworkConfig1.getHostname());
        assertEquals("somehost", proxyNetworkConfig1.getHostname());
    }

    @Test
    void testGetPort() {
        assertEquals(8080, proxyNetworkConfig1.getPort());
        assertEquals(80, proxyNetworkConfig2.getPort());
    }

    @Test
    void testSetPort() {
        assertEquals(8080, proxyNetworkConfig1.getPort());
        proxyNetworkConfig1.setPort(80);
        assertNotEquals(8080, proxyNetworkConfig1.getPort());
        assertEquals(80, proxyNetworkConfig1.getPort());
    }
}