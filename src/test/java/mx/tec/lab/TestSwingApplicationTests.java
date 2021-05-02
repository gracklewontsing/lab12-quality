package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSwingApplicationTests {
	TestSwingApplication application = new TestSwingApplication();
	
	@Test
	void givenTwoIntegersWhenSumThenCorrectResult() {
		//Given
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("7");
		String expectedResult = "12";
		//When
		application.operationButton.doClick();
		
		//then
		String result = application.resultTextField.getText();
		assertEquals(expectedResult, result);
	}

}
