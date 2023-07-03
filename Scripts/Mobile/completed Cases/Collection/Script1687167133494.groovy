import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebDriver as WebDriver
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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.MobileElement as MobileElement

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Mobile/Store Acrivities/Activities/Collection'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/header_BILL PAYMENT'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/header_ADVANCE PAYMENT'), 0)

txtPendingBillcount = Mobile.getText(findTestObject('Mobile/Store Acrivities/Collection/pendingBills_Count'), 0)

println(txtPendingBillcount)

Mobile.comment('if: ADVANCE PAYMENT')

if (Mobile.verifyMatch('0', txtPendingBillcount, false, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/header_ADVANCE PAYMENT'), 0)

    Mobile.comment('ADVANCE PAYMENT')

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cash'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cheque'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Demand Draft'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Digital Payment'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_RTGS'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_TDS Charge'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
        0)

    Mobile.comment('Cash')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cash'), 0)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/title_Cash'), 0)

    Mobile.setText(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/text_Amount'), '10', 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/CANCEL Button'), 0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.takeScreenshot()

    Mobile.comment('Cheque')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cheque'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/title_Cheque'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Bank'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Branch'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Reference Number'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Amount'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/MICR'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/CANCEL Button'), 0)

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('DD')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Demand Draft'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('Digital Payment')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Digital Payment'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('RTGS')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_RTGS'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('TDS')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_TDS Charge'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('UPI')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    if (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Mobile/Store Acrivities/Collection/Bill Payment/Cash/title_UPI'), 
        0, FailureHandling.OPTIONAL)) {
        println('QR Code data not available')

        Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
            0)

        AppiumDriver<?> driver = MobileDriverFactory.getDriver()

        def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'QR Code data not available\']')

        println(toast.getText())

        if (toast == null) {
            KeywordUtil.markFailed('ERROR: Toast object not found!')
        }
    } else {
        Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

        Mobile.takeScreenshot()
    }
    
    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/SAVE button'), 0)

    Mobile.takeScreenshot()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/SAVE button'), 0)

    Mobile.takeScreenshot()

    Mobile.takeScreenshot()
} else {
    Mobile.comment('Bill Payment')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/invoice_ number'), 0)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/pay Button'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/next Button'), 0)

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/pay Button'), 0)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/title_Bill Payment'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cash'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cheque'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Demand Draft'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Digital Payment'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_RTGS'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_TDS Charge'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
        0)

    Mobile.comment('Cash')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cash'), 0)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/title_Cash'), 0)

    Mobile.setText(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/text_Amount'), '10', 0)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/CANCEL Button'), 0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.takeScreenshot()

    Mobile.comment('Cheque')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Cheque'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/title_Cheque'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Bank'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Branch'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Reference Number'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/Amount'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cheque/MICR'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/APPLY Button'), 0)

    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/CANCEL Button'), 0)

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('DD')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Demand Draft'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('Digital Payment')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Digital Payment'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('RTGS')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_RTGS'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('TDS')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_TDS Charge'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

    Mobile.comment('UPI')

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    if (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Mobile/Store Acrivities/Collection/Bill Payment/Cash/title_UPI'), 
        0, FailureHandling.OPTIONAL)) {
        println('QR Code data not available')

        Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/PaymentMode_Unified Payment Interface'), 
            0)

        AppiumDriver<?> driver = MobileDriverFactory.getDriver()

        def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'QR Code data not available\']')

        println(toast.getText())

        if (toast == null) {
            KeywordUtil.markFailed('ERROR: Toast object not found!')
        }
    } else {
        Mobile.takeScreenshot()

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/SAVE button'), 0)

    Mobile.takeScreenshot()

    Mobile.takeScreenshot()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/SAVE button'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot()

    Mobile.takeScreenshot()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Mobile/Store Acrivities/Collection/next Button'), 0)

    Mobile.takeScreenshot()
}

Mobile.waitForElementPresent(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

Mobile.tap(findTestObject('Mobile/Store Acrivities/Collection/Bill Payment/Cash/back_Icon'), 0)

