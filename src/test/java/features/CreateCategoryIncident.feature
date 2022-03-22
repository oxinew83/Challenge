Feature: Creo una categoria de Incidencia

  Scenario: Alta de una Categoria de Incidencia
    Given Me logeo al sitio con el usuario "superadmin"
    And Ingreso en el menu "CONFIGURACION"
		And Ingreso SubMenu "CATOLOGO"
		And Seleccionamos Categoria
		And Completamos la Carga
