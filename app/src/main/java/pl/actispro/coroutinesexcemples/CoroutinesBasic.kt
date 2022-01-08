package pl.actispro.coroutinesexcemples

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutinesBasic {

    fun firstCoroutine() = runBlocking {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }

    fun useSuspendFunction() = runBlocking {
        launch { firstSuspendFunction() }
        println("Hello")
    }

    private suspend fun firstSuspendFunction() {
        delay(1000L)
        println("World!")
    }

    fun useScopeBuilder() = runBlocking {
        firstScopeBuilder()
    }

    private suspend fun firstScopeBuilder() = coroutineScope {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }
}