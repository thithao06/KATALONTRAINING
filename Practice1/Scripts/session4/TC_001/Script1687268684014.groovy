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

WebUI.openBrowser("https://opensource-demo.orangehrmlive.com")
String web = WebUI.getUrl()
if (web.endsWith("/auth/login")) {
	println "This is an expected page"
}
else {
	println "Unexpected page"
}

String expectedLoginLabel = "Login"
String actualLoginLabel = WebUI.getText(findTestObject('Object Repository/Label/lbl_LoginPage'))
WebUI.verifyEqual(actualLoginLabel,expectedLoginLabel)

String expectedUserNameLabel = "Username"
String expectedPassLabel = "Password"

String actualUserNameLabel = WebUI.getText(findTestObject('Object Repository/Textbox/txt_Username'))
WebUI.verifyEqual(actualUserNameLabel,expectedUserNameLabel)

String actualPassLabel = WebUI.getText(findTestObject('Object Repository/Textbox/txt_Password'))
WebUI.verifyEqual(actualPassLabel,expectedPassLabel)

String expectedLoginBtn = "Login"
String actualLoginBtn = WebUI.getText(findTestObject('Object Repository/Button/btn_Login'))
WebUI.verifyEqual(actualLoginBtn, expectedLoginBtn)

String requiredMess_User = WebUI.getText(findTestObject('Object Repository/Label/lbl_RequiredUserName'))
WebUI.verifyTextPresent(requiredMess_User, true)

String requiredMess_Pass = WebUI.getText(findTestObject('Object Repository/Label/lbl_RequestPass'))
WebUI.verifyTextPresent(requiredMess_Pass, true)

WebUI.closeBrowser()