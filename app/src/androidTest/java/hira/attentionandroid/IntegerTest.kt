package hira.attentionandroid

import android.support.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat

/**
 * [Testing Fundamentals](http://d.android.com/tools/testing/testing_android.html)
 */
@RunWith(AndroidJUnit4::class) class IntegerTest {
    var sut: Int? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        sut = 1
    }

    @Test
    @Throws(Exception::class)
    fun equalTo1() {
        assertThat<Int>(sut, `is`(1))
    }

}
