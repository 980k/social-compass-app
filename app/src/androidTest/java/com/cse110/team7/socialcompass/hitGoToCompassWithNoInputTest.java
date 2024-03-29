//package com.cse110.team7.socialcompass;
//
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withParent;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static org.hamcrest.Matchers.allOf;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.ViewParent;
//
//import androidx.room.Room;
//import androidx.test.core.app.ApplicationProvider;
//import androidx.test.espresso.ViewInteraction;
//import androidx.test.ext.junit.rules.ActivityScenarioRule;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
//import androidx.test.filters.LargeTest;
//
//import com.cse110.team7.socialcompass.backend.HouseDao;
//import com.cse110.team7.socialcompass.backend.HouseDatabase;
//
//import org.hamcrest.Description;
//import org.hamcrest.Matcher;
//import org.hamcrest.TypeSafeMatcher;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
///**
// * This Espresso Test checks to make sure that after the Go To Compass button is hit, if there
// * has been no input, the elements on the screen do not change, and thus the view does not change.
// */
//@LargeTest
//@RunWith(AndroidJUnit4.class)
//public class hitGoToCompassWithNoInputTest {
//
//    private HouseDao houseDao;
//    private HouseDatabase houseDatabase;
//
//    @Before
//    public void createDatabase() {
//        Context context = ApplicationProvider.getApplicationContext();
//
//        houseDatabase = Room.inMemoryDatabaseBuilder(context, HouseDatabase.class)
//                .allowMainThreadQueries()
//                .build();
//
//        houseDao = houseDatabase.getHouseDao();
//    }
//
//    @Rule
//    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(MainActivity.class);
//
//    @Test
//    public void hitGoToCompassWithNoInput() throws InterruptedException {
//        ViewInteraction materialButton = onView(
//                allOf(withId(R.id.goToCompass), withText("Go To Compass"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                0),
//                        isDisplayed()));
//        materialButton.perform(click());
//
//
//        ViewInteraction button = onView(
//                allOf(withId(R.id.goToCompass), withText("GO TO COMPASS"),
//                        withParent(withParent(withId(android.R.id.content))),
//                        isDisplayed()));
//        button.check(matches(isDisplayed()));
//    }
//
//    private static Matcher<View> childAtPosition(
//            final Matcher<View> parentMatcher, final int position) {
//
//        return new TypeSafeMatcher<View>() {
//            @Override
//            public void describeTo(Description description) {
//                description.appendText("Child at position " + position + " in parent ");
//                parentMatcher.describeTo(description);
//            }
//
//            @Override
//            public boolean matchesSafely(View view) {
//                ViewParent parent = view.getParent();
//                return parent instanceof ViewGroup && parentMatcher.matches(parent)
//                        && view.equals(((ViewGroup) parent).getChildAt(position));
//            }
//        };
//    }
//}
