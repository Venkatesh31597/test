package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
		
		//driver.manage().window().maximize();
		
		int Row=driver.findElements(By.xpath("//div[@class='large-10 columns']//table/tbody/tr")).size();
		
		System.out.println("No.of Rows:" +Row);
		
		int Column=driver.findElements(By.xpath("//div[@class='large-10 columns']//table//thead/tr/th")).size();
		
		System.out.println("No. of Column:"+ Column);
		
		System.out.println("Data from the table...");
		for(int r=1;r<=Row;r++) {
			
			for(int c=1;c<=Column;c++) {
              
				String Value=driver.findElement(By.xpath("//div[@class='large-10 columns']//table//tbody/tr["+r+"]/td["+c+"]")).getText();
               
				System.out.print("  "+Value);
			}
			System.out.println();
		}
		
		driver.quit();
		
		
		
	}
}
