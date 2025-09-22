package org.ptmanager

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun test(): String {
        return "Hello, ${platform.name}!"
    }

}