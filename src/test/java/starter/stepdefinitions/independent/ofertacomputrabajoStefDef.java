package starter.stepdefinitions.independent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

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
        );

    }

    @Then("el usuario debe ver un mensaje error en recaptcha {string}")
    public void el_usuario_debe_ver_un_mensaje_error_en_recaptcha(String string) {


    }

    @And("el usuario diligencia su correo de manera incorrecta {string}")
    public void el_usuario_diligencia_su_correo_de_manera_incorrecta(String string) {


    }

    @Then("el usuario debe ver un mensaje de error el cual indica {string}")
    public void el_usuario_debe_ver_un_mensaje_de_error_el_cual_indica(String string) {


    }

}
