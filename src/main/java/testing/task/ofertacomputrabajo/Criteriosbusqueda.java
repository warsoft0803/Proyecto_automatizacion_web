package testing.task.ofertacomputrabajo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.ofertacomputrabajo.Ofertacomputrabajo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Criteriosbusqueda  implements Task {

    private final String cargo;
    private final String lugar;

    public Criteriosbusqueda ( String cargo, String lugar) {

        this.cargo = cargo;
        this.lugar = lugar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.BUSCAR_CARGO.of(cargo), isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(this.cargo).into(Ofertacomputrabajo.BUSCAR_CARGO),
                Enter.theValue(this.lugar).into(Ofertacomputrabajo.BUSCAR_LUGAR),
                Click.on(Ofertacomputrabajo.BOTON_BUSCAR)
        );

    }

    public static Criteriosbusqueda criteriosbusqueda(
            String cargo, String lugar
    ) {
        return instrumented(Criteriosbusqueda.class,
        cargo, lugar);
    }
}
