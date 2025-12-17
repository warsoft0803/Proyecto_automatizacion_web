package testing.stepdefinitions.ofertacomputrabajo.commons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.task.ofertacomputrabajo.Criteriosbusqueda;
import testing.task.ofertacomputrabajo.Filtrosbusqueda;
import testing.task.ofertacomputrabajo.Modulocomputrabajo;
import testing.task.ofertacomputrabajo.ValidarYAplicarOferta;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Stepofertacomputrabajo {

    @Given("selecciona el pais correspondiente")
    public void SeleccionaElPaisCorrespondiente() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Modulocomputrabajo.seleccionaElPaisCorrespondiente()
        );
    }

    @When("el usuario selecciona el cargo y lugar de busqueda cargo {string} lugar {string}")
    public void elUsuarioSeleccionaElCargoYlugarDeBusqueda(
            String cargo,
            String lugar
    ) {
        theActorInTheSpotlight().attemptsTo(
                Criteriosbusqueda.criteriosbusqueda(
                        cargo, lugar
                )
        );
    }

    @When("el usuario realiza los filtros de busqueda definidos {string}, {string}")
    public void elUsuarioRealizaLosFiltrosDeBusquedaDeFinidos(
            String experiencia,
            String salario
    ){
        theActorInTheSpotlight().attemptsTo(
                Filtrosbusqueda.filtrosbusqueda(
                        experiencia, salario
                )
        );

    }

    @When("el usuario valida los resultados de la lista son correctos y aplica a la oferta")
    public void elUsuarioValidaLosResultadosDeLaListaSonCorrectosYAplicaALaOferta() {

        theActorInTheSpotlight().attemptsTo(
                ValidarYAplicarOferta.validaryaplicaroferta()
        );

    }
}
