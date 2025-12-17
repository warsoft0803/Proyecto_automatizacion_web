# 🧪 Proyecto de Automatización Web

## Serenity BDD + Cucumber + Screenplay (Java)

Este repositorio contiene un proyecto de **automatización de pruebas web** implementado bajo el **patrón de diseño Screenplay**, utilizando **Serenity BDD**, **Cucumber** y **Java**.
El objetivo es validar funcionalidades del portal **Computrabajo**, aplicando buenas prácticas de automatización, BDD y arquitectura limpia.

---

## 📌 Tecnologías Utilizadas

* **Java:** 17 o superior
* **Apache Maven:** 3.8+
* **Serenity BDD**
* **Cucumber**
* **JUnit 4**
* **Selenium WebDriver**
* **Patrón Screenplay**
* **Gherkin (BDD)**
* **Git / GitHub**

---

## 🧠 Patrón de Diseño: Screenplay

El proyecto está construido bajo el **patrón Screenplay**, el cual modela las pruebas desde la perspectiva del usuario (**Actor**), mejorando la legibilidad, reutilización y mantenibilidad del código.

### Componentes principales

* **Actors:** Representan a los usuarios que interactúan con la aplicación.
* **Tasks:** Acciones que realiza el actor sobre el sistema.
* **Questions:** Validaciones o consultas del estado de la aplicación.
* **UI:** Mapeo centralizado de los elementos de la interfaz.
* **Step Definitions:** Conectan los escenarios Gherkin con las Tasks.
* **Runners:** Configuran la ejecución de Cucumber con Serenity.

---

## 📂 Estructura del Proyecto

```text
src
├── main
│   └── java
│       └── testing
│           ├── models
│           ├── questions
│           │   └── ofertacomputrabajo
│           ├── task
│           │   └── ofertacomputrabajo
│           ├── ui
│           │   └── ofertacomputrabajo
│           └── utils
│
└── test
    ├── java
    │   └── testing
    │       ├── runners
    │       │   └── CucumberTestSuiteTest.java
    │       ├── stepdefinitions
    │       │   ├── hooks
    │       │   └── ofertacomputrabajo
    │
    └── resources
        ├── features
        │   └── search
        │       └── busqueda
        │           └── Ofertacomputrabajo.feature
        ├── logback-test.xml
        └── serenity.conf
```

---

## 🧪 Escenarios BDD (Gherkin)

Los escenarios están escritos en **lenguaje Gherkin**, facilitando la comprensión del negocio y la colaboración entre QA, desarrollo y stakeholders.

Ejemplo:

```gherkin
Feature: Búsqueda de ofertas en Computrabajo

  Scenario: Registro de nueva cuenta y búsqueda de oferta
    Given que el usuario ingresa al portal Computrabajo
    When realiza el registro de una nueva cuenta
    And busca una oferta de empleo
    Then valida que la oferta sea visible
```

---

## ▶️ Runner de Ejecución

El proyecto utiliza **Serenity con Cucumber y JUnit 4** para la ejecución de los escenarios:

```java
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = "src/test/resources/features/search/busqueda/Ofertacomputrabajo.feature",
        glue = "testing.stepdefinitions"
)
public class CucumberTestSuiteTest {
}
```

---

## ⚙️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

### ✅ Java

* Java **17 o superior**

Verificar instalación:

```bash
java -version
```

---

### ✅ Maven

* Apache Maven **3.8 o superior**

Verificar instalación:

```bash
mvn -version
```

---

## 🔧 Configuración de Variables de Entorno (Windows)

### JAVA_HOME

```text
JAVA_HOME=C:\Program Files\Java\jdk-17
```

Agregar al `Path`:

```text
%JAVA_HOME%\bin
```

---

### MAVEN_HOME

```text
MAVEN_HOME=C:\apache-maven-3.9.11
```

Agregar al `Path`:

```text
%MAVEN_HOME%\bin
```

🔁 Cierra y vuelve a abrir la consola para aplicar los cambios.

---

## 🚀 Ejecución del Proyecto

Ubícate en la raíz del proyecto y ejecuta:

### ▶️ Ejecutar pruebas y generar reporte Serenity

```bash
mvn clean verify
```

### ▶️ Generar solo el reporte (si ya existen resultados)

```bash
mvn serenity:aggregate
```

---

## 📊 Reporte Serenity

El reporte se genera automáticamente en la siguiente ruta:

```text
target/site/serenity/index.html
```

Abre el archivo `index.html` en el navegador para visualizar los resultados, métricas y evidencias de ejecución.

---

## ✅ Buenas Prácticas Implementadas

* Uso correcto del patrón Screenplay
* Separación clara de responsabilidades
* Escenarios BDD legibles y mantenibles
* Reutilización de Tasks y Questions
* Reportes automáticos con Serenity
* Código limpio y organizado

---

## 🔮 Posibles Mejoras

* Ejecución por tags (`@smoke`, `@regression`)
* Integración con CI/CD (GitHub Actions / Jenkins)
* Ejecución en paralelo
* Manejo avanzado de datos con DataTables
* Integración con BrowserStack o Selenium Grid

---

## 👤 Autor

**Brayam Estiven Durán Cardona**
Ingeniero de Sistemas – QA Automation
Especializado en Serenity BDD, Cucumber y patrón Screenplay
