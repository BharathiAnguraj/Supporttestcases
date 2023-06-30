import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.sikuli.api.robot.Key as Key
import org.sikuli.api.robot.KeyModifier as KeyModifier
import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.refresh()

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Invoice Print'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web/Invoice Print/input Print Status'), 0)

WebUI.click(findTestObject('Web/Invoice Print/input DeliveryDate'))

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker'), [('DateValue') : 'Today'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Invoice Print/input Print Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Invoice Print/dropdown Not Printed'))

WebUI.scrollToElement(findTestObject('Web/Invoice Print/button Search'), 0)

WebUI.click(findTestObject('Web/Invoice Print/button Search'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Web/Invoice Print/grid 1stInvoiceNo'), 5, FailureHandling.OPTIONAL)

//
//if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Web/Invoice Print/grid 1stInvoiceNo'), 5, FailureHandling.OPTIONAL)) {
//    WebUI.callTestCase(findTestCase('WEB/Re usables/Sales Invoice Creation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//
//    WebUI.callTestCase(findTestCase('WEB/Re usables/Sales Invoice Creation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//
//    WebUI.refresh()
//
//    WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Invoice Print'), [:], FailureHandling.STOP_ON_FAILURE)
//
//    WebUI.waitForElementVisible(findTestObject('Web/Invoice Print/input Print Status'), 0)
//
//    WebUI.click(findTestObject('Web/Invoice Print/input DeliveryDate'))
//
//    WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Re_Usables/Datepicker/Date Picker Tomorrow'), [('DateValue') : 'Tomorrow'], 
//        FailureHandling.STOP_ON_FAILURE)
//
//    WebUI.click(findTestObject('Web/Invoice Print/input Print Status'), FailureHandling.STOP_ON_FAILURE)
//
//    WebUI.click(findTestObject('Web/Invoice Print/dropdown Not Printed'))
//
//    WebUI.scrollToElement(findTestObject('Web/Invoice Print/button Search'), 0)
//
//    WebUI.click(findTestObject('Web/Invoice Print/button Search'))
//}
WebUI.scrollToElement(findTestObject('Web/Invoice Print/checkbox SelectAll'), 0)

WebUI.click(findTestObject('Web/Invoice Print/checkbox SelectAll'))

WebUI.scrollToElement(findTestObject('Web/Invoice Print/label Total Records'), 0)

InvoiceCount = WebUI.getText(findTestObject('Web/Invoice Print/label Total Records'))

InvoiceCount = InvoiceCount.substring(InvoiceCount.indexOf(':') + 2)

println(InvoiceCount)

WebUI.scrollToElement(findTestObject('Web/Invoice Print/button PrintInvoice'), 0)

WebUI.click(findTestObject('Web/Invoice Print/button PrintInvoice'))

WebUI.delay(2)

WebUI.click(findTestObject('Web/Invoice Print/drop PrintPattern'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.switchToFrame(findTestObject('Web/Frame/Main Frame'), 0)

List<WebElement> list = driver.findElements(By.xpath('//select[@id=\'ivyPrintPattern\']/../div/ul/li'))

println(list)

List<WebElement> printpatterns = new ArrayList<String>()

for (int i = 1; i < list.size(); i++) {
    if (i != 1) {
        WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Web/Invoice Print/drop PrintPattern'))

        WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

        WebUI.switchToFrame(findTestObject('Web/Frame/Main Frame'), 0)

        list = driver.findElements(By.xpath('//select[@id=\'ivyPrintPattern\']/../div/ul/li'))

        println(list)

        WebUI.takeScreenshot()
    }
    
    patterns = list.get(i)

        ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', patterns)

    WebUI.delay(1)

    patterns.click()

    WebUI.delay(10)

    WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)

    WebUI.takeScreenshot()

    Screen s = new Screen()

    Pattern input_FileName = new Pattern('Image Objects\\File Name Enter bar.JPG')

    Pattern buttonprint = new Pattern('Image Objects\\Print button in preview.PNG')

    Pattern buttonRenameYes = new Pattern('Image Objects\\Yes Button Rename existing.PNG')

    Pattern printicon = new Pattern('Image Objects\\printicon.PNG')

    Pattern savebutton = new Pattern('Image Objects\\Save Button.PNG')

    s.click(printicon)

    WebUI.delay(2)

    s.click(buttonprint)

    WebUI.delay(2)

    //Delete previous downloaded Pdf
    if (i == 1) {
        for (j = 1; j < list.size(); j++) {
            def SystemDownLoadFolder = System.getProperty('user.home') + '/Downloads/'

            SystemDownLoadFolder = SystemDownLoadFolder.replace('/', '\\')

            println('SystemDownLoadFolder: ' + SystemDownLoadFolder)

            File f1 = new File(((SystemDownLoadFolder + '\\PrintTemplate') + j) + '.pdf')

            f1.delete()
        }
    }
    
    String name = 'PrintTemplate' + i.toString()

    WebUI.delay(1)

    s.type(input_FileName, name)

    WebUI.delay(1)

    s.click(savebutton)

    //    WebUI.switchToFrame(findTestObject('Web/Frame/Printpreview Frame'), 0)
    //    item = driver.findElements(By.xpath('//pre[text()=\'Item Description\']'))
    //
    //    itemcount = item.size()
    //
    //    WebUI.verifyMatch(itemcount.toString(), InvoiceCount, false, FailureHandling.STOP_ON_FAILURE)
    if (s.exists(buttonRenameYes) != null) {
        s.click(buttonRenameYes)

        WebUI.delay(1)
    }
    
    WebUI.takeScreenshot()
}

