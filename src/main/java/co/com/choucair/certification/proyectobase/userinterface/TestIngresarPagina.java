package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TestIngresarPagina extends  PageObject{
    public static final Target BOTON_INGRESAR = Target.the("Este boton es para acceder").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NOMBRE = Target.the("Esto es para escribir el nombre").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_APELLIDO = Target.the("Esto es para escribir el apellido").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Esto es para escribir el email").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target ENTER_CONFIRMAR = Target.the("Este boton es dar al siguiente").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}



