package itis.practice.testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    private static final List<String> INPUT_FILES = new ArrayList<String>() {
        {
            add("input1.json");
            add("input2.json");
            add("input3.json");
            add("input4.json");
            add("input5.json");
            add("input_empty.json");
            add("input_error.json");
        }
    };

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    //TODO : put test methods for all methods you've created;
    //TODO : use mActivityRule.getActivity().getJsonFromAssets() to retrieve json from asset files;
    //TODO : test your code on all input files in INPUT_FILES list.
}