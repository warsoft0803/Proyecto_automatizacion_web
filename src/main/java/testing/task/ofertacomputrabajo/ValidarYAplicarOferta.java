
package testing.task.ofertacomputrabajo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.ofertacomputrabajo.Ofertacomputrabajo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class ValidarYAplicarOferta implements Task {

    public ValidarYAplicarOferta() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Verifica TÍTULO y CIUDAD (fijos)

        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.TITULO_OFERTA_POR_ID, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(Ofertacomputrabajo.TITULO_OFERTA_POR_ID, containsText("Test automation Engineer QA")).forNoMoreThan(5).seconds(),

                WaitUntil.the(Ofertacomputrabajo.CIUDAD_OFERTA_POR_ID, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(Ofertacomputrabajo.CIUDAD_OFERTA_POR_ID, containsText("La Guadalupe, Guainía")).forNoMoreThan(5).seconds()
        );

        //Abre menú de tres puntos y aplica
        actor.attemptsTo(
                MoveMouse.to(Ofertacomputrabajo.BOTON_TRES_PUNTOS),
                Click.on(Ofertacomputrabajo.BOTON_TRES_PUNTOS),
                WaitUntil.the(Ofertacomputrabajo.CLICK_APLICAROFERTA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Ofertacomputrabajo.CLICK_APLICAROFERTA)
        );
    }

    public static ValidarYAplicarOferta validaryaplicaroferta() {
        return instrumented(ValidarYAplicarOferta.class);
    }
}

