
package testing.task.ofertacomputrabajo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.ofertacomputrabajo.Ofertacomputrabajo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Filtrosbusqueda implements Task {

    private final String experiencia;
    private final String salario;

    public Filtrosbusqueda(String experiencia, String salario) {
        this.experiencia = experiencia;
        this.salario = salario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Aplica filtros
        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.POP_UPBOTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Ofertacomputrabajo.POP_UPBOTON),
                Click.on(Ofertacomputrabajo.DROPDOWN_EXPERIENCIA),
                WaitUntil.the(Ofertacomputrabajo.OPCION_EXPERIENCIA(experiencia), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(Ofertacomputrabajo.OPCION_EXPERIENCIA(experiencia)),

                Click.on(Ofertacomputrabajo.DROPDOWN_SALARIO),
                WaitUntil.the(Ofertacomputrabajo.OPCION_SALARIO(salario), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(Ofertacomputrabajo.OPCION_SALARIO(salario))
        );

    }

    public static Filtrosbusqueda filtrosbusqueda(String experiencia, String salario) {
        return instrumented(Filtrosbusqueda.class, experiencia, salario);
    }
}
