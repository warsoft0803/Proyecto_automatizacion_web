@all
Feature: Busqueda de oferta de empleo

  @Jobsearch
  Scenario Outline: Busqueda de empleo portal computrabajo
    Given "user" ingresa al portal computrabajo
    When selecciona el pais correspondiente
    When el usuario selecciona el cargo y lugar de busqueda cargo "QA" lugar "Guainia"
    And el usuario realiza los filtros de busqueda definidos "<experiencia>", "<salario>"
    And el usuario valida los resultados de la lista son correctos y aplica a la oferta
    And el usuario realiza su registro diligencia los campos creacion de nueva cuenta "<correo>", "<nombre>", "<apellido>", "<contrasena>", "<puesto_detrabajo>", "<departamento>"
    Then el usuario debe ver un mensaje error en recaptcha "La validación de Recaptcha ha fallado. Por favor, inténtalo de nuevo."

    Examples:
      | experiencia |  salario            |correo               | nombre | apellido | contrasena | puesto_detrabajo | departamento |
      |  1 año      |  Menos de $ 700.000 |pruebitas11@test.com | stiven  | duran   | pruebas12* | QA analyst       | Guainía      |

  @Erroremail
  Scenario Outline: Error al registrar usuario nuevo mail
    Given "user" ingresa al portal computrabajo
    When selecciona el pais correspondiente
    When el usuario selecciona el cargo y lugar de busqueda cargo "QA" lugar "Guainia"
    And el usuario realiza los filtros de busqueda definidos "<experiencia>", "<salario>"
    And el usuario valida los resultados de la lista son correctos y aplica a la oferta
    And el usuario realiza su registro diligencia los campos creacion de nueva cuenta "<correo>", "<nombre>", "<apellido>", "<contrasena>", "<puesto_detrabajo>", "<departamento>"
    Then el usuario debe ver un mensaje de error en correo el cual indica "Formato de e-mail incorrecto"

    Examples:
      | experiencia |  salario            | correo    | nombre | apellido | contrasena | puesto_detrabajo | departamento |
      |  1 año      |  Menos de $ 700.000 | prueba    |        |          |            |                  |              |


