package testing.questions.ofertacomputrabajo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import testing.ui.ofertacomputrabajo.Ofertacomputrabajo;
import testing.ui.ofertacomputrabajo.SuccessreCAPTCHA;

public class ErrorQuestions implements Question<Boolean> {

    private final String message;
    private final Target element;

    public ErrorQuestions(String message, Target element) {
        this.message = message;
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (element.resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                    Ensure.that(element).isDisplayed(),
                    Ensure.that(element).text().contains(message)
            );
            return true;
        } else {
            System.out.println("Elemento no presente: " + element.getName());
            return false;
        }
    }

    public static testing.questions.ofertacomputrabajo.ErrorQuestions elUsuarioDebeVerUnMensajeErrorEnRecaptcha(String message) {
        return new testing.questions.ofertacomputrabajo.ErrorQuestions (message, SuccessreCAPTCHA.VALIDACION_RECAPTCHA);
    }

    public static testing.questions.ofertacomputrabajo.ErrorQuestions elUsuarioDebeVerUnMensajeErrorEnMail(String message) {
        return new testing.questions.ofertacomputrabajo.ErrorQuestions (message, Ofertacomputrabajo.MAIL_FALLIDO);
    }


}
