package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Responder;
import co.com.choucair.certification.proyectobase.tasks.Abrir;
import co.com.choucair.certification.proyectobase.tasks.Buscar;
import co.com.choucair.certification.proyectobase.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^brandon quiere aprender automatizacion en la academia Choucair$")
    public void brandonQuiereAprenderAutomatizacionEnLaAcademiaChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("brandon").wasAbleTo(Abrir.laPagina(), Ingresar.aLaPagina(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @Cuando("^busco el curso (.*) en la plataforma de la academia choucair$")
    public void buscoElCursoRecursosAutomatizacionBancolombiaEnLaPlataformaDeLaAcademiaChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.el(academyChoucairData.get(0).getStrCourse()));

    }

    @Entonces("^encuentra el curso llamado recursos (.*)$")
    public void encuentraElCursoLlamadoRecursosRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.al(academyChoucairData.get(0).getStrCourse())));

    }
}
