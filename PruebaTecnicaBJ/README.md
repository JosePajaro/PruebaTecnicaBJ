Este es el desarrollo de una prueba básica para un desarrollador Backend Junior.
La prueba consiste en una aplcación de tareas administrada aplicando la metodologia CRUD.

Esta aplicasión fue desarrollada con Spring Boot haciendo uso de una base de datos integrada en la cual se utilizo h2.

...
Debes ejecuta la aplicación y abrir el puerto 8080 para acceder en la base de datos h2
	usuario: sa
	contraseña: 
...
Desde postman podrar consumir la API Rest utilizando los siguientes EndPoint
EndPoint para la API Rest

	Crear una tarea
	Tipo de solicitud:
		Post
	Url:
		localhost:8080/api/notas
	Body - raw:
		{
		"estado":0,
		"nota":"Tarea pendiente"
		}


	Consultar tareas
	Tipo de solicitud:
		Get
	Url:
		localhost:8080/api/notas/Nota
	
	
	Consultar una tarea
	Tipo de solicitud:
		Get
	Url:
		localhost:8080/api/notas/Nota/'# id de la tarea que deseas consultar'

	
	Actualizar una tarea
	Tipo de solicitus:
		Put
	Url:
		localhost:8080/api/notas/Nota
	Body - raw:
		{
		"id":'# id'
		"estado":'# estado deseado',
		"nota":'Cambiar si desea'
		}


	Eliminar una tarea
	Tipo de solicitud:
		Delete
	Url:
		localhost:8080/api/notas/Nota/'# id de la tarea que deseas eliminar'

