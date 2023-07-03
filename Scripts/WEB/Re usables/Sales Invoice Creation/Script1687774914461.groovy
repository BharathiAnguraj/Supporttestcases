import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

not_run: Mobile.callTestCase(findTestCase('WEB/Re usables/Launch Web Browser'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.callTestCase(findTestCase('WEB/Re usables/Branch User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Sales Invoice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input SalesPerson'), GlobalVariable.Salesperson)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input SalesPerson'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Web/Sales Invoice/input ExpDelDate'), FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input RetailerName'), GlobalVariable.MobileRetailer)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input RetailerName'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(15)

WebUI.scrollToElement(findTestObject('Web/Sales Invoice/button Next'), 0)

WebUI.click(findTestObject('Web/Sales Invoice/button Next'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input Sku'), GlobalVariable.SkuName1)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input Sku'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Web/Sales Invoice/input Piece'), '1')

not_run: WebUI.click(findTestObject('Object Repository/Phase 2.3/Madhu/Sales_Invoice/div_(IvySelect)    (InitMaterialize)    fun_dde00c'))

WebUI.click(findTestObject('Web/Frame/Main Frame'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Web/Sales Invoice/button Submit'), 0)

WebUI.click(findTestObject('Web/Sales Invoice/button Submit'))

WebUI.waitForElementPresent(findTestObject('Web/Sales Invoice/button Save'), 0)

WebUI.click(findTestObject('Web/Sales Invoice/button Save'))

WebUI.delay(15)

WebUI.takeScreenshot()

