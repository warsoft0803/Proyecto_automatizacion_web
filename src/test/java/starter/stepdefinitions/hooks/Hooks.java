package starter.stepdefinitions.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    @Before(order = 0)
    public void setUpStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void setUpBrowser(Scenario scenario) {
        WebDriverManager.chromedriver().setup(); // Esto descarga el driver si no está
        //WebDriver driver = new ChromeDriver();
        OnStage.theActorCalled("Usuario");

        // Guardamos el nombre del escenario en la sesión de Serenity (opcional)
        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());
    }
}

