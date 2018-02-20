package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by emarsiw on 2018-02-20.
 */
public class ShipwreckControllerTest{

    @InjectMocks
    ShipwreckController shipwreckController;
    @Mock
    ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testShipwreckGetPositive() {

        Shipwreck sw = new Shipwreck();
        sw.setId(1L);

        Mockito.when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck shipwreck = shipwreckController.get(1L);
        assertEquals(1L, shipwreck.getId().longValue());
    }

    @Test
    public void testShipwreckGetNegative() {

        Shipwreck sw = new Shipwreck();
        sw.setId(2L);

        Mockito.when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck shipwreck = shipwreckController.get(1L);
        assertNotEquals(1L, shipwreck.getId().longValue());
    }

}