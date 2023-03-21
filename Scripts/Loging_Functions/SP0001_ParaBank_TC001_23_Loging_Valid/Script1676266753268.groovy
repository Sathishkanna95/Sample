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

'open the browser and maximizewindow'
WebUI.openBrowser(null)

WebUI.maximizeWindow()

'navigate the url'
WebUI.navigateToUrl(GlobalVariable.url)

'Verify url'
CustomKeywords.'base.commonUtillity.verifyUrl'(GlobalVariable.url)

'The user fill the username '
WebUI.setText(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Username'), 
    loginusername)

'The user verify the user name '
String user = WebUI.getAttribute(findTestObject('Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Username'), 
    'value')
CustomKeywords.'base.commonUtillity.verifyEqualsAssert'(user, loginusername)

'The user takeElementScreenshot for username'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Username'))

'The user sent the password'
WebUI.setText(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Password'), 
    loginpassword)

'The user verify the password'
String pass = WebUI.getAttribute(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Password'), 
    'value')
CustomKeywords.'base.commonUtillity.verifyEqualsAssert'(pass, loginpassword)

'The user takeElementScreenshot for password'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Loging_Password'))

'The user takeFullPageScreenshot Loging Before'
WebUI.takeScreenshot()

'The user click loging btn'
WebUI.click(findTestObject('Object Repository/Loging_Function/Page_ParaBank  Welcome  Online Banking/Login_Button_Ckick'))

'The user verify the Login page'
String text = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/Accounts Overview'))
CustomKeywords.'base.commonUtillity.verifyEqualsAssert'('Accounts Overview', text)

'The user takeScreenshot Loging Before'
WebUI.takeScreenshot()

'The user print the Account No and Availabe Amount '
String accno = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/AccountNo_16230'))

String amount = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/Available_Amount100.00'))

println('Account No :' + accno)

println('Availabe Amount : ' + amount)

'The user Click the Logout Button'
WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Log Out'))

'The User Delay 2 sec and close the browser'
WebUI.delay(2)
'The user takeScreenshot Logingout After'
WebUI.takeScreenshot()

WebUI.closeBrowser()

