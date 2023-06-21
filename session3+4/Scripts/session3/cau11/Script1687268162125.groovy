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

//------------------cau 11
def BMI = [Name: "Thao Tran", Height: 155]
double weight = 45
Scanner input = new Scanner(System.in)
//System.out.println("Nhap vao can nang: ")
println "Nhap vao can nang: "
double weight = input.nextDouble()
double result = (weight/((BMI.get("Height")/100) * (BMI.get("Height")/100))).round(2)

if (result < 16) {
		println "Thể trạng của bạn là : Gầy độ III"
	}
	else if (result >= 16 && result < 17) {
		println "Thể trạng của bạn là : Gầy độ II"
	}
	else if (result >= 17 && result < 18.5) {
		println "Thể trạng của bạn là : Gầy độ I"
	}
	else if (result >= 18.5 && result < 25) {
		println "Thể trạng của bạn là : Bình thường"
	}
	else if (result >= 25 && result < 30) {
		println "Thể trạng của bạn là : Thừa cân"
	}
	else if (result >= 30 && result < 35) {
		println "Thể trạng của bạn là : Béo phì độ I"
	}
	else if (result >= 35 && result < 40) {
		println "Thể trạng của bạn là : Béo phì độ II"
	}
	else if (result > 40) {
		println "Thể trạng của bạn là : Béo phì độ III"
	}
	BMI.put("BMI", result)
	println BMI


