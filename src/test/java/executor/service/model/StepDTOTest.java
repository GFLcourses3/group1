package executor.service.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StepDTOTest {

    private final String action = "click";
    private final String value = "body";
    private StepDTO expectedStepDTO;

    @BeforeEach
    public void setUp() {

        expectedStepDTO = new StepDTO(action, value);

    }

    @Test
    public void testEqualOrNot() {
        StepDTO actualStepObj = new StepDTO(action, value);
        Assertions.assertEquals(expectedStepDTO, actualStepObj);
    }

    @Test
    public void testForGetters() {
        Assertions.assertEquals(action, expectedStepDTO.getAction());
        Assertions.assertEquals(value, expectedStepDTO.getValue());
    }


    @Test
    public void testForSetters() {
        String newAction = "click-2";
        String newValue = "body-2";
        expectedStepDTO.setAction(newAction);
        expectedStepDTO.setValue(newValue);
        Assertions.assertEquals(newAction, expectedStepDTO.getAction());
        Assertions.assertEquals(newValue, expectedStepDTO.getValue());
    }

    @Test
    public void testForEqualsAndHash() {
        StepDTO actualStepObj = new StepDTO(action, value);
        Assertions.assertEquals(actualStepObj, expectedStepDTO);
        Assertions.assertEquals(expectedStepDTO.hashCode(), actualStepObj.hashCode());
    }

    @Test
    public void testEqualsTheSameObjects() {
        Assertions.assertEquals(expectedStepDTO, expectedStepDTO);
    }

    @Test
    public void testForObjectsIfTheyAreDifferent() {
        String anotherObject = "It is a new model cosmo type xD";
        Assertions.assertNotEquals(expectedStepDTO, anotherObject);
        Integer arr = 5;
        Assertions.assertNotEquals(expectedStepDTO, arr);
    }

    @Test
    public void testIfObjectsNotEquals() {
        StepDTO actualStepObj = new StepDTO("push", "git");
        Assertions.assertNotEquals(expectedStepDTO, actualStepObj);
    }

    @Test
    public void testIfConstructorIsEmpty() {
        StepDTO nullDTO = new StepDTO();
        Assertions.assertNull(nullDTO.getAction());
        Assertions.assertNull(nullDTO.getValue());
    }

    @Test
    public void testNullInSet() {
        expectedStepDTO.setAction(null);
        expectedStepDTO.setValue(null);
        Assertions.assertNull(expectedStepDTO.getAction());
        Assertions.assertNull(expectedStepDTO.getValue());
    }

}