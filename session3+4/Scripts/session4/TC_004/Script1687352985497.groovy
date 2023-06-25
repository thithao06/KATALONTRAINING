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

'Open browser and URL'
WebUI.openBrowser(GlobalVariable.URL)

// Login with wrong password
'Input username'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Username'), GlobalVariable.userName)
'Input password'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Password'), "admin1234")
'Click on Login button'
WebUI.click(findTestObject('Object Repository/Button/btn_Login'))

// Verify alert icon and message
'Verify error message'
String errorWrongPassword = WebUI.getText(findTestObject('Object Repository/Label/lbl_LoginAlert'))
WebUI.verifyEqual(errorWrongPassword, "Invalid credentials")
WebUI.verifyElementPresent(findTestObject('Object Repository/Icon/icon_alert'),10)

// Verify username and password is cleared
'Verify label of Username and Password fields'
WebUI.verifyElementText(findTestObject('Object Repository/Textbox/txt_Username'), "")
WebUI.verifyElementText(findTestObject('Object Repository/Textbox/txt_Password'), "")

// Login with wrong username
'Input username'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Username'), "Admin1")
'Input password'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Password'), GlobalVariable.password)
'Click on Login button'
WebUI.click(findTestObject('Object Repository/Button/btn_Login'))

'Verify error message and error icon'
String errorWrongUsername = WebUI.getText(findTestObject('Object Repository/Label/lbl_LoginAlert'))
WebUI.verifyEqual(errorWrongUsername, "Invalid credentials")
WebUI.verifyElementPresent(findTestObject('Object Repository/Icon/icon_alert'),10)

'Verify Username and Password are blank'
WebUI.verifyElementText(findTestObject('Object Repository/Textbox/txt_Username'), "")
WebUI.verifyElementText(findTestObject('Object Repository/Textbox/txt_Password'), "")

WebUI.closeBrowser()