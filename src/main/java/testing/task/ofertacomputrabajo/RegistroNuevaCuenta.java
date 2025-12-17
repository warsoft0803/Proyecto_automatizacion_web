package testing.task.ofertacomputrabajo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.ofertacomputrabajo.Ofertacomputrabajo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroNuevaCuenta implements Task {

    private final String correo;
    private final String nombre;
    private final String apellido;
    private final String contrasena;
    private final String puestoTrabajo;
    private final String departamento;

    public RegistroNuevaCuenta(String correo, String nombre, String apellido,
                               String contrasena, String puestoTrabajo, String departamento) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.puestoTrabajo = puestoTrabajo;
        this.departamento = departamento;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        // Vista correo
        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.CAMPO_MAIL, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(correo).into(Ofertacomputrabajo.CAMPO_MAIL),
                Click.on(Ofertacomputrabajo.CONTINUAR_MAIL)
        );


        // Si el correo no es correcto se detiene flujo valida question
        if (!correo.contains("@")) {
            System.out.println("Correo inválido, se detiene el flujo.");
            return;
        }

        // Formulario
        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.CAMPO_NOMBRE, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(nombre).into(Ofertacomputrabajo.CAMPO_NOMBRE),
                Enter.theValue(apellido).into(Ofertacomputrabajo.CAMPO_APELLIDO),
                Enter.theValue(contrasena).into(Ofertacomputrabajo.CAMPO_CONTRASENA),
                Enter.theValue(puestoTrabajo).into(Ofertacomputrabajo.CAMPO_PUESTOTRABAJO),
                Click.on(Ofertacomputrabajo.DEPARAMENTO_DROPDOWN),
                WaitUntil.the(Ofertacomputrabajo.SELECCIONA_DEPARTAMENTO(departamento), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(Ofertacomputrabajo.SELECCIONA_DEPARTAMENTO(departamento))
        );

        // Continuar (ReCAPTCHA manual)
        actor.attemptsTo(
                WaitUntil.the(Ofertacomputrabajo.BOTON_CONTINUARFINAL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Ofertacomputrabajo.BOTON_CONTINUARFINAL)
        );
    }


    public static RegistroNuevaCuenta registronuevacuenta(
            String correo, String nombre, String apellido,
            String contrasena, String puestoTrabajo, String departamento) {
        return instrumented(RegistroNuevaCuenta.class,
                correo, nombre, apellido,
                contrasena, puestoTrabajo, departamento);
    }
}
