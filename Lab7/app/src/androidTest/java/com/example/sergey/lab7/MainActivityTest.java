package com.example.sergey.lab7;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityTestRule.getActivity();
    }

    @Test
    public void testAllButtonHasValidNames(){
        Button find = mainActivity.findViewById(R.id.findUsers);
        Button add = mainActivity.findViewById(R.id.addUser);
        Button delete = mainActivity.findViewById(R.id.deleteUsers);
        Button reload = mainActivity.findViewById(R.id.reload);
        assertEquals("find", find.getText().toString());
        assertEquals("add user", add.getText().toString());
        assertEquals("delete all", delete.getText().toString());
        assertEquals("reload", reload.getText().toString());
    }

    @Test
    public void testListViewExists(){
        ListView usersList = mainActivity.findViewById(R.id.usersList);
        assertNotNull(usersList);
    }

//    @Test
//    public void testSearchField(){
//        EditText searchField = mainActivity.findViewById(R.id.firstName);
//        Button findButton = mainActivity.findViewById(R.id.findUsers);
//        searchField.setText("Pavel");
//        findButton.callOnClick();
//        String[] users = mainActivity.users;
//        assertEquals("Pavel", users[0].substring(0,5));
//    }



    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}