package executor.service.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadPoolConfigDTOTest {

    @Test
    public void testConstructorAndGetters() {
        Integer corePoolSize = 5;
        Long keepAliveTime = 1000L;
        ThreadPoolConfigDTO config = new ThreadPoolConfigDTO(corePoolSize, keepAliveTime);
        assertEquals(corePoolSize, config.getCorePoolSize());
        assertEquals(keepAliveTime, config.getKeepAliveTime());
    }

    @Test
    public void testSetters() {
        ThreadPoolConfigDTO config = new ThreadPoolConfigDTO();
        config.setCorePoolSize(10);
        config.setKeepAliveTime(500L);
        assertEquals(Integer.valueOf(10), config.getCorePoolSize());
        assertEquals(Long.valueOf(500L), config.getKeepAliveTime());
    }

    @Test
    public void testEqualsAndHashCode() {
        ThreadPoolConfigDTO config1 = new ThreadPoolConfigDTO(5, 1000L);
        ThreadPoolConfigDTO config2 = new ThreadPoolConfigDTO(5, 1000L);
        ThreadPoolConfigDTO config3 = new ThreadPoolConfigDTO(10, 1000L);
        assertTrue(config1.equals(config2));
        assertFalse(config1.equals(config3));
        assertEquals(config1.hashCode(), config2.hashCode());
        assertNotEquals(config1.hashCode(), config3.hashCode());
    }
}