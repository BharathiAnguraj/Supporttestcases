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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

if (DateValue == 'Today') {
    DateFormat dateFormat = new SimpleDateFormat('dd-MMM-yyyy')

    Date date = new Date()

    String today = dateFormat.format(date)

    println(today)

    DateValue = today
}

if (DateValue == 'Tomorrow') {
    DateFormat dateFormat = new SimpleDateFormat('dd-MMM-yyyy')

    Date date = new Date()

    String today = dateFormat.format(date + 1)

    println(today)

    DateValue = today
}

String[] sDate = DateValue.split('-')

println(((((sDate[0]) + ';') + (sDate[1])) + ';') + (sDate[2]))

String day = sDate[0]

println(day.substring(0))

println(day.charAt(1))

if (day.startsWith('0') == true) {
    GlobalVariable.date = day.charAt(1)
} else {
    GlobalVariable.date = (sDate[0])
}

GlobalVariable.month = (sDate[1])

GlobalVariable.year = (sDate[2])

WebUI.click(findTestObject('Web/Calendar/Year_Option'))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Calendar/Month_Option'))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Calendar/Date'))

