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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Mobile/Main Navigation Button'), 0)

Mobile.tap(findTestObject('Mobile/Menu/Trade Coverage'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementHasAttribute(findTestObject('Mobile/Plan for the Day/Stores to visit count'), 'text', 0)

stores_planned_for_the_Day = Mobile.getText(findTestObject('Mobile/Plan for the Day/Stores to visit count'), 0)

KeywordUtil.logInfo(stores_planned_for_the_Day)

Mobile.tap(findTestObject('Mobile/Plan for the Day/Search Icon'), 0)

Mobile.sendKeys(findTestObject('Mobile/Plan for the Day/Search bar'), GlobalVariable.MobileRetailer)

Mobile.hideKeyboard()

if (Mobile.verifyElementExist(findTestObject('Mobile/Plan for the Day/Retailer in search list'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile/Plan for the Day/Retailer in search list'), 0)
} else {
    Mobile.tap(findTestObject('Mobile/Trade Coverage/Deviation/Deviation Button'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Mobile/Plan for the Day/Search Icon'), 0)

    Mobile.sendKeys(findTestObject('Mobile/Plan for the Day/Search bar'), GlobalVariable.MobileRetailer)

    Mobile.tap(findTestObject('Mobile/Plan for the Day/Retailer in search list'), 0)

    Mobile.callTestCase(findTestCase('Mobile/completed Cases/Retailer contact KYC'), [:], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Mobile/Trade Coverage/Deviation/Add To Plan Button'), 0)

    Mobile.tap(findTestObject('Mobile/Trade Coverage/Deviation/Reason Holiday'), 0)

    Mobile.tap(findTestObject('Mobile/Trade Coverage/Deviation/ADD Button'), 0)

    Mobile.tap(findTestObject('Mobile/Trade Coverage/Deviation/OK Button'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Mobile/Plan for the Day/Search Icon'), 0)

    Mobile.sendKeys(findTestObject('Mobile/Plan for the Day/Search bar'), GlobalVariable.MobileRetailer)

    Mobile.tap(findTestObject('Mobile/Plan for the Day/Retailer in search list'), 0)
}

Mobile.callTestCase(findTestCase('Mobile/completed Cases/Retailer contact KYC'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Mobile/Retailer Profile/Start Visit Button'), 20)

Mobile.tap(findTestObject('Mobile/Retailer Profile/Start Visit Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.callTestCase(findTestCase('Mobile/completed Cases/DSE User not in Retailer Location handler'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Mobile/completed Cases/Call Record Activity Handler'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

