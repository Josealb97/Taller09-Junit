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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("Mulan", Movie.CHILDRENS),3);
        Customer instance = new Customer("Mulan") ;
        instance.addMovieRental(arg);
        assertEquals(arg.getMovie()._title, instance.getName());
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new WiiGame("Julio"),2,true);
        Customer instance = new Customer("Julio");
        instance.addVideoGameRental(arg);
        WiiGame juego = (WiiGame)arg.getVideoGame();
        assertEquals(juego.get_gameName(), instance.getName());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Jose");
        String expResult = instance.statement();
        String result = instance.statement();
        assertEquals(expResult, result);

    }
    
}
