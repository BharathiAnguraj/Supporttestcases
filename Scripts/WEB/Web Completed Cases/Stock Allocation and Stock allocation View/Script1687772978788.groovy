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

WebUI.refresh()

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Stock Allocation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Web/Stock Allocation/Seller Based Radio button'), 0)

WebUI.click(findTestObject('Web/Stock Allocation/Exp.Del.Date'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Stock Allocation/Seller Based Radio button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Stock Allocation/Sales Person List'))

WebUI.click(findTestObject('Web/Stock Allocation/Seller'))

WebUI.click(findTestObject('Web/Stock Allocation/Retailer list'))

WebUI.click(findTestObject('Web/Stock Allocation/Retailer'))

WebUI.click(findTestObject('Web/Stock Allocation/Search Button'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Web/Stock Allocation/Order Checkbox'), 0)

WebUI.click(findTestObject('Web/Stock Allocation/Order Checkbox'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Stock Allocation/Allocate Button'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Stock Allocation/Confirm allocate Ok Buton'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Web/Stock Allocation/Continue button'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Web/Stock Allocation/Continue button'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Web/Stock Allocation/Exp.Del.Date'), 0)

WebUI.click(findTestObject('Web/Stock Allocation/Exp.Del.Date'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Stock Allocation/Search Button'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Web/Stock allocation view/Select all check box'), 0)

WebUI.click(findTestObject('Web/Stock allocation view/Select all check box'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Stock allocation view/Remove Issues Button'))

WebUI.takeScreenshot()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Stock allocation view/Select all check box'))

WebUI.click(findTestObject('Web/Stock allocation view/Generate Invoice Button'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Web/Stock allocation view/Confirm Generate invoice ok button'), 0)

WebUI.click(findTestObject('Web/Stock allocation view/Confirm Generate invoice ok button'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Web/Stock Allocation/Continue button'), 0)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Web/Stock Allocation/Continue button'), FailureHandling.STOP_ON_FAILURE)

