package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairIngresarPagina extends PageObject {
    public static final Target BOTON_INGRESAR = Target.the("Este boton es para acceder").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a"));
    public static final Target INPUT_USUARIO = Target.the("Esto es para escribir el usuario de acceso").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[1]/input"));
    public static final Target INPUT_CONTRASENA = Target.the("Esto es para escribir la contraseña de acceso").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[1]/input"));
    public static final Target ENTER_CONFIRMAR = Target.the("Este boton es para confirmar el acceso").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));
}
