import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
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

WebUI.callTestCase(findTestCase('WEB/Re usables/Delete Existing Invoices - WR'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Sales Return Without Reference'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Web/SRN - Wo Reference/click_SalesPerson'))

WebUI.setText(findTestObject('Web/SRN - Wo Reference/input_SalesPerson_Search'), GlobalVariable.Salesperson)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Web/SRN - Wo Reference/select_SalesPerson'))

WebUI.click(findTestObject('Web/SRN - Wo Reference/click_Filter'))

WebUI.delay(2)

WebUI.setText(findTestObject('Web/SRN - Wo Reference/input_Filter_Retailer'), GlobalVariable.MobileRetailer)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Web/SRN - Wo Reference/button_Apply'))

WebUI.delay(2)

WebUI.takeScreenshot()

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Web/SRN - Wo Reference/button Continue'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Web/SRN - Wo Reference/Button Cancel'))

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Existing Pending Invoice/Popup/button_Ok'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Web/SRN - Wo Reference/button_Return Create'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('Sales Return Create')

WebUI.comment('add if else')

WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/input_SalesPerson_Search'))

WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/input_SalesPerson_Search'), GlobalVariable.Salesperson)

WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/select_SalesPerson'))

WebUI.delay(10)

if (WebUI.verifyElementVisible(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Existing Pending Invoice/Popup/header_Confirm'), 
    FailureHandling.OPTIONAL)) {
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Existing Pending Invoice/Popup/button_Ok'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/button_WO_Invoice'))

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/input_first_Piece'), 
        '1')

    if (WebUI.verifyElementVisible(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/input_Second_Case'), 
        FailureHandling.OPTIONAL)) {
        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/input_Second_Piece'), 
            '1')
    }
    
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/button_Next'))

    WebUI.takeScreenshot()

    WebUI.delay(10)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/button_Next'))

    WebUI.takeScreenshot()

    WebUI.verifyElementVisible(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/First_Piece'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/First_Piece'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)

    WebUI.takeScreenshot()

    txtAcceptedQtyValue = WebUI.getAttribute(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_Accepted Qty Piece'), 
        'value')

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_AcceptedPiece'), 
        txtAcceptedQtyValue)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/button_Save'))

    if (WebUI.verifyElementVisible(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/Second_Case'), 
        FailureHandling.STOP_ON_FAILURE)) {
        WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/Second_Case'), FailureHandling.OPTIONAL)

        WebUI.delay(10)

        WebUI.takeScreenshot()

        txtAcceptedQtyValue = WebUI.getAttribute(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_Accepted Qty Piece'), 
            'value')

        WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_AcceptedPiece'), 
            txtAcceptedQtyValue)

        WebUI.takeScreenshot()

        WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/button_Save'))
    }
    
    WebUI.delay(10)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/button_Generate SalesReturn'))

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Existing Pending Invoice/Popup/button_Ok'))

    WebUI.takeScreenshot()
} else {
    WebUI.takeScreenshot()

    WebUI.delay(5)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/input_Retailer_Search'))

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/input_Retailer_Search'), GlobalVariable.MobileRetailer)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/select_Retailer'))

    WebUI.takeScreenshot()

    WebUI.delay(5)

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/input_SKUName'), GlobalVariable.SKUName)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/select_SKU'))

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/button_AddProduct'))

    WebUI.takeScreenshot()

    WebUI.delay(5)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/button_WO_Invoice'))

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/input_first_Piece'), 
        '1')

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/button_Next'))

    WebUI.takeScreenshot()

    WebUI.delay(10)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Without Invoice/button_Next'))

    WebUI.takeScreenshot()

    WebUI.verifyElementVisible(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/First_Piece'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/First_Piece'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)

    WebUI.takeScreenshot()

    txtAcceptedQtyValue = WebUI.getAttribute(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_Accepted Qty Piece'), 
        'value')

    WebUI.setText(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/input_AcceptedPiece'), 
        txtAcceptedQtyValue)

    WebUI.takeScreenshot()

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/SalesReturn Reasons Popup/button_Save'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Sales Return Settlement/button_Generate SalesReturn'))

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Web/SRN - Wo Reference/Sales Return Create/Existing Pending Invoice/Popup/button_Ok'))

    WebUI.takeScreenshot()
}

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.click(findTestObject('Web/Sales Return with reference/Print template dropdown'))

WebUI.click(findTestObject('Web/Sales Return with reference/A4 Sales Return Template'))

WebUI.delay(5)

WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print_image'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print button in preview'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)
Screen s = new Screen()

Pattern input_FileName = new Pattern('Image Objects\\File Name Enter bar.JPG')

Pattern savebutton = new Pattern('Image Objects\\Save Button.PNG')

WebUI.delay(1)

s.type(input_FileName, 'A4 SALES RETURN WR')

WebUI.delay(1)

s.click(savebutton)

WebUI.click(findTestObject('Web/Sales Return with reference/Print template dropdown'))

WebUI.click(findTestObject('Web/Sales Return with reference/A4 SALES RETURN Kerala Template'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print_image'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.clickImage(findTestObject('Web/Sales Return with reference/Print button in preview'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

s.type(input_FileName, 'A4 SALES RETURN Kerala WR')

WebUI.delay(1)

s.click(savebutton)
