import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/Branch Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Navigation/Picklist Navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Web/Picklist/Select_Van'))

WebUI.click(findTestObject('Web/Picklist/Van_Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Web/Picklist/Select_Delivery_Person'))

WebUI.click(findTestObject('Web/Picklist/Delivery_Person_Type'))

WebUI.scrollToElement(findTestObject('Web/Picklist/Pick From Invoice_Button'), 30)

WebUI.click(findTestObject('Web/Picklist/Pick From Invoice_Button'))

WebUI.delay(3)

//
//WebUI.click(findTestObject('Web/Picklist/Select_Sales Person'))
//
//WebUI.click(findTestObject('Web/Picklist/Sales Person_Type'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Web/Picklist/Select_Retailer'))
//
//WebUI.click(findTestObject('Web/Picklist/Retailer_Type'))
//
//WebUI.click(findTestObject('Web/Picklist/Search_Button'))
//
//WebUI.delay(5)
WebUI.click(findTestObject('Web/Picklist/DeliveryDate'))

String s

Date date

Calendar calendar = Calendar.getInstance()

calendar.add(Calendar.DATE, 1)

date = calendar.getTime()

SimpleDateFormat f = new SimpleDateFormat('dd-MMM-yyyy')

Tomorrow = f.format(date)

System.out.println('Tomorrow : ' + Tomorrow)

WebUI.callTestCase(findTestCase('Date Picker/Today date'), [('DateValue') : 'Today'], FailureHandling.STOP_ON_FAILURE)

//WebUI.delay(2)
//
//WebUI.click(findTestObject('Web/Picklist/InvoiceFromDate'))
//
//WebUI.callTestCase(findTestCase('Date Picker/Today date'), [('DateValue') : 'Today'], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Web/Picklist/InvoiceToDate'))
//
//WebUI.callTestCase(findTestCase('Date Picker/Today date'), [('DateValue') : 'Today'], FailureHandling.STOP_ON_FAILURE)
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

WebUI.click(findTestObject('Web/Picklist/Template_Type'))

WebUI.click(findTestObject('Web/Picklist/Template_Next'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Web/Picklist/Header_Pick List Generation'), 30)

WebUI.takeScreenshot()

