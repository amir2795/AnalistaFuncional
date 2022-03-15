package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PasoCuatro extends PageObject {
    public static final Target INPUT_CONTRASENA = Target.the("Esto es para introducir la contraseña").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_CONFIRMAR_CON = Target.the("Esto es para introducir la confirmacion de la contraseña").located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CHECK_INFORMACION = Target.the("Esto es para marcar el checkbox de recibir informacion").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label"));
    public static final Target CHECK_TERMINOS = Target.the("Esto es para introducir el checkbox de terminos").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label"));
    public static final Target CHECK_POLITICAS = Target.the("Esto es para introducir el checkbox de politicas de privacidad").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label"));
    public static final Target ENTER_NEXT_CUATRO = Target.the("Este boton es dar al finalizar formulario").located(By.xpath("//*[@id=\"laddaBtn\"]"));

}
