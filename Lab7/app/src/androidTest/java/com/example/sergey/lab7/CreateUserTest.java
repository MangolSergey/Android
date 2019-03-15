package com.example.sergey.lab7;

import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateUserTest {

    @Rule
    public ActivityTestRule<CreateUser> createUserActivityTestRule = new ActivityTestRule<CreateUser>(CreateUser.class);

    private CreateUser createUser = null;

    @Before
    public void setUp() throws Exception {
        createUser = createUserActivityTestRule.getActivity();
    }

    @Test
    public void testCreateButtonExist(){
        Button createButton = createUser.findViewById(R.id.createButton);
        assertNotNull(createButton);
    }

    @Test
    public void testAllFieldsAreExist(){
        TextView firstName, lastName, age;
        firstName = createUser.findViewById(R.id.firstName);
        lastName = createUser.findViewById(R.id.lastName);
        age = createUser.findViewById(R.id.age);
        assertNotNull(firstName);
        assertNotNull(lastName);
        assertNotNull(age);
    }

    @After
    public void tearDown() throws Exception {
        createUser = null;
    }
}