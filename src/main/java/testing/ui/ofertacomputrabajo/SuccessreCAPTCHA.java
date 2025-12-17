package testing.ui.ofertacomputrabajo;

import net.serenitybdd.screenplay.targets.Target;

public class SuccessreCAPTCHA {

    private SuccessreCAPTCHA () {}

    public static final Target VALIDACION_RECAPTCHA = Target.the("Valida mensaje de error recaptcha")
            .locatedBy("//span[@class='mb15 field-validation-error']");

}
