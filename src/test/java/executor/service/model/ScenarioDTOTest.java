package executor.service.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ScenarioDTOTest {

    private final String name = "Name-1";
    private final String site = "Site-1";
    private List<StepDTO> stepDTOList;
    private ScenarioDTO scenarioDTO;

    @BeforeEach
    public void setUp() {

        stepDTOList = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));
        scenarioDTO = new ScenarioDTO(name, site, stepDTOList);
    }

    @Test
    public void testEqualsDTO() {

        ScenarioDTO scenarioDTO2 = new ScenarioDTO();
        scenarioDTO2.setName(name);
        scenarioDTO2.setSite(site);
        scenarioDTO2.setSteps(stepDTOList);

        assertEquals(scenarioDTO, scenarioDTO2);
    }

    @Test
    public void testEqualHashCode() {

        ScenarioDTO scenarioDTO2 = new ScenarioDTO(name,site, stepDTOList);

        assertEquals(scenarioDTO.hashCode(), scenarioDTO2.hashCode());
    }

    @Test
    public void testNotEqualsDTO() {

        ScenarioDTO scenarioDTO2 = new ScenarioDTO();
        scenarioDTO2.setName(scenarioDTO.getName() + " ");
        scenarioDTO2.setSite(scenarioDTO.getSite());
        scenarioDTO2.setSteps(scenarioDTO.getSteps());

        assertNotEquals(true, Objects.equals(scenarioDTO,scenarioDTO2));
    }

   @Test
   public void testGetters() {

       ScenarioDTO scenarioDTO2 = new ScenarioDTO();
       scenarioDTO2.setName(name);
       scenarioDTO2.setSite(site);
       scenarioDTO2.setSteps(stepDTOList);

       assertEquals(scenarioDTO.getSteps(), scenarioDTO2.getSteps());
   }

    @Test
    public void testCompareValueAndGetter() {

        assertEquals(name, scenarioDTO.getName());
    }

    @Test
    public void testSetters() {

        ScenarioDTO scenarioDTO1 = new ScenarioDTO();
        scenarioDTO1.setName(name);
        scenarioDTO1.setSite(site);
        scenarioDTO1.setSteps(stepDTOList);

        assertEquals(name, scenarioDTO1.getName());
        assertEquals(site, scenarioDTO1.getSite());
        assertEquals(stepDTOList, scenarioDTO1.getSteps());
    }

    @Test
    public void testNullValue() {

        scenarioDTO.setSteps(null);

        assertNull(scenarioDTO.getSteps());
    }

    @Test
    public void testNotNullDTO() {

        assertNotNull(scenarioDTO);
    }
}