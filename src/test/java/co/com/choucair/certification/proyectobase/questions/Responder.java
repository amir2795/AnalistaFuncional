package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.BuscarCursoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Responder implements Question<Boolean> {
    private String pregunta;

    public Responder(String pregunta) {
        this.pregunta = pregunta;
    }
    public static Responder al(String pregunta) {
        return new Responder(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nombreCurso= Text.of(BuscarCursoPagina.NOMBRE_CURSO).viewedBy(actor).asString();
        if (pregunta.equals(nombreCurso)){
            result = true;
        }else {
            result = false;
        }
        return null;
    }
}
