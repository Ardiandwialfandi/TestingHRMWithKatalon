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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_firstName'), 'Ardian')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_middleName'), 'Juara')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full Name_lastName'), 'Coding')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select --'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Email_oxd-input oxd-input--focus'), 'Juara@gmail.com')

WebUI.setText(findTestObject('Page_OrangeHRM/NoTelp'), '089728177281')

WebUI.click(findTestObject('Page_OrangeHRM/div_No file selected'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 'juara')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Date of Application_oxd-input oxd-inp_7472ab'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_2'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 'juara')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/label'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.getText(findTestObject('Page_OrangeHRM/p_Ardian Juara Coding'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/p_Ardian Juara Coding'), 'Ardian Juara Coding')

WebUI.closeBrowser()

