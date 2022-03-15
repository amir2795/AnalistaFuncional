package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PasoDos extends PageObject{
    public static final Target INPUT_CIUDAD = Target.the("Esto es para introducir la ciudad").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_POSTAL = Target.the("Esto es para introducir el codigo postal").located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_PAIS = Target.the("Esto es para elegir el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]"));
    public static final Target ENTER_NEXT_DOS = Target.the("Este boton es dar al siguiente").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
