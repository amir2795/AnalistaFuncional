package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.TestIngresarPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    private String strNombre;
    private String strApellido;
    private String strEmail;

    public Ingresar(String strNombre, String strApellido, String strEmail){
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
    }
    public static Ingresar aLaPagina(String strNombre, String strApellido, String strEmail) {
        return Tasks.instrumented(Ingresar.class,strNombre,strApellido,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestIngresarPagina.BOTON_INGRESAR),
                Enter.theValue(strNombre).into(TestIngresarPagina.INPUT_NOMBRE),
                Enter.theValue(strApellido).into (TestIngresarPagina.INPUT_APELLIDO),
                Enter.theValue(strEmail).into (TestIngresarPagina.INPUT_EMAIL),
                Click.on(TestIngresarPagina.ENTER_CONFIRMAR)
                );
        }
}
