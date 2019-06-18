# Cuentas

Banco

Permite modelar las operaciones de un banco

# Pre-requisitos
Desacargar proyecto

# Insalación 
Una vez descargado el proyecto, se puede compilar para posteriormente probar su ejecución en la clase "index"

# Ejecutando pruebas
Seleccionando la operación que se desea realizar, se van introduciendo los datos que requiera el programa, el programa permite:
- Guardar empleados
- Generar cuentas
- Mostrar las cuentas guardadas
- Hacer búsquedas por: número de cliente, tipo de cuenta, nombre de cliente, número de sucursal, RFC del ejecutivo, estado de apertura del   cliente
- Mostrar ejecutivos
- Buscar empleados por RFC
- Realizar Retiros
- Hacer depósitos

# Pruebas
Generé y guadé un nuevo empleado, con el cuál cree una nueva cuenta de débito
Una vez generada la cuenta, comprobé que se hubiera guardado porque posteriormente le pedí al programa que me mostrará las cuentas guardadas, y revisé que está se hubiera guardado en el archivo de lectura
Con la misma cuenta, generé las búsquedas, y todos los casos fueron exitosos, me mostraba los datos de la cuenta que solicitaba
(al buscar con el empleado de "crédito", por ejemplo, no me mostraba dicha cuenta, pues en ese caso, el empleado no tiene acceso)
Permite hacer retiros de la cuentas y los cambios se ven guardados en el archivo de texto
Permite hacer depósitos, sin embargo estos no son guardados en el archivo de texto 
Probé la ejecución de la contraseña del ejecutivo y al ingresar mal la contraseña o el RFC el programa nos da otra oportunidad para ingresar correctamente los datos solicitados (se cuenta con máximo 3 intentos)
Al generar empleados, pude comprobar que el programa los guardó al utilizar la opción "mostrar ejecutivos" del menú, y al revisar el archivo de texto
Buscar al ejecutivo por RFC, pude hacer esa cuenta y encontrar al ejecutivo que buscaba, que en el caso de las cuentas, nos arroja la información de cuenta al ingresar el mismo RFC  
En el archivo de texto se van agregando las modificaciones cada que se cierra sesión, sin embargo, no se borra la información antes guardada, por lo "se repite" pero agregando las modificaciones  

# Durante el desarrollo
El estado debe de ser escrito en minúsculas 
El ejecutivo tendrá acceso sólo a las cuentas que le correspondan según el tipo de cuenta que maneje el ejecutivo
La opción de depósito es válida, sin embargo el cambio ejecutado no se guarda en los archivos de texto
El archivo de texto "cuentas" se actualiza cada que se cierra sesión 

# Construido con
- Java
- Eclipse

Gestor de proyectos: GIT y Github

# Autor
María Fernanda Morales Oviedo
