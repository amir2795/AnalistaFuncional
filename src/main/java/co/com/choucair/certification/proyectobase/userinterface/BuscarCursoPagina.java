package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarCursoPagina extends PageObject {
    public static final Target BOTON_UC =Target.the("Selecciona la universidad choucair").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[1]/a"));
    public static final Target INPUT_CURSO =Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BOTON_IR = Target.the("Da click para buscar el curso").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_CURSO = Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NOMBRE_CURSO = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
