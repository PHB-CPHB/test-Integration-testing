package test;

import glarmester_solution.presentation.GUI;
import glarmester_solution.presentation.TUI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GUITest {

    static TUI gui;
    static List list;

    @BeforeAll
    public static void setup(){
        gui = new TUI();

    }

    @Test
    public void getFrameHeightTest(){
        gui.getFrameHeight();
    }
}
