package test;
import glarmester_solution.data.DataAccessorDatabase;
import glarmester_solution.logic.FrameType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class DataAccessorDatabaseTest {

    static DataAccessorDatabase dad;

    @BeforeAll
    public static void setup(){
        dad = new DataAccessorDatabase();
    }

    @Test
    public void getGlasspriceTest(){
        assertEquals(300, dad.getGlassprice());
    }

    @Test
    public void GetFramePrice(){
        HashMap<FrameType, Double> mapData = new HashMap<FrameType, Double>(){{
            put(FrameType.Simple, 100.);
            put(FrameType.Ornate, 200.);
            put(FrameType.Lavish, 350.);
        }};
        assertAll("Getting price for each frame", () -> {
            mapData.entrySet().stream().forEach((key) -> {
                assertEquals((Double) dad.getFramePrice(key.getKey()), key.getValue());
            });
        });
    }

}
