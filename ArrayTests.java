import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseInPlace2() {
    int[] input = { 2, 4, 5, 7, 8 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 8, 7, 5, 4, 2 }, input);
  }

  @Test 
  public void testReversedNotEmpty() {
    int[] input = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input));
  }
}
