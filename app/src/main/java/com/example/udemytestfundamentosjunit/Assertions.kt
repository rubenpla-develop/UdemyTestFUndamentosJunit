package com.example.udemytestfundamentosjunit

class Assertions {
    private val user = User("Ruben", 41)
    private var location = "US"

    fun setLocation(newLocation : String) {
        location = newLocation
    }

    fun getLuckyNumbers() : Array<Int> {
        return arrayOf(21, 117)
    }

    fun getName() : String {
        return user.name
    }

    fun checkHuman(user: User) : Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User? = null) : Boolean? {
        if  (user == null) return null
        return user.isHuman
    }

    fun isAdult(user : User) : Boolean {
        if (!user.isHuman) return true

        return if (location == "US")
            user.age >=21
        else
            return user.age >= 18
    }
}