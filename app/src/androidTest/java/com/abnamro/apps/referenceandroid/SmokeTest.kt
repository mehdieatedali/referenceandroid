package com.abnamro.apps.referenceandroid

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

import android.support.test.espresso.Espresso.onView;
import android.support.test.espresso.assertion.ViewAssertions.matches;
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.*

import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule

import org.hamcrest.Matchers.allOf


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class SmokeTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun check_helloworld() {
        onView(withText("Hello World!"))
            .check(matches(withText("Hello World!")))
            .check(matches(isDisplayed()))
    }

    @Test
    fun check_replace_action() {
        onView(withId(R.id.fab))
            .perform(click())
        onView(withText("Replace with your own action"))
            .check(matches(withText("Replace with your own action")))
            .check(matches(isDisplayed()))
    }

    @Test
    fun check_refrence_android() {
        onView(withId(R.id.toolbar))
            .perform(click())
        onView(withText("ReferenceAndroid"))
            .check(matches(withText("ReferenceAndroid")))
            .check(matches(isDisplayed()))
    }

}
