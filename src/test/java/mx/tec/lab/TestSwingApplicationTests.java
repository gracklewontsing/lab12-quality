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

	@Test
	void givenInvalidCharsWhenSumThenNoResult() {
		//Given
		application.numberOneTextField.setText("ddsadsa5fds");
		application.numberTwoTextField.setText("");
		String expectedResult = "";
		//When
		application.operationButton.doClick();
		
		//then
		String input1 = application.numberOneTextField.getText();
		String input2 = application.numberTwoTextField.getText();
		String result = application.resultTextField.getText();
		assertEquals(expectedResult, input1);
		assertEquals(expectedResult, input2);
		assertEquals(expectedResult, result);
	}
}
