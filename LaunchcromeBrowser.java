package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchcromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dharani");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("b.tech");
    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2,500,000");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("101");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("software tester to be responsible for designing and running tests on software usability.");
    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("miss");
    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9500423417");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharanithanni19@gmail.com");
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Dharani.M");
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("tansi nager");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600042");
    driver.findElement(By.className("smallSubmit")).click();

	
	
	

	}

	
}
