package dojo

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Tests for class Dojo
 */
class DojoTest {

    val dojo : Dojo = Dojo()

    @Test
    fun doTask() {
        assertEquals(9, dojo.doTask(3))
    }

}