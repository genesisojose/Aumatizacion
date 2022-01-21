package Edit.AutomatizacionBasica;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Metodo para abrir selenium WebDriver desde el navegador Chromer 
     */
    @Test //todo lo que esta abajo es un metodo de prueba 
    public void AbrirPaginaChrome(){
    	//1-Indricar donde esta el driver a utilizar 
        System.setProperty("webdriver.chrome.driver", "..\\AutomatizacionBasica\\Drives\\chromedriver.exe");
        //2- Crear el objeto webdriver 
        WebDriver driver = new ChromeDriver();
        //3-Abrir el navegador en la pagina de selenium 
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        
        
        
    }
    
    /**
     * Metodo para abrir selenium WebDriver desde el navegador Chromer  y hacer una busqueda 
     */
    @Test //todo lo que esta abajo es un metodo de prueba 
    public void BuscarChrome(){
    	//1-Indricar donde esta el driver a utilizar 
        System.setProperty("webdriver.chrome.driver", "..\\AutomatizacionBasica\\Drives\\chromedriver.exe");
        //2- Crear el objeto webdriver 
        WebDriver driver = new ChromeDriver();
        //3-Abrir el navegador en la pagina de selenium 
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        
        //4-Escribir las palabra a buscar
        
        WebElement txtBuscador  = driver.findElement(By.); // se identifica el elemento 
        
        txtBuscador.sendKeys("java");
        
        // Simular  presionar la tecla enter 
        
        txtBuscador.sendKeys(Keys.ENTER);
        		
        
    }
    	
}   
       
