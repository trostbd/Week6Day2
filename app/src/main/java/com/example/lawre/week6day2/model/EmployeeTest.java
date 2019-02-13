package com.example.lawre.week6day2.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest
{
    Employee employee;

    @Mock
    Name mockName;

    @Mock
    Address mockAddress;

    @Mock
    Timesheet mockTimesheet;

    @Before
    public void setup()
    {
        Mockito.when(mockName.getFirst()).thenReturn("Steve");
        Mockito.when(mockName.getLast()).thenReturn("Garrison");
        Mockito.when(mockAddress.getCity()).thenReturn("Richmond");
        Mockito.when(mockAddress.getState()).thenReturn("VA");
        employee = new Employee(mockName,mockAddress,mockTimesheet);
    }

    @Test
    public void testEmployeeInfo()
    {
        assertEquals("Steve",employee.getName().getFirst());
        assertNotEquals("Greg",employee.getName().getFirst());
        Mockito.verify(mockName,Mockito.times(2)).getFirst();
    }
}
