package hira.attentionandroid;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class IntegerTest {
    Integer sut;

    @Before
    public void setUp() throws Exception {
        sut = new Integer(1);
    }

    @Test
    public void equalTo1() throws Exception {
        assertThat(sut, is(1));
    }

}
