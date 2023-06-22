import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Sales Order Upload'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Web/Sales Order Upload/Click to upload new File'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Web/Sales Order Upload/Click to upload new File'))

    WebUI.acceptAlert()

    WebUI.switchToDefaultContent()
}

WebUI.delay(10)

String dirName = RunConfiguration.getProjectDir()

dirName = dirName.replace('/', '\\\\')

WebUI.uploadFile(findTestObject('Web/Sales Order Upload/Upload File'), dirName + '\\File Upload\\Sales_Order_Records.xls')

WebUI.click(findTestObject('Web/Sales Order Upload/Continue Button'))

