package testing.stepdefinitions.ofertacomputrabajo.independent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testing.questions.ofertacomputrabajo.ErrorQuestions;
import testing.task.ofertacomputrabajo.RegistroNuevaCuenta;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ofertacomputrabajoStefDef {

    @And("el usuario realiza su registro diligencia los campos creacion de nueva cuenta {string}, {string}, {string}, {string}, {string}, {string}")
    public void elUsuarioRealizaElRegistroDeNuevaCuenta(
            String correo,
            String nombre,
            String apellido,
            String contrasena,
            String puestoDetrabajo,
            String departamento
    ) {
        theActorInTheSpotlight().attemptsTo(
                RegistroNuevaCuenta.registronuevacuenta(
                        correo, nombre, apellido,
                        contrasena, puestoDetrabajo, departamento
                )
        );

    }


    @Then("el usuario debe ver un mensaje error en recaptcha {string}")
    public void elUsuarioDebeVerUnMensajeErrorEnRecaptcha(String indicando) {
        theActorInTheSpotlight().should(
                seeThat(ErrorQuestions.elUsuarioDebeVerUnMensajeErrorEnRecaptcha(indicando))
        );
    }

    @Then("el usuario debe ver un mensaje de error en correo el cual indica {string}")
    public void elUsuarioDebeVerUnMensajeDeErrorEnCorreoElCualIndica(String indicando) {
        theActorInTheSpotlight().should(
                seeThat(ErrorQuestions.elUsuarioDebeVerUnMensajeErrorEnMail(indicando))
        );
    }

}
