import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

/*Get full directory's path of android application*/
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.AndroidApplication, RunConfiguration.getProjectDir())

/*Start the AUT*/
Mobile.startApplication(appPath, false)


if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Allow IvyCpg to make and manage phone calls'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile/Activation Key/Button Allow'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Allow IvyCpg to access photos, media and files on your device'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile/Activation Key/Button Allow'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Activation Key'), 50, FailureHandling.OPTIONAL)) {
    Mobile.sendKeys(findTestObject('Mobile/Activation Key/Activation Key'), GlobalVariable.ActivationKey)

    Mobile.tap(findTestObject('Mobile/Activation Key/Activate button'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Activation Key/Successfully activated'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Mobile/Activation Key/Button - OK'), 0)
}


if (Mobile.verifyElementExist(findTestObject('Mobile/Login/Username'), 5, FailureHandling.OPTIONAL)) {
    Mobile.sendKeys(findTestObject('Mobile/Login/Username'),GlobalVariable.dseUser)

    Mobile.sendKeys(findTestObject('Mobile/Login/Password'), GlobalVariable.dsePassword)
	Mobile.tap(findTestObject('Object Repository/Mobile/Login/Login'), 0)
}
else {
	Mobile.waitForElementPresent(findTestObject('Object Repository/Mobile/Login/Username_noneditable'), 0)
	
	userName = Mobile.getText(findTestObject('Object Repository/Mobile/Login/Username_noneditable'), 0)

	println(userName)

	if (!(userName.equals(GlobalVariable.dseUser))) 
		{
			Mobile.startApplication(appPath, true)
			
			if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Allow IvyCpg to make and manage phone calls'), 5, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Mobile/Activation Key/Button Allow'), 0)
			}
			
			if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Allow IvyCpg to access photos, media and files on your device'),
				5, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Mobile/Activation Key/Button Allow'), 0)
			}
			
			if (Mobile.verifyElementExist(findTestObject('Mobile/Activation Key/Activation Key'), 5, FailureHandling.OPTIONAL)) {
				Mobile.sendKeys(findTestObject('Mobile/Activation Key/Activation Key'), GlobalVariable.ActivationKey)
			
				Mobile.tap(findTestObject('Mobile/Activation Key/Activate button'), 0)
			}
			
			if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Activation Key/Successfully activated'), 5, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Object Repository/Mobile/Activation Key/Button - OK'), 0)
			}
			
			
			if (Mobile.verifyElementExist(findTestObject('Mobile/Login/Username'), 5, FailureHandling.OPTIONAL)) {
				Mobile.sendKeys(findTestObject('Mobile/Login/Username'),GlobalVariable.dseUser)
			
				Mobile.sendKeys(findTestObject('Mobile/Login/Password'), GlobalVariable.dsePassword)
				Mobile.tap(findTestObject('Object Repository/Mobile/Login/Login'), 0)
			}
		}
		else 
		{
			Mobile.sendKeys(findTestObject('Mobile/Login/Password'), GlobalVariable.dsePassword)
			Mobile.tap(findTestObject('Object Repository/Mobile/Login/Login'), 0)
		}
}

if (Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Login/Do you want to continue in this device'), 100, FailureHandling.OPTIONAL))
{
	Mobile.tap(findTestObject('Object Repository/Mobile/Login/Button - YES'), 0)
}

Mobile.waitForElementPresent(findTestObject('Object Repository/Mobile/Attendance/Header Attendance'), 50)
	
