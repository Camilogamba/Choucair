package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage  {
   // public static final Target BUTTON_GO2 = Target.the("Da click para buscar el curso").located(By.xpath("//div[@id='page-navbar']/nav/ul/li[2]/a"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso").located(By.id("coursesearchbox"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae nombre del curso").located(By.xpath("//h1[contains(text(), 'Recursos Automatización Bancolombia')]"));
   }
