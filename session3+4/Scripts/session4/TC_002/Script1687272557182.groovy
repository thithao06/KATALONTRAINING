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
'Input username'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Username'), GlobalVariable.userName)
'Click on Login button'
WebUI.click(findTestObject('Object Repository/Button/btn_Login'))
'Verify that Password is required'
String requiredMess_Pass = WebUI.getText(findTestObject('Object Repository/Label/lbl_RequiredPass'))
WebUI.verifyTextPresent(requiredMess_Pass, true)

'Delete username'
WebUI.sendKeys(findTestObject('Object Repository/Textbox/txt_Username'), Keys.chord(Keys.CONTROL,"a"))
WebUI.sendKeys(findTestObject('Object Repository/Textbox/txt_Username'), Keys.chord(Keys.BACK_SPACE))
'Input password'
WebUI.setText(findTestObject('Object Repository/Textbox/txt_Password'), GlobalVariable.password)
'Click on Login button'
WebUI.click(findTestObject('Object Repository/Button/btn_Login'))
'Verify that Username is required'
String requiredMess_User = WebUI.getText(findTestObject('Object Repository/Label/lbl_RequiredUserName'))
WebUI.verifyTextPresent(requiredMess_User, true)

WebUI.closeBrowser()
