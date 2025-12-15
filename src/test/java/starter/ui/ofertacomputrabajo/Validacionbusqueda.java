package starter.ui.ofertacomputrabajo;

import net.serenitybdd.screenplay.targets.Target;

public class Validacionbusqueda {

    private Validacionbusqueda () {}

    public static final Target TITULOS_OFERTAS = Target.the("Títulos de las ofertas de empleo")
            .locatedBy("//p[contains(@class,'title_offer')]");

    public static final Target TARJETAS_OFERTAS = Target.the("Tarjetas de ofertas de empleo")
            .locatedBy("//div[contains(@class,'offer')] | //article[contains(@class,'offer')]");

}
