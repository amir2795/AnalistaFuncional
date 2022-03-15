package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.PasoCuatro;
import co.com.choucair.certification.proyectobase.userinterface.PasoDos;
import co.com.choucair.certification.proyectobase.userinterface.PasoTres;
import co.com.choucair.certification.proyectobase.userinterface.TestIngresarPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Ingresar implements Task {
    private final String strNombre;
    private final String strApellido;
    private final String strEmail;

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
                SelectFromOptions.byVisibleText("27").from(TestIngresarPagina.SELECT_DIA),
                SelectFromOptions.byVisibleText("December").from(TestIngresarPagina.SELECT_MES),
                SelectFromOptions.byVisibleText("1995").from(TestIngresarPagina.SELECT_YEAR),
                Click.on(TestIngresarPagina.ENTER_NEXT),
                Enter.theValue("Panama").into(PasoDos.INPUT_CIUDAD),
                Enter.theValue("01010").into (PasoDos.INPUT_POSTAL),
                SelectFromOptions.byVisibleText("Panama").from(PasoDos.SELECT_PAIS),
                Click.on(PasoDos.ENTER_NEXT_DOS),
                SelectFromOptions.byVisibleText("Windows").from(PasoTres.SELECT_COMPUTER),
                SelectFromOptions.byVisibleText("10").from(PasoTres.SELECT_VERSION),
                SelectFromOptions.byVisibleText("Spanish").from(PasoTres.SELECT_LENGUAJE),
                SelectFromOptions.byVisibleText("Alcatel").from(PasoTres.SELECT_DISPOSITIVO),
                SelectFromOptions.byVisibleText("OT-890").from(PasoTres.SELECT_MODELO),
                SelectFromOptions.byVisibleText("Android 2.1").from(PasoTres.SELECT_SO),
                Click.on(PasoTres.ENTER_NEXT_TRES),
                Enter.theValue("Mundo12345.").into(PasoCuatro.INPUT_CONTRASENA),
                Enter.theValue("Mundo12345.").into(PasoCuatro.INPUT_CONFIRMAR_CON),
                Click.on(PasoCuatro.CHECK_INFORMACION),
                Click.on(PasoCuatro.CHECK_TERMINOS),
                Click.on(PasoCuatro.CHECK_POLITICAS),
                Click.on(PasoCuatro.ENTER_NEXT_CUATRO)
                );
        }
}
