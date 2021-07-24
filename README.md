# Choucair

Actualmente el programa ejecuta correctamente unas pruebas propias, ya que las pruebas desarrolladas
en el curso, no se puede ejecutar porque mi usuario no tiene los permisos necesarios para acceder
a varias paginas internas de la web.

Pasos para que ejecuten completamente las pruebas del curso:

1. En archivo src/test/resources/features/academyChoucair.feature:
	- Cambiar "1033776369" por un usuario con permisos necesarios para ejecutar prueba del curso
	- Cambiar "Choucair2021*" por la contraseña del usuario ingresado anteriormente

2. En archivo src/main/java/tasks/Search:
	- Eliminar comentarios de las lineas 21,22 y 23
	- Comentarear la linea 24

3. En archivo src/main/java/userinterface/SearchCoursePage:
	- Comentarear la linea 8

4. En archivo src/test/java/stepdefinitions/ChoucairAcademyStepDefinitions:
	- Eliminar comentario de la linea 35
