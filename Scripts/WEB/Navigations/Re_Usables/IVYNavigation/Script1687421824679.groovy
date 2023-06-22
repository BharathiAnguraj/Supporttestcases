import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.poi.sl.draw.geom.MoveToCommand as MoveToCommand
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String sNavigation = Navigation //'Masters;Receivables;TeleCaller'

String[] Nav = sNavigation.split(';')

println(Nav.size())

for (def index : (0..Nav.size() - 1)) {
	WebUI.delay(1)

	GlobalVariable.Attributetext = (Nav[index])

	GlobalVariable.Attributetitle = (Nav[index])

	println(GlobalVariable.Attributetext)

	println(GlobalVariable.Attributetitle)

	previousIndex = (index - 1)

	println(Nav[index])

	println(Nav[previousIndex])

	if ((Nav[index]) == (Nav[previousIndex])) {
		println(Nav[index])

		println(Nav[(index - 1)])

		List<WebElement> NavLinks = WebUiCommonHelper.findWebElements(findTestObject('Web/Navigation/a_NavigationLink'), 5)

		// def NavaigationLink = NavLinks[1]
		println(NavLinks.size())

		if (NavLinks.size() > 0) {
			GlobalVariable.Attributetext = (Nav[index])

			GlobalVariable.Attributetitle = (Nav[index])

			WebUI.scrollToElement(findTestObject('Web/Navigation/a_NavigationLink_1'), 30)

			WebUI.click(findTestObject('Web/Navigation/a_NavigationLink_1'))
		}
	}
	
	//	if ((Nav[index]) == 'Data Extracts') {
	//
	//		if(WebUI.verifyElementVisible(findTestObject('Navigation/a_Data Extracts_1'), FailureHandling.OPTIONAL))
	//	   {
	//			WebUI.scrollToElement(findTestObject('Navigation/a_Data Extracts_1'), 30)
	//
	//			WebUI.click(findTestObject('Navigation/a_Data Extracts_1'))
	//
	//			nextindex=(index + 1)
	//			GlobalVariable.Attributetext = (Nav[nextindex])
	//
	//			GlobalVariable.Attributetitle = (Nav[nextindex])
	//
	//			WebUI.scrollToElement(findTestObject('Navigation/a_NavigationLink_1'), 3, FailureHandling.STOP_ON_FAILURE)
	//			if(WebUI.verifyElementNotVisible(findTestObject('Navigation/a_NavigationLink_1'), FailureHandling.OPTIONAL))
	//			{
	//				WebUI.scrollToElement(findTestObject('Navigation/a_Data Extracts'), 30)
	//
	//				WebUI.click(findTestObject('Navigation/a_Data Extracts'))
	//			}
	//
	//
	//		}
	//
	//	}
	//	else
	if ((Nav[index]) != (Nav[previousIndex])) {
		WebUI.scrollToElement(findTestObject('Web/Navigation/a_NavigationLink'), 5, FailureHandling.OPTIONAL)

		if (WebUI.verifyElementVisible(findTestObject('Web/Navigation/a_NavigationLink'), FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject('Web/Navigation/a_NavigationLink'), 30)

			WebUI.click(findTestObject('Web/Navigation/a_NavigationLink'))
		} else if (WebUI.verifyElementVisible(findTestObject('Web/Navigation/a_NavigationLink_1'), FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject('Web/Navigation/a_NavigationLink_1'), 30)

			WebUI.click(findTestObject('Web/Navigation/a_NavigationLink_1'))
		} else if (WebUI.verifyElementVisible(findTestObject('Web/Navigation/a_NavigationLink'))) {
		}
	}
}

