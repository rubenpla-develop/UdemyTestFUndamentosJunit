package com.example.udemytestfundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNotSame
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class AssertionsUsersTest {
    private lateinit var bot : User

    companion object {
        private lateinit var assertions : Assertions
        private lateinit var human : User

        @BeforeClass @JvmStatic
        fun setupCommon() {
            assertions = Assertions()
            human = User("Ruben", 25, true)
            println("BEFORE_CLASS")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            assertions = Assertions()
            human = User()
            println("AFTER_CLASS")
        }
    }

    @Before
    fun setup() {
        assertions = Assertions()
        bot = User("Robot", 1, false)
        println("BEFORE")
    }

    @After
    fun tearDown() {
        assertions = Assertions()
        bot = User()
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

    @Test
    fun checkNotSameUserTest(){
        assertNotSame(bot, human)
        println("test: checkNotSameUserTest()")
    }

    @Test
    fun checkSameUserTest(){
        val humanCopy = human

        assertSame(humanCopy, human)
        println("test: checkSameUserTest()")
    }
}