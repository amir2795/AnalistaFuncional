package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairIngresarPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    private String strUser;
    private String strPassword;

    public Ingresar(String strUser, String strPassword){
        this.strUser = strUser;
        this.strPassword = strPassword;
    }
    public static Ingresar aLaPagina(String strUser, String strPassword) {
        return Tasks.instrumented(Ingresar.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairIngresarPagina.BOTON_INGRESAR),
                Enter.theValue(strUser).into(ChoucairIngresarPagina.INPUT_USUARIO),
                Enter.theValue(strPassword).into (ChoucairIngresarPagina.INPUT_CONTRASENA),
                Click.on(ChoucairIngresarPagina.ENTER_CONFIRMAR)
                );
        }
}
