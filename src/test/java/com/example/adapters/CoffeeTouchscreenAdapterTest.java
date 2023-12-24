package com.example.adapters;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CoffeeTouchscreenAdapterTest {

    private OldCoffeeMachine oldCoffeeMachine;
    private CoffeeTouchscreenAdapter adapter;

    @Before
    public void setUp() {
        oldCoffeeMachine = mock(OldCoffeeMachine.class);
        adapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
    }

    @Test
    public void testChooseFirstSelection() {
        adapter.chooseFirstSelection();
        verify(oldCoffeeMachine).selectA();
    }

    @Test
    public void testChooseSecondSelection() {
        adapter.chooseSecondSelection();
        verify(oldCoffeeMachine).selectB();
    }
}