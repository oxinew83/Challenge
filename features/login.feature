Feature: Challenge

  Scenario: Ingreso en Ebay busco Pilas y muestro por consola el total de resultados

    Given Al Abrir la url <pagina>
    When Ingreso en el campo Search la palabra <valor>
    Then Imprimo por consola el numero de items que devuelve la busqueda

    Examples:
      | pagina              | valor |
      | http://www.ebay.com | Pilas    |