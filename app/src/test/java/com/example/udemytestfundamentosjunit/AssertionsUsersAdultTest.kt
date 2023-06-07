package com.example.udemytestfundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule

import org.junit.Test

class AssertionsUsersAdultTest {

    private lateinit var human : User
    private lateinit var bot : User

    @get:Rule
    val locationESRule : LocationESRule = LocationESRule()

    @Before
    fun setup() {
        human = User("Ruben", 18, true)
        bot = User("Robot", 1, false)
    }

    @After
    fun tearDown() {
        human = User()
        bot = User()
    }

    @Test
    fun isAdultTest() {
//        assertions.setLocation("ES")
//        assertTrue(assertions.isAdult(human))
//        assertTrue(assertions.isAdult(bot))

        assertEquals(true, locationESRule.assertions?.isAdult(human))
        //assertEquals(true, locationESRule.assertions?.isAdult(bot))
    }
}