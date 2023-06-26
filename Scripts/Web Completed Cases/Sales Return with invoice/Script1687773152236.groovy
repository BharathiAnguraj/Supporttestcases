import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen

Mobile.callTestCase(findTestCase('WEB/Re usables/Launch Web Browser'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Branch User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Sales Return with Reference'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Web/Sales Return with reference/Sales Person Textbox'), 0)

WebUI.setText(findTestObject('Web/Sales Return with reference/Sales Person Textbox'), GlobalVariable.Salesperson)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Return with reference/Sales Person Textbox'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Web/Sales Return with reference/Retailer Textbox'), GlobalVariable.MobileRetailer)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Return with reference/Retailer Textbox'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Web/Sales Return with reference/Button Load Invoice'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Web/Sales Return with reference/Invoice Filter From Date'), 0)

WebUI.click(findTestObject('Web/Sales Return with reference/Invoice Filter From Date'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Sales Return with reference/invoice Search button'))

WebUI.click(findTestObject('Web/Sales Return with reference/invoice select Button'))

WebUI.waitForPageLoad(0)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Web/Sales Return with reference/Reason Dropdown'), 0)

WebUI.click(findTestObject('Web/Sales Return with reference/Reason Dropdown'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Return with reference/Reason Van Damage'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Return with reference/Return Invoice Button'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Web/Sales Return with reference/Return Confirmation OK Button'), 0)

WebUI.click(findTestObject('Web/Sales Return with reference/Return Confirmation OK Button'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Return with reference/Print template dropdown'))

WebUI.click(findTestObject('Web/Sales Return with reference/A4 Sales Return Template'))

WebUI.delay(5)

//WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print_image'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.takeScreenshot()
//
//WebUI.click(findTestObject('Web/Sales Return with reference/Print template dropdown'))
//
//WebUI.click(findTestObject('Web/Sales Return with reference/A4 SALES RETURN Kerala Template'))
//
//WebUI.delay(5)
//
//WebUI.takeScreenshot()
//WebUI.click(findTestObject('Web/Sales Return with reference/Print Button'))
WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print_image'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print button in preview'), FailureHandling.STOP_ON_FAILURE)

//Screen s = new Screen()
//
//Pattern fn = new Pattern('Image\\File_Name.png')
//
//Pattern savebutton = new Pattern('Image\\Save Button.png')
//
//s.type(fn, 'Return')
//
//s.click(savebutton)
//
//WebUI.refresh()

