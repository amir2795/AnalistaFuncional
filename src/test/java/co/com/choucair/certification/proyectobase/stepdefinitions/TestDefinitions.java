package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.TestData;
import co.com.choucair.certification.proyectobase.tasks.Abrir;
import co.com.choucair.certification.proyectobase.tasks.Ingresar;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TestDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Amir quiere registrarse en Utest$")
    public void amirQuiereRegistrarseEnUtest(List<TestData> testData) {
        OnStage.theActorCalled("Amir").wasAbleTo(Abrir.laPagina(), Ingresar.aLaPagina(testData.get(0).getStrNombre(),testData.get(0).getStrApellido(),testData.get(0).getStrEmail()));
        throw new PendingException();
    }


    @Cuando("^el entra a la pagina en Utest$")
    public void elEntraALaPaginaEnUtest() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^empieza a registrarse Utest$")
    public void empiezaARegistrarseUtest() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
