package br.com.joel.domain.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    void testMocckingList_When_SizeIsCalled_ShouldReturn10() {
        List<?> list = mock(List.class);

        when(list.size()).thenReturn(10);

        assertEquals(10, list.size());
    }

    @Test
    void testMocckingList_When_SizeIsCalled_ShouldReturnMultipleValue() {
        List<?> list = mock(List.class);

        when(list.size()).thenReturn(10).thenReturn(20);

        assertEquals(10, list.size());
        assertEquals(20, list.size());
        assertEquals(20, list.size());
    }

    @Test
    void testMocckingList_When_SizeIsCalled_ShouldReturnJoel() {
        var list = mock(List.class);

        when(list.get(0)).thenReturn("Joel");

        assertEquals("Joel", list.get(0));
        assertNull(list.get(1));
    }

    @Test
    void testMocckingList_When_SizeIsCalledWhitArgumentMatcher_ShouldReturnJoel() {
        var list = mock(List.class);

        when(list.get(anyInt())).thenReturn("Joel");

        assertEquals("Joel", list.get(anyInt()));

    }
}