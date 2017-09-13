/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugosama.introductionjukito;

import org.jukito.All;
import org.jukito.JukitoModule;
import org.jukito.JukitoRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JukitoRunner.class)
public class CalculatorTest {

    public static class Module extends JukitoModule {

        @Override
        protected void configureTest() {
            bindMany(Calculator.class,
                    SimpleCalculator.class,
                    ScientificCalculator.class);

        }
    }

    @Test
    public void givenTwoNumbers_WhenAdd_ThenSumBoth(@All Calculator calc) {
        double result = calc.add(1, 1);
        assertEquals(2, result,.1);
    }

}
