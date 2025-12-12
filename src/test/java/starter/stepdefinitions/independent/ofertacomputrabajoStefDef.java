package starter.stepdefinitions.independent;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ofertacomputrabajoStefDef {

    @When("el usuario realiza su registro diligencia los campos creacion de nueva cuenta {string}, \"brayam, \"duran\", \"pruebas12*\", \"QA analyst\", \"Guainía\"")
    public void el_usuario_realiza_su_registro_diligencia_los_campos_creacion_de_nueva_cuenta_brayam_duran_pruebas12_qa_analyst_guainía(String string) {


    }

    @Then("el usuario debe ver un mensaje error en recaptcha {string}")
    public void el_usuario_debe_ver_un_mensaje_error_en_recaptcha(String string) {


    }

    @When("el usuario diligencia su correo de manera incorrecta {string}")
    public void el_usuario_diligencia_su_correo_de_manera_incorrecta(String string) {


    }

    @Then("el usuario debe ver un mensaje de error el cual indica {string}")
    public void el_usuario_debe_ver_un_mensaje_de_error_el_cual_indica(String string) {


    }

}
