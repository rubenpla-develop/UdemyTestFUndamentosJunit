package com.example.udemytestfundamentosjunit

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUsersTest {

    private lateinit var assertions : Assertions
    private lateinit var bot : User
    private lateinit var human : User

    @Before
    fun setup() {
        assertions = Assertions()
        bot = User("Robot", 1, false)
        human = User("Ruben", 25, true)
        println("BEFORE")
    }

    @After
    fun tearDown() {
        assertions = Assertions()
        bot = User()
        human = User()
        println("AFTER")
    }

    @Test
    fun checkHumanTest() {
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(human))
        println("test: checkHumanTest()")
    }

    @Test
    fun checkNotNullUserTest() {
        assertNotNull(assertions.checkHuman(human))
        println("test: checkNotNullUserTest()")
    }
}