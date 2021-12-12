package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 
 * Test class for function validatePhoneNumber()
 * 
 * 
 *
 */
class ValidateRushInfoTest {

	PlaceRushOrderController placeRushOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
	@CsvSource({ "20/10/2021, false", "20/12/2021, true", "12/2021, false", "11/12/2021, false" })
	void testValidateDeliveryDate(String deliveryDate, boolean expected) {
		boolean isValid = placeRushOrderController.validateDeliveryDate(deliveryDate);

		assertEquals(expected, isValid);
	}

	@ParameterizedTest
	@CsvSource({ "Hai BÃ  TrÆ°ng, false", "Ä�áº¯k Láº¯k, true", "Thá»«a ThiÃªn-Huáº¿, true", ", false" })
	void testValidateProvince(String province, boolean expected) {
		boolean isValid = placeRushOrderController.validateProvince(province);
		
		assertEquals(expected, isValid);
	}

}
