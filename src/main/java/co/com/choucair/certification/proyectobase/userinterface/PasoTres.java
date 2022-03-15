package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PasoTres extends PageObject{
    public static final Target SELECT_COMPUTER = Target.the("Esto es para seleccionar el modelo de pc").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_VERSION = Target.the("Esto es para seleccioanar la version del SO").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_LENGUAJE = Target.the("Esto es para elegir el lenguaje").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_DISPOSITIVO = Target.the("Esto es para seleccionar el dispositivo").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MODELO = Target.the("Esto es para seleccionar el modelo").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_SO = Target.the("Esto es para seleccionar el SO").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target ENTER_NEXT_TRES = Target.the("Este boton es dar al siguiente").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
