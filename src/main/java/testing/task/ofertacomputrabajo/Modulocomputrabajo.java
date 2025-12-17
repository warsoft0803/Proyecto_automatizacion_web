package testing.task.ofertacomputrabajo;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static testing.ui.ofertacomputrabajo.Ofertacomputrabajo.SELECCIONAR_PAIS;

public class Modulocomputrabajo {

    public static Task seleccionaElPaisCorrespondiente() {
        return Task.where("selecciona el pais correspondiente",
                Click.on(SELECCIONAR_PAIS)
        );
    }
}
