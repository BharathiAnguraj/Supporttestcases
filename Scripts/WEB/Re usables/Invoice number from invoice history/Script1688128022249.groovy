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

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Invoice History'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Web/Sales Invoice History/Salesperson'), 0)

WebUI.sendKeys(findTestObject('Web/Sales Invoice History/Salesperson'), GlobalVariable.Salesperson)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice History/Salesperson'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice History/Retailer'), GlobalVariable.MobileRetailer)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Web/Sales Invoice History/Retailer'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.click(findTestObject('Web/Sales Invoice History/Status'))

WebUI.click(findTestObject('Web/Sales Invoice History/Status Open'))

WebUI.click(findTestObject('Web/Sales Invoice History/Search Button'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Web/Sales Invoice History/Invoice Number'), 0)

GlobalVariable.invoiceNumber = WebUI.getAttribute(findTestObject('Web/Sales Invoice History/Invoice Number'), 'title')

