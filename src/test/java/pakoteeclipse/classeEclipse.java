package pakoteeclipse;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classeEclipse {
	
	private WebDriver driver; //PARA IMPORTAR APERTA CTRL + ESPAÇO AS DEPENDENCIAS DO SELENIUN
	
	//VEM ANTES DO NAVEGADOR
	@Before //PARA IMPORTAR O jUNIT APERTA CTRL + ESPAÇO
	public void abrirnavegador() {
	System.setProperty("webdriver.chrome.driver", "C:\\chomedriver\\chromedriver.exe");	//PARA ABRIR O NAVEGADOR. COLOCA O NOME DO ARQUIDO E O CAMINHO ONDE ESTAR O ARQUIVO DO CHROMEDRIVER, PARA LINKAR O ARQUIVO DO CHOME DRIVER COM O ECLIPSE
	driver = new ChromeDriver(); // O DRIVER É UMA NOVA INSTANCIA DO CHOMEDRIVER
	driver.manage().window().maximize(); //PARA MAXIMIZAR A TELA
	
	}
	 
	//PARA RODAR O TESTE PARA ABRIR A PAGINA 
	@Test  //PARA IMPORTAR O JUNIT APERTA O CTRL + ESPAÇO
	public void testenavegador() {
		driver.get("http://localhost:4200/"); //PARA ABRIR O SITE DO EPLAERS DEVERA RODAR NO ANGULAR
	    driver.findElement(By.id("campo-email")).sendKeys("pedrounib@gmail.com"); //ABRE O CAMPO EMAIL COLOCANDO O EMAIL NO CAMPO EMAIL PEGANDO O ID DO CAMPO EMAIL
	    driver.findElement(By.tagName("button")).click(); //CLICA NO BOTAO  CADASTRAR E PEGA A TAGNAME DO BOTAO
	} 
}
