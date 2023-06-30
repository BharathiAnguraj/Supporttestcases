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

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Sales Order View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Web/Sales Order View/Click to SalesPerson Dropdown'), 0)

WebUI.click(findTestObject('Web/Sales Order View/Click to SalesPerson Dropdown'))

WebUI.setText(findTestObject('Web/Sales Order View/input_Search Retailer'), GlobalVariable.Salesperson)

WebUI.click(findTestObject('Web/Sales Order View/select_SalesPerson'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Order View/button_Search'))

WebUI.click(findTestObject('Web/Sales Order View/Click to SO Status'))

WebUI.click(findTestObject('Web/Sales Order View/select_SO Status'))

txtSoStatusName = WebUI.getText(findTestObject('Web/Sales Order View/soStatus_Value'))

println(txtSoStatusName)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Sales Order View/calender_SOFromDate'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Sales Order View/button_Search'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_RetailerName'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_RetailerName'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_SO Number'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_SO Number'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_So Date'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_So Date'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_SO Value'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_SO Value'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/Grid_Type'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/Grid_Type'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_SO Status'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_SO Status'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_Action_EyeIcon'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_Action_EyeIcon'), 0)

WebUI.verifyElementVisible(findTestObject('Web/Sales Order View/Grid/grid_Action_Remove_icon'))

WebUI.verifyElementPresent(findTestObject('Web/Sales Order View/Grid/grid_Action_Remove_icon'), 0)

txtRetailerName = WebUI.getText(findTestObject('Web/Sales Order View/Grid/grid_RetailerName'))

println(txtRetailerName)

txtSoNumber = WebUI.getText(findTestObject('Web/Sales Order View/Grid/grid_SO Number'))

println(txtSoNumber)

txtSoDate = WebUI.getText(findTestObject('Web/Sales Order View/Grid/grid_So Date'))

println(txtSoDate)

txtSoValue = WebUI.getText(findTestObject('Web/Sales Order View/Grid/grid_SO Value'))

println(txtSoValue)

txtType = WebUI.getText(findTestObject('Web/Sales Order View/Grid/Grid_Type'))

println(txtType)

txtSoStatus = WebUI.getText(findTestObject('Web/Sales Order View/Grid/grid_SO Status'))

println(txtSoStatus)

WebUI.verifyMatch(txtSoStatusName, txtSoStatus, false)

