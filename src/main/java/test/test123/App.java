package test.test123;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)

	{
//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form/");
//
//		// Get the WebElement corresponding to textfields
//		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
//
//		firstname.sendKeys("Ngoc");
//		lastname.sendKeys("Vuong");
//		System.out.println("Text Field Set");
//
//		// Deleting values in the text box
//		firstname.clear();
//		lastname.clear();
//		System.out.println("Text Field Cleared");
//
//		// Find the submit button
//		WebElement button = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
//
//		// Using click method to submit form
//		firstname.sendKeys("Ngoc");
//		lastname.sendKeys("Vuong");
//		button.click();
//		System.out.println("Submit Done with Click");
//
//		// Check selection of Sex radio button
//		WebElement radio0 = driver.findElement(By.xpath("//input[@id='sex-0']"));
//		WebElement radio1 = driver.findElement(By.xpath("//input[@id='sex-1']"));
//		radio0.click();
//		radio1.click();
//
//		// Checkbox of Profession
//		WebElement manual_option = driver.findElement(By.xpath("//input[@id='profession-0']"));
//		manual_option.click();
//
//		if (manual_option.isSelected()) {
//			System.out.println("Manual tester checkbox is togged on");
//
//		} else {
//			System.out.println("Manual tester checkbox is togged off");
//		}
//
//		// Check Upload "Profile Picture" file
//		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\Admin\\Downloads\\practice.html");
//		
//		
//		//Check selection of Continents dropdown 
//		Select continents = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
//		continents.selectByVisibleText("North America");
//		
//		// Check multiple selection of Continents
//		Select multiContinents = new Select(driver.findElement(By.xpath("//select[@id='continentsmultiple']")));
//		
//		if(multiContinents.isMultiple()) {
//			System.out.println("Is multiple selection");
//			
//		}else {
//			System.out.println("Not multiple selection");
//		}
//		
//		multiContinents.selectByVisibleText("Antarctica");
//		multiContinents.selectByIndex(4);
//		

//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/iframe-practice-page/");
//		driver.manage().window().maximize();
//		
//		WebElement btn_Alert1 = driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']"));
//		btn_Alert1.click();
//		driver.findElement(By.xpath("//iframe[@id='IF1']"));
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.xpath(""));

		// CHECK NAVIGATION TABS
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/popup.php");
//		driver.manage().window().maximize();
//		
//		WebElement clickAction = driver.findElement(By.xpath("//a[text()='Click Here']"));
//		clickAction.click();
//		
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		
//		driver.switchTo().window(tabs.get(1));
//		
//		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']//descendant::"));
//		email.sendKeys("ngocvt@smartosc.com");
//		
//		WebElement btn_submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
//		btn_submit.click();
//		
//		driver.close();
//		
//		driver.switchTo().window(tabs.get(0));

		//HOMEWORK
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-switch-windows/");

        // click button 1
        driver.findElement(By.id("button1")).click();
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(1));
        driver.manage().window().maximize();
        waitUntilToBeClickAble(driver, By.xpath("//div[@class='tp-mask-wrap']//a"));
        driver.findElement(By.xpath("//div[@class='tp-mask-wrap']//a")).click();
        driver.close();
        driver.switchTo().window(wins.get(0));

        // click button 2
        driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
        ArrayList<String> wins1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins1.get(1));
       System.out.println(driver.findElement(By.xpath("//body")).getText());
        driver.close();
        driver.switchTo().window(wins1.get(0));

        // click button 3
        driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
        ArrayList<String> wins2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins2.get(1));
        driver.manage().window().maximize();
        waitUntilToBeClickAble(driver, By.xpath("//nav[@class='navigation']//span[@class='menu-text'][text()='Blogs']"));
        driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-text'][text()='Blogs']")).click();
        driver.close();
        driver.switchTo().window(wins2.get(0));

        driver.quit();
    }


    public static void waitUntilToBeClickAble(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//
//		Actions action = new Actions(driver);
//		action.contextClick(driver.findElement(By.xpath("//*[text()[contains(.,'right click me')]]")))
//				.click(driver.findElement(By.xpath("//span[text()='Quit']"))).perform();
//
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		Alert simpleAlert = driver.switchTo().alert();
//		String alertText = simpleAlert.getText();
//		System.out.println("Alert text is " + alertText);
//		simpleAlert.accept();
		

//------------------EXERCISE: Drag & Drop ---------------------------------------		
//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/selenium/drag_drop.html");
//		
//		//button 1: BANK
//		WebElement sourceLocator = driver.findElement(By.xpath("//li[@id='credit2']//descendant::a"));
//		WebElement tagetlocator = driver.findElement(By.xpath("//ol[@id='bank']//descendant::li"));
//
//		Actions action = new Actions(driver);
//		action.dragAndDrop(sourceLocator, tagetlocator).perform();
//
//		//button 2: 5000
//		action.dragAndDrop(driver.findElement(By.xpath("//li[@id='fourth']//descendant::a")), driver.findElement(By.xpath("//ol[@id='amt7']//descendant::li"))).perform();
//
//		//button 3: 5000
//		action.dragAndDrop(driver.findElement(By.xpath("//li[@id='fourth'][2]//descendant::a")), driver.findElement(By.xpath("//ol[@id='amt8']//descendant::li"))).perform();
//		
//		//button 4: SALE
//		action.dragAndDrop(driver.findElement(By.xpath("//li[@id='credit1']//descendant::a")), driver.findElement(By.xpath("//ol[@id='loan']//descendant::li"))).perform();

		
		
		
//		// -------------------HOMEWORK: Lesson 4-----------------------
//
//		System.setProperty("webdriver.chrome.driver", "C:\\chormedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.smartosc.com/");
//		driver.manage().window().maximize();
//		
//
//		Actions ctgClick1 = new Actions(driver);
//		
//		// Click menu: Womens -> Bottoms -> Shorts
//		ctgClick1.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-4']//descendant::span[2]")))   // hover on "Women"
//				.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-11']//descendant::span[2]")))  // hover on "Bottoms"
//				.moveToElement(driver.findElement(By.xpath(" // a[@id='ui-id-17']//descendant::span")))   // hover on "Shorts"
//				.click().perform();   // click "Shorts"
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		// Click menu: Men -> Top-> Tees
//		Actions ctgClick2 = new Actions(driver);
//		ctgClick2.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-5']//descendant::span[2]")))  //hover on "Men"
//		.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-18']//descendant::span[2]")))  //hover on "Top"
//		.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-22']//descendant::span")))  //hover on "Tees"
//		.click().perform();  //click on "Tees"
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//Back to Homepage
//		driver.navigate().to("https://demo.smartosc.com/");
//		
//		// Add product "Push It Messenger Bag" to cart
//		Actions hoverPro1 = new Actions(driver);
//		hoverPro1.moveToElement(driver.findElement(By.xpath("//span[@class='product-image-container']//descendant::img[@alt='Push It Messenger Bag']")))
//		.click(driver.findElement(By.xpath("//form[@data-product-sku='24-WB04']//descendant::span")))
//		.perform();
//		
//		// Add product "Fusion Backpack" to cart
//		Actions hoverPro2 = new Actions(driver);
//		hoverPro2.moveToElement(driver.findElement(By.xpath("//span[@class='product-image-container']//descendant::img[@alt='Fusion Backpack']")))
//		.click(driver.findElement(By.xpath("//form[@data-product-sku='24-MB02']//descendant::span")))
//		.perform();
//		
//		//View cart
//		Actions viewCart = new Actions(driver);
//		viewCart.click(driver.findElement(By.xpath("//a[@class='action showcart']"))).perform();
//		
		

//	}
}
