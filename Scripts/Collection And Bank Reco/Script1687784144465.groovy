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

GlobalVariable.MobileRetailer = 'APNA BAZAAR'

Mobile.callTestCase(findTestCase('WEB/Re usables/Launch Web Browser'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Branch User Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Collection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Navigation/icon_switch'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/click_SalesPerson'))

WebUI.setText(findTestObject('Web/Collection/input_Search'), GlobalVariable.Salesperson)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/select_SalesPerson'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Web/Collection/button_Search'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/icon_Collapse'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Web/Collection/Collection Details/input_Retailer'), GlobalVariable.MobileRetailer)

WebUI.takeScreenshot()

enteredRetailerCode = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid RetailerCode'), 'title')

println(enteredRetailerCode)

enteredRetailerName = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid RetailerName'), 'title')

println(enteredRetailerName)

enteredDueAmount = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid Due Amount'), 'title')

println(enteredDueAmount)

WebUI.verifyMatch(GlobalVariable.MobileRetailer, enteredRetailerName, false)

WebUI.click(findTestObject('Web/Collection/Collection Details/Grid/button_Create'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/checkbox_All'))

WebUI.takeScreenshot()

ReferenceNo = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Collection_Direct/Grid/ref.No'), 'title')

println(ReferenceNo)

WebUI.delay(10)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Grid/row_checkbox'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_AddPayment'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/menu_Cheque'))

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/click_Add Another'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/click_bank'))

WebUI.delay(5)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/select_Bank'))

WebUI.setText(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_RefernceNo'), 
    '923297232')

txtReferenceNo = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_RefernceNo'), 
    'value')

println(txtReferenceNo)

WebUI.setText(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_Amount'), '10')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/button_Save'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Re-Process'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Save Collection'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Ok'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to BankReco'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Navigation/icon_switch'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Web/Bank Reco/input_Outletname'), GlobalVariable.MobileRetailer)

WebUI.setText(findTestObject('Web/Bank Reco/input_ChequeNo'), txtReferenceNo)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/select_CheckBox'))

WebUI.scrollToElement(findTestObject('Web/Bank Reco/lbl_Total Record'), 0)

WebUI.delay(5)

WebUI.takeScreenshot()

txtChequeNo = WebUI.getAttribute(findTestObject('Web/Bank Reco/td_ChequeNo'), 'title')

WebUI.verifyMatch(txtReferenceNo, txtChequeNo, false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Bank Reco/click_Status'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/click_Status_Closed'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/button_Save'))

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

ReferenceNo = WebUI.getAttribute(findTestObject('Web/Bank Reco/Popup/logCard'), 'data-value')

WebUI.takeScreenshot()

Status = WebUI.getText(findTestObject('Web/Bank Reco/Popup/logCard_Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(txtChequeNo, ReferenceNo, false)

WebUI.verifyMatch('Completed', Status, false)

WebUI.comment('Closed')

WebUI.refresh()

WebUI.comment('Bounced')

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Collection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Navigation/icon_switch'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/click_SalesPerson'))

WebUI.setText(findTestObject('Web/Collection/input_Search'), GlobalVariable.Salesperson)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/select_SalesPerson'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Web/Collection/button_Search'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/icon_Collapse'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Web/Collection/Collection Details/input_Retailer'), GlobalVariable.MobileRetailer)

WebUI.takeScreenshot()

enteredRetailerCode1 = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid RetailerCode'), 'title')

println(enteredRetailerCode1)

enteredRetailerName1 = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid RetailerName'), 'title')

println(enteredRetailerName1)

enteredDueAmount1 = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Grid/grid Due Amount'), 'title')

println(enteredDueAmount1)

WebUI.verifyMatch(GlobalVariable.MobileRetailer, enteredRetailerName, false)

WebUI.click(findTestObject('Web/Collection/Collection Details/Grid/button_Create'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/checkbox_All'))

WebUI.takeScreenshot()

ReferenceNo1 = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Collection_Direct/Grid/ref.No'), 'title')

println(ReferenceNo1)

WebUI.delay(10)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Grid/row_checkbox'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_AddPayment'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/menu_Cheque'))

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/click_Add Another'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/click_bank'))

WebUI.delay(5)

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/select_Bank'))

WebUI.setText(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_RefernceNo'), 
    '7867868786')

txtReferenceNo1 = WebUI.getAttribute(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_RefernceNo'), 
    'value')

println(txtReferenceNo1)

WebUI.setText(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/input_Amount'), '10')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/Add Payment/Cheque/button_Save'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Re-Process'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Save Collection'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Collection/Collection Details/Collection_Direct/button_Ok'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.refresh()

Mobile.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to BankReco'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Navigation/icon_switch'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Web/Bank Reco/input_Outletname'), GlobalVariable.MobileRetailer)

WebUI.setText(findTestObject('Web/Bank Reco/input_ChequeNo'), txtReferenceNo1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/select_CheckBox'))

WebUI.scrollToElement(findTestObject('Web/Bank Reco/lbl_Total Record'), 0)

WebUI.delay(5)

WebUI.takeScreenshot()

txtChequeNo1 = WebUI.getAttribute(findTestObject('Web/Bank Reco/td_ChequeNo'), 'title')

WebUI.verifyMatch(txtReferenceNo1, txtChequeNo1, false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Bank Reco/td_ChequeNo'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/click_Status'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/click_Status_Bounced'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/Bank Reco/button_Save'))

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

ReferenceNo1 = WebUI.getAttribute(findTestObject('Web/Bank Reco/Popup/logCard'), 'data-value')

WebUI.takeScreenshot()

Status1 = WebUI.getText(findTestObject('Web/Bank Reco/Popup/logCard_Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(txtChequeNo1, ReferenceNo1, false)

WebUI.verifyMatch('Completed', Status1, false)

