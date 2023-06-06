package com.example.udemytestfundamentosjunit

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest {

    private val assertions = Assertions()

    @Test
    fun getArrayTest() {
        val array = arrayOf(21, 117)
        //val array = arrayOf(21, 11)

        assertArrayEquals("Mensaje de error", array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest() {

        val name  = "Ruben"
        val otherName = "Ruperto"

        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun testHumaneTest(){
        val bot = User("Ruben", 1, false)
        val human = User("Robot", 25, true)

        assertFalse(assertions.checkHuman(bot))
       // assertTrue(assertions.checkHuman(human))
    }

    @Test
    fun checkNullUserTest() {
        val user = null

        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest() {
        val user = User()

        assertNotNull(assertions.checkHuman(user))
    }
}