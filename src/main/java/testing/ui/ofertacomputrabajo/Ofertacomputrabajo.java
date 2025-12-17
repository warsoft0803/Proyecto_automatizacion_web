package testing.ui.ofertacomputrabajo;

import net.serenitybdd.screenplay.targets.Target;

public class Ofertacomputrabajo {

    private Ofertacomputrabajo() {
    }

    public static Target SELECCIONAR_PAIS = Target.the("abrir el pais")
            .locatedBy("//*[@id='Colombialink']");

    public static Target BUSCAR_CARGO = Target.the("Buscar el cargo de interes")
            .locatedBy("//*[@id='prof-cat-search-input']");

    public static Target BUSCAR_LUGAR = Target.the("Buscar lugar")
            .locatedBy("//*[@id='place-search-input']");

    public static Target BOTON_BUSCAR = Target.the("Boton buscar en base a los filtros aplicados")
            .locatedBy("//*[@id='search-button']");

    //vista oferta donde se ubica los filtros

    public static Target POP_UPBOTON = Target.the("Muestra popup de boton de notificacion ofertas")
            .locatedBy("//button[@onclick='webpush_subscribe_ko(event);']");

    //experiencia
    public static final Target DROPDOWN_EXPERIENCIA = Target.the("Despliega años de experiencia")
            .locatedBy(
                    "//div[contains(@class,'field_select_links') and contains(@class,'small')]//p[normalize-space(.)='Experiencia']");

    public static Target OPCION_EXPERIENCIA(String texto) {
        return Target.the("Opción de experiencia: " + texto)
                .locatedBy(
                        "//div[contains(@class,'field_select_links') and contains(@class,'open')]//li//span[contains(@class,'buildLink') and normalize-space(.)='" + texto + "']");
    }

    //salario
    public static final Target DROPDOWN_SALARIO = Target.the("Despliega rangos de salario")
            .locatedBy(
                    "//div[contains(@class,'field_select_links') and contains(@class,'small')]//p[normalize-space(.)='Salario']");


    public static Target OPCION_SALARIO(String texto) {
        return Target.the("Opción de salario: " + texto)
                .locatedBy(
                        "//div[contains(@class,'field_select_links') and contains(@class,'open')]//li//span[contains(@class,'buildLink') and normalize-space(.)='" + texto + "']");
    }


    // Identifica localizador de la oferta y ciudad
    public static final Target TITULO_OFERTA_POR_ID = Target.the("Título de la oferta por ID de tarjeta")
            .locatedBy("//*[@id='7A797577CC74F11161373E686DCF3405']/h2/a");

    public static final Target CIUDAD_OFERTA_POR_ID = Target.the("Ciudad/ubicación de la oferta por ID de tarjeta")
            .locatedBy("//*[@id='7A797577CC74F11161373E686DCF3405']/p[2]");

    //interaccion con la oferta
    public static final Target BOTON_TRES_PUNTOS = Target.the("Selecciona los tres puntos de la oferta")
            .locatedBy("(//div[@class='opt_dots'])[2]");

    public static final Target CLICK_APLICAROFERTA = Target.the("click en aplicar")
            .locatedBy("//span[contains(text(),'Aplicar')]");

    //Vista insertar mail
    public static final Target CAMPO_MAIL = Target.the("click en mail")
            .locatedBy("//*[@id='Email']");

       public static final Target MAIL_FALLIDO = Target.the("Muestra mensaje de error si inserta mail sin estructura")
            .locatedBy("//span[@id='Email-error']");

    public static final Target CONTINUAR_MAIL = Target.the("click en continuar vista mail")
            .locatedBy("//button[@id='continueWithMailButton']");


    //Formulario de registro
    public static final Target CAMPO_NOMBRE = Target.the("click en campo nombre")
            .locatedBy("//input[@id='Name']");

    public static final Target CAMPO_APELLIDO = Target.the("click en campo apellido")
            .locatedBy("//input[@id='SurName']");

    public static final Target CAMPO_CONTRASENA = Target.the("click en campo contrasena")
            .locatedBy("//input[@id='Password']");

    public static final Target CAMPO_PUESTOTRABAJO = Target.the("click en campo puesto de trabajo deseado")
            .locatedBy("//input[@id='Cargo']");

    public static final Target DEPARAMENTO_DROPDOWN = Target.the("Abre la lista de despartamentos")
            .locatedBy(
                    "//div[@id='dropdown-locations']");

    public static Target SELECCIONA_DEPARTAMENTO(String departamento) {
        return Target.the("Seleccionar departamento " + departamento)
                .locatedBy("//li[contains(@class,'option') and normalize-space(.)='" + departamento + "']");
    }

    public static final Target BOTON_CONTINUARFINAL = Target.the("click en boton continuar")
            .locatedBy("//button[@id='continueButton']");

}