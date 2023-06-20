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

Mobile.tap(findTestObject('Mobile/Dashboard/Dashboard type'), 0)

Mobile.tap(findTestObject('Mobile/Dashboard/MONTH'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Productivity/Productivity'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Productivity/Productivity Achieved'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Productivity/Productivity Balance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Productivity/Productivity Target'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Productivity/Productivity percentage'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/P3M Retail DGP/P3M Retail DGP'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/P3M Retail DGP/P3M Retail DGP Achieved'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/P3M Retail DGP/P3M Retail DGP Balance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/P3M Retail DGP/P3M Retail DGP Target'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/P3M Retail DGP/P3M Retail DGP percentage'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Base FB/Base FB'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Base FB/Base FB Achieved'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Base FB/Base FB Balance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Base FB/Base FB Target'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/Base FB/Base FB percentage'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/GPS Compliance/GPS Compliance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/GPS Compliance/GPS Compliance Achieved'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/GPS Compliance/GPS Compliance Balance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/GPS Compliance/GPS Compliance Target'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/GPS Compliance/GPS Compliance percentage'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/WS PoTPR/WS PoTPR'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/WS PoTPR/WS PoTPR Achieved'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/WS PoTPR/WS PoTPR Balance'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/WS PoTPR/WS PoTPR Target'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Dashboard/Month board/WS PoTPR/WS PoTPR percentage'), 0)

