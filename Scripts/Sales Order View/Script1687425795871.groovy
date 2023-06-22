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

Mobile.callTestCase(findTestCase('WEB/Re usables/Launch Web Browser'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Branch User Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Sales Order View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Web/Sales Order View/Click to SalesPerson Dropdown'), 0)

WebUI.click(findTestObject('Web/Sales Order View/Click to SalesPerson Dropdown'))

WebUI.setText(findTestObject('Web/Sales Order View/input_Search Retailer'), GlobalVariable.Salesperson)

WebUI.click(findTestObject('Web/Sales Order View/select_SalesPerson'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Sales Order View/button_Search'))

WebUI.click(findTestObject('Web/Sales Order View/Click to SO Status'))

WebUI.click(findTestObject('Web/Sales Order View/select_SO Status'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Order View/calender_SOFromDate'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker'), [('DateValue') : '21-Jun-2023'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Sales Order View/button_Search'))

