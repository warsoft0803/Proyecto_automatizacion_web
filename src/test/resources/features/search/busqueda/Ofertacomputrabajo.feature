@all
Feature: Busqueda de oferta de empleo

  @Jobsearch
  Scenario Outline: Busqueda de empleo portal computrabajo
    Given el usuario ingresa al portal computrabajo y selecciona el pais
    When el usuario selecciona el cargo y lugar de busqueda "<cargo>", "<lugar>"
    And el usuario realiza los filtros de busqueda definidos "<experiencia>", "<salario>"
    And el usuario valida los resultados de la lista son correctos y aplica a la oferta
    And el usuario realiza su registro diligencia los campos creacion de nueva cuenta "<correo>", "<nombre>", "<apellido>", "<contrasena>", "<puesto_detrabajo>", "<departamento>"
    Then el usuario debe ver un mensaje error en recaptcha "La validación de Recaptcha ha fallado. Por favor, inténtalo de nuevo."

    Examples:
      | cargo | lugar  | experiencia | salario |correo          | nombre | apellido | contrasena | puesto_detrabajo | departamento |
      | QA    | Guainia| 1 ano       | 700.000 |pruebitas1@test | stiven  | duran     | pruebas12* | QA analyst     | Guainía      |

  @Erroremail
  Scenario Outline: Busqueda de empleo portal computrabajo
    Given el usuario ingresa al portal computrabajo y selecciona el pais
    When el usuario selecciona el cargo y lugar de busqueda "<cargo>", "<lugar>"
    And el usuario realiza los filtros de busqueda definidos "<experiencia>", "<salario>"
    And el usuario valida los resultados de la lista son correctos y aplica a la oferta
    And el usuario diligencia su correo de manera incorrecta "<correo>"
    Then el usuario debe ver un mensaje de error el cual indica "Formato de e-mail incorrecto"

    Examples:
      | cargo | lugar  | experiencia |salario | correo         |
      | QA    | Guaina | 1 ano       | 700.000| pruebitas1@test|


