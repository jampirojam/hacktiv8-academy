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

WebUI.callTestCase(findTestCase('SESI 4/CURA SUITES/001-valid-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/div_Medicare                               _cb3988'))

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/td_30'))

WebUI.setText(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/textarea_Comment_comment'), 
    'Medical check-up routine')

WebUI.click(findTestObject('Object Repository/SESI 4/CURA SUITES/002-make-appointment/button_Book Appointment'))

