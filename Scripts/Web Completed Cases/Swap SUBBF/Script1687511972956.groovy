import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Driver as Driver
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ById as ById
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.DriverCommand as DriverCommand

WebUI.refresh()

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Swap subbf'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web/Swap SUBBF/Delivery Date'), 0)

WebUI.click(findTestObject('Web/Swap SUBBF/Delivery Date'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Swap SUBBF/Seller'))

WebUI.setText(findTestObject('Web/Swap SUBBF/Seller search box'), GlobalVariable.dseUser)

WebUI.waitForElementVisible(findTestObject('Web/Swap SUBBF/Option Salesperson'), 0)

WebUI.click(findTestObject('Web/Swap SUBBF/Option Salesperson'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

WebUI.switchToFrame(findTestObject('Web/Frame/Main Frame'), 0)

def button = driver.findElement(By.xpath('//md-select[@id=\'Retailer\']'))

js.executeScript('arguments[0].click();', button)

WebUI.switchToDefaultContent()

WebUI.delay(3)

WebUI.setText(findTestObject('Web/Swap SUBBF/Retailer Search Box'), GlobalVariable.MobileRetailer)

WebUI.waitForElementVisible(findTestObject('Web/Swap SUBBF/Option Retailer'), 0)

WebUI.click(findTestObject('Web/Swap SUBBF/Option Retailer'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Web/Frame/Main Frame'), 0)

def warehouse = driver.findElement(By.xpath('//md-select[@id=\'WarehouseId\']'))

js.executeScript('arguments[0].click();', warehouse)

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Web/Swap SUBBF/Option Warehouse'))

WebUI.click(findTestObject('Web/Swap SUBBF/Search Button'))

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Web/Swap SUBBF/Swap Button'), 0)

WebUI.click(findTestObject('Web/Swap SUBBF/Swap Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Web/Swap SUBBF/Sku to Swap'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Swap SUBBF/Alternate SKU'))

WebUI.sendKeys(findTestObject('Web/Swap SUBBF/Swap Quantity'), '1')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Swap SUBBF/Save Button'))

WebUI.takeScreenshot()

