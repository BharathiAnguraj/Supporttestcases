import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//WebUI.refresh()
Mobile.callTestCase(findTestCase('WEB/Re usables/Launch Web Browser'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('WEB/Re usables/Branch User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('WEB/Re usables/Navigations/Navigate to Pick list creation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Web/Picklist/Select_Van'))

WebUI.click(findTestObject('Web/Picklist/Van_Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Web/Picklist/Select_Delivery_Person'))

WebUI.click(findTestObject('Web/Picklist/Delivery_Person_Type'))

WebUI.scrollToElement(findTestObject('Web/Picklist/Pick From Invoice_Button'), 30)

WebUI.click(findTestObject('Web/Picklist/Pick From Invoice_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Picklist/DeliveryDate'))

//String s
Date date

Calendar calendar = Calendar.getInstance()

calendar.add(Calendar.DATE, 1)

date = calendar.getTime()

SimpleDateFormat f = new SimpleDateFormat('dd-MMM-yyyy')

Tomorrow = f.format(date)

System.out.println('Tomorrow : ' + Tomorrow)

WebUI.callTestCase(findTestCase('WEB/Re usables/Datepicker/Date Picker'), [('DateValue') : 'Tomorrow'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Picklist/Search_Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Web/Picklist/checkBox_1'))

WebUI.click(findTestObject('Web/Picklist/Add_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Web/Picklist/invoice_td_1'))

WebUI.click(findTestObject('Web/Picklist/Save Pick List_Button'))

WebUI.click(findTestObject('Web/Picklist/Next_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Web/Picklist/Select_Template Pattern'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.switchToFrame(findTestObject('Web/Frame/Main Frame'), 0)

List<WebElement> list = driver.findElements(By.xpath('//select[@id=\'PrintPattern\']/../div/ul/li'))

println(list)

List<WebElement> printpatterns = new ArrayList<String>()

String TemplateName

int i = 1

patterns = list.get(i)

    ((driver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', patterns)

WebUI.delay(1)

//Getting Template Name
TemplateName = list.get(i).getText()

patterns.click()

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Picklist/Template_Next'))

WebUI.delay(10)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeScreenshot()

Screen s = new Screen()

Pattern input_FileName = new Pattern('Image Objects\\File Name Enter bar.JPG')

Pattern buttonprint = new Pattern('Image Objects\\Print button in preview.PNG')

Pattern buttonRenameYes = new Pattern('Image Objects\\Yes Button Rename existing.PNG')

Pattern printicon = new Pattern('Image Objects\\picklistprinticon.png')

Pattern savebutton = new Pattern('Image Objects\\Save Button.PNG')

s.click(printicon)

WebUI.delay(2)

s.click(buttonprint)

WebUI.delay(2)

//Delete previous downloaded Pdf
for (j = 1; j < list.size(); j++) {
    def SystemDownLoadFolder = System.getProperty('user.home') + '/Downloads/'

    SystemDownLoadFolder = SystemDownLoadFolder.replace('/', '\\')

    println('SystemDownLoadFolder: ' + SystemDownLoadFolder)

    File f1 = new File((SystemDownLoadFolder + TemplateName) + '.pdf')

    f1.delete()
}

WebUI.delay(1)

s.type(input_FileName, TemplateName)

WebUI.delay(1)

s.click(savebutton)

if (s.exists(buttonRenameYes) != null) {
    s.click(buttonRenameYes)

    WebUI.delay(1)
}

WebUI.takeScreenshot()

String picklistnumber = WebUI.getText(findTestObject('Web/Picklist/PicklistNumber'))

picklistnumber = picklistnumber.replace('Picklist No : ', '')

println(picklistnumber)

WebUI.click(findTestObject('Web/Picklist Reprint/Picklist Reprint'))

WebUI.waitForElementPresent(findTestObject('Web/Picklist Reprint/Input_picklistnumber'), 0)

WebUI.setText(findTestObject('Web/Picklist Reprint/Input_picklistnumber'), picklistnumber)

WebUI.click(findTestObject('Web/Picklist Reprint/Button Search'))

WebUI.waitForElementPresent(findTestObject('Web/Picklist Reprint/Preview Button'), 0)

WebUI.click(findTestObject('Web/Picklist Reprint/Preview Button'))

WebUI.waitForElementVisible(findTestObject('Web/Picklist Reprint/Select_Template Pattern'), 0)

WebUI.click(findTestObject('Web/Picklist Reprint/Select_Template Pattern'))

WebUI.waitForElementVisible(findTestObject('Web/Picklist Reprint/PickLIST_New Template'), 0)
TemplateName="PICKLIST_NEW"

WebUI.click(findTestObject('Web/Picklist Reprint/PickLIST_New Template'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Picklist/Template_Next'))

WebUI.delay(10)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeScreenshot()

s.click(printicon)

WebUI.delay(2)

s.click(buttonprint)

WebUI.delay(2)

//Delete previous downloaded Pdf
for (j = 1; j < list.size(); j++) {
    def SystemDownLoadFolder = System.getProperty('user.home') + '/Downloads/'

    SystemDownLoadFolder = SystemDownLoadFolder.replace('/', '\\')

    println('SystemDownLoadFolder: ' + SystemDownLoadFolder)

    File f1 = new File((SystemDownLoadFolder + TemplateName) + '.pdf')

    f1.delete()
}

WebUI.delay(1)

s.type(input_FileName, TemplateName)

WebUI.delay(1)

s.click(savebutton)

if (s.exists(buttonRenameYes) != null) {
    s.click(buttonRenameYes)

    WebUI.delay(1)
}

WebUI.takeScreenshot()

