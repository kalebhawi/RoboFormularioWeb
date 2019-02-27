package br.com.estudos_selenium.robo_formulario_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		try {
			
			//Link do site escolhido
			String url = "https://www.roboform.com/filling-test-all-fields";
			//Caminho onde está o driver do navegador
			String caminho = "C:\\Users\\dev04.TARGETIT\\Downloads\\chromedriver.exe";
			//Navegador usado
			String navegador = "webdriver.chrome.driver";
			
			testGoogleSearch(url, caminho, navegador);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void testGoogleSearch(String url, String caminho, String navegador) throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty(navegador, caminho);

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String printaNome = driver.getTitle();
		
		driver.findElement(By.name("01___title")).sendKeys("Automação Web com Selenium");
		driver.findElement(By.name("02frstname")).sendKeys("Kaleb");
		driver.findElement(By.name("03middle_i")).sendKeys("H");
		driver.findElement(By.name("04lastname")).sendKeys("Lopes");
		driver.findElement(By.name("04fullname")).sendKeys("Kaleb Hawi Lopes");
		driver.findElement(By.name("05_company")).sendKeys("Target It");
		driver.findElement(By.name("06position")).sendKeys("Estagiário");
		driver.findElement(By.name("10address1")).sendKeys("Rua Chaves Barcelos");
		driver.findElement(By.name("11address2")).sendKeys("Número: 195");
		driver.findElement(By.name("13adr_city")).sendKeys("Porto Alegre");
		driver.findElement(By.name("14adrstate")).sendKeys("RS");
		driver.findElement(By.name("15_country")).sendKeys("Brasil");
		driver.findElement(By.name("16addr_zip")).sendKeys("90110-220");
		driver.findElement(By.name("20homephon")).sendKeys("32124041");
		driver.findElement(By.name("21workphon")).sendKeys("30237850");
		driver.findElement(By.name("22faxphone")).sendKeys("none");
		driver.findElement(By.name("23cellphon")).sendKeys("82677292");
		driver.findElement(By.name("24emailadr")).sendKeys("kl@kl.com.br");
		driver.findElement(By.name("25web_site")).sendKeys("fb/kaleb");
		driver.findElement(By.name("26_icq_num")).sendKeys("none");
		driver.findElement(By.name("30_user_id")).sendKeys("klblps");
		driver.findElement(By.name("31password")).sendKeys("123456");
		driver.findElement(By.name("32passques")).sendKeys("easy");
		driver.findElement(By.name("33passansw")).sendKeys("1ao6");
		new Select(driver.findElement(By.name("40cc__type"))).selectByValue("19");
		driver.findElement(By.name("41ccnumber")).sendKeys("1234.5678.9101.1121");
		new Select(driver.findElement(By.name("42ccexp_mm"))).selectByVisibleText("07");
		new Select(driver.findElement(By.name("43ccexp_yy"))).selectByVisibleText("2025");
		driver.findElement(By.name("44cc_uname")).sendKeys("Kaleb H Lopes");
		driver.findElement(By.name("45ccissuer")).sendKeys("Bradesco");
		driver.findElement(By.name("46cccstsvc")).sendKeys("55-99999999");
		driver.findElement(By.name("60pers_sex")).sendKeys("Male");
		driver.findElement(By.name("61pers_ssn")).sendKeys("171");
		driver.findElement(By.name("62driv_lic")).sendKeys("505050");
		driver.findElement(By.name("63birth_mm")).sendKeys("07");
		driver.findElement(By.name("64birth_dd")).sendKeys("14");
		driver.findElement(By.name("65birth_yy")).sendKeys("1995");
		driver.findElement(By.name("66pers_age")).sendKeys("23 anos");
		driver.findElement(By.name("67birth_pl")).sendKeys("Porto Alegre");
		driver.findElement(By.name("68__income")).sendKeys("Kaleb");
		driver.findElement(By.name("71__custom")).sendKeys("Kaleb");
		driver.findElement(By.name("72__commnt")).sendKeys("Izi pizi lemon squizi");
		
		System.out.println("Formulário online - "+printaNome+" - respondido com sucesso!");
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}
}
