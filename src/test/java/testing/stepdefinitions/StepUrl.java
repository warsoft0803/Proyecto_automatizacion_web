package testing.stepdefinitions;


import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class StepUrl {
    private static final String PAGE_URL = "pages.url";

    @Given("{string} ingresa al portal computrabajo")
    public void elUsuarioIngresaAlPortalComputrabajo(String actor) {
        OnStage.theActorCalled(actor);
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
    }
}
