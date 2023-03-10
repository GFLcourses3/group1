package executor.service.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyCredentialsDTOTest {

    private final String user = "user";
    private final String password = "password";
    private ProxyCredentialsDTO expectedDTO;

    @BeforeEach
    public void setUp(){
        expectedDTO = new ProxyCredentialsDTO(user,password);
    }

    @Test
    public void testEquals(){
        ProxyCredentialsDTO actualDTO = new ProxyCredentialsDTO(user,password);
        assertEquals(expectedDTO, actualDTO);
    }

    @Test
    public void testGetters(){
        assertEquals(user,expectedDTO.getUser());
        assertEquals(password,expectedDTO.getPassword());
    }

    @Test
    public void testSetters(){
        String newUser = "newUser";
        String newPassword = "newPassword";
        expectedDTO.setUser(newUser);
        expectedDTO.setPassword(newPassword);
        assertEquals(newUser,expectedDTO.getUser());
        assertEquals(newPassword,expectedDTO.getPassword());
    }

    @Test
    public void testHashCode(){
        ProxyCredentialsDTO actualDTO = new ProxyCredentialsDTO(user,password);
        assertEquals(expectedDTO.hashCode(),actualDTO.hashCode());
    }

    @Test
    public void testDifferentDTO(){
        ProxyCredentialsDTO actualDTO = new ProxyCredentialsDTO("newUser","newPassword");
        assertNotEquals(expectedDTO,actualDTO);
    }

    @Test
    public void testDifferentObjects(){
        String query = "SELECT * FROM users";
        Integer number = 1234;
        assertNotEquals(expectedDTO,query);
        assertNotEquals(expectedDTO,number);
    }

    @Test
    public void testEmptyConstructorDTO(){
        ProxyCredentialsDTO actualDTO = new ProxyCredentialsDTO();
        assertNull(actualDTO.getUser());
        assertNull(actualDTO.getPassword());
    }

    @Test
    public void testEmptySetters(){
        expectedDTO.setUser(null);
        expectedDTO.setPassword(null);
        assertNull(expectedDTO.getUser());
        assertNull(expectedDTO.getPassword());
    }

}