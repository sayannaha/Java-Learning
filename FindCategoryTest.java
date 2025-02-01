package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.FindCategory;
class FindCategoryTest {
	FindCategory category = new FindCategory();
	@Test
	void test() {
		String test = "I want a Toy"; //Feel free to change your TestCase :-)
		assertEquals("TOY", category.getCategory(test));
		assertEquals(16000, category.getPrice(test));
		assertEquals(16000, category.maxRPrice(test));
		assertEquals(LocalDate.now(), category.deliveryDate(test, 10));
	}
}