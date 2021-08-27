/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Moti
 */
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        WiiGame game = new WiiGame("MarioBros");
        VideoGameRental instance = new VideoGameRental(game,2,true);
        int expResult = 2;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        WiiGame game = new WiiGame("MarioBros");
        VideoGameRental instance = new VideoGameRental(game,0,true);
        Object expResult = game;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        WiiGame game = new WiiGame("MarioBros");
        VideoGameRental instance = new VideoGameRental(game,3,true);
        double expResult = game.getCharge(3, true);
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        WiiGame game = new WiiGame("MarioBros");
        VideoGameRental instance = new VideoGameRental(game,5,true);
        int expResult = game.getFrequentRenterPoints(5, true);
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
