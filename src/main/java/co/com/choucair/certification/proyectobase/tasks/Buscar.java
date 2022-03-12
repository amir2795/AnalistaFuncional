package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.BuscarCursoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task {
    public Buscar(String curso) {
        this.curso = curso;
    }

    private String curso;
    public static Buscar el(String curso) {
        return Tasks.instrumented(Buscar.class,curso);
    }

        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(Click.on(BuscarCursoPagina.BOTON_UC),
                    Enter.theValue(curso).into(BuscarCursoPagina. INPUT_CURSO),
                    Click.on(BuscarCursoPagina.BOTON_IR),
                    Click.on(BuscarCursoPagina.SELECT_CURSO)
            );
        }
}
