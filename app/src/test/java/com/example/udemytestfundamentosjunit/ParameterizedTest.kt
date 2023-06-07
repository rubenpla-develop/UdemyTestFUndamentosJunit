package com.example.udemytestfundamentosjunit

import org.junit.AfterClass
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue : Boolean, var currentUser: User) {

    //region RULE
    @get:Rule
    val locationESRule : LocationESRule = LocationESRule()
    //endregion RULE

    companion object {
        //region NO RULE
/*        var assertions : Assertions? = null

        @BeforeClass @JvmStatic
        fun setUpCommon(){
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            assertions = null
        }*/
        //endregion NO RULE

        //region US USERS ARRAY
/*        @Parameterized.Parameters @JvmStatic
        fun getUserUS() = arrayOf(arrayOf(false, User("Juanito", 12)),
                                  arrayOf(true, User("Laura", 34)),
                                  arrayOf(true, User("Bot21", 4, false)),
                                  arrayOf(false, User("Edgar", 18)))*/
        //endregion US USERS ARRAY

        //region ES USERS ARRAY
        @Parameterized.Parameters @JvmStatic
        fun getUserES() = arrayOf(arrayOf(true, User("Juanito", 19)),
            arrayOf(false, User("Laura", 14)),
            arrayOf(true, User("Bot21", 4, false)),
            arrayOf(true, User("Edgar", 18)))
        //endregion ES USERS ARRAY
    }

    //region TESTS
    @Test
    fun isAdultTest() {
        //Assert.assertTrue(locationESRule.assertions?.isAdult(currentUser) == true)
        // assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
        assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }

    //endregion TESTS
}