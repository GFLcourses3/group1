package executor.service.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ScenarioDTOTest {

    @Test
    public void testEqualsDTO() {

        List<StepDTO> list = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));

        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name", "Site", list);

        ScenarioDTO scenarioDTO2 = new ScenarioDTO();
        scenarioDTO2.setName("Name");
        scenarioDTO2.setSite("Site");
        scenarioDTO2.setSteps(list);

        assertEquals(scenarioDTO1, scenarioDTO2);
    }

    @Test
    public void testEqualHashCode() {

        List<StepDTO> list = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));

        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", list);
        ScenarioDTO scenarioDTO2 = new ScenarioDTO("Name-1","Site-1",list);

        assertEquals(scenarioDTO1.hashCode(), scenarioDTO2.hashCode());
    }

    @Test
    public void testNotEqualsDTO() {
        List<StepDTO> list = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));

        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", list);

        ScenarioDTO scenarioDTO2 = new ScenarioDTO("Name-12312","Site-1",list);

        assertNotEquals(true, Objects.equals(scenarioDTO1,scenarioDTO2));
    }

   @Test
   public void testGetters() {

       List<StepDTO> list = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));

       ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", list);

       ScenarioDTO scenarioDTO2 = new ScenarioDTO();
       scenarioDTO2.setName("Name-1");
       scenarioDTO2.setSite("Site-1");
       scenarioDTO2.setSteps(list);

       assertEquals(scenarioDTO1.getSteps(), scenarioDTO2.getSteps());
   }

    @Test
    public void testCompareValueAndGetter() {

        List<StepDTO> list = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));
        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", list);

        String expectedName = "Name-1";

        assertEquals(expectedName,scenarioDTO1.getName());
    }

    @Test
    public void testSetters() {

        String name = "Name-1";
        String site = "Site-1";
        List<StepDTO> steps = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));

        ScenarioDTO scenarioDTO1 = new ScenarioDTO();
        scenarioDTO1.setName(name);
        scenarioDTO1.setSite(site);
        scenarioDTO1.setSteps(steps);

        assertEquals(name, scenarioDTO1.getName());
        assertEquals(site, scenarioDTO1.getSite());
        assertEquals(steps, scenarioDTO1.getSteps());
    }

   @Test
   public void testNullDTO() {

        ScenarioDTO scenarioDTO = null;

        assertNull(scenarioDTO);
    }

    @Test
    public void testNullValue() {

        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", null);

        assertNull(scenarioDTO1.getSteps());
    }

    @Test
    public void testNotNullDTO() {

        List<StepDTO> list1 = Arrays.asList(new StepDTO("Action-1", "Value-1"), new StepDTO("Action-2", "Value-2"));
        ScenarioDTO scenarioDTO1 = new ScenarioDTO("Name-1", "Site-1", list1);

        assertNotNull(scenarioDTO1);
    }
}