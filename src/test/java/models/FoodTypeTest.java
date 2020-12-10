

package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTypeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        FoodType testFoodType = setupFoodtype();
        assertEquals("dessert", testFoodType.getName());
    }

    @Test
    public void setName() {
        FoodType testFoodtype = setupFoodtype();
        testFoodtype.setName("breakfast");
        assertNotEquals("dessert", testFoodtype.getName());
    }

    @Test
    public void setId() {
        FoodType testFoodtype = setupFoodtype();
        testFoodtype.setId(5);
        assertEquals(5, testFoodtype.getId());
    }

    // helper
    public FoodType setupFoodtype(){
        return new FoodType("dessert");
    }
}