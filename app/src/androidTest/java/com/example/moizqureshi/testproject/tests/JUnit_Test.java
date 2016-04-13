package com.example.moizqureshi.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.moizqureshi.testproject.MyActivity;
import android.widget.TextView;
import com.example.moizqureshi.testproject.R;

/**
 * Created by moizqureshi on 4/12/16.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;
    public JUnit_Test() {

        super(MyActivity.class);
    }

    public void test_first() {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }

}
