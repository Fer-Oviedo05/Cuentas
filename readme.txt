# Cuentas


Banco


Permite modelar las operaciones de un banco



# Pre-requisitos

Desacargar proyecto



# Insalaci�n 

Una vez descargado el proyecto, se puede compilar para posteriormente probar su ejecuci�n en la clase "index"



# Ejecutando pruebas
Seleccionando la operaci�n que se desea realizar, se van introduciendo los datos que 
requiera el programa, el programa permite:


- Guardar empleados

- Generar cuentas

- Mostrar las cuentas guardadas

- Hacer b�squedas por: n�mero de cliente, tipo de cuenta, nombre de cliente, n�mero de sucursal, RFC del ejecutivo, 
                       estado de apertura del cliente

- Mostrar ejecutivos

- Buscar empleados por RFC

- Realizar Retiros
- Hacer dep�sitos



# Pruebas

Gener� y guad� un nuevo empleado, con el cu�l cree una nueva cuenta de d�bito Una vez generada la cuenta, comprob� que se hubiera guardado porque posteriormente le ped� al programa que me mostrar� las cuentas guardadas, y revis� que est� se hubiera guardado en el archivo de lectura 
Con la misma cuenta, gener� las b�squedas, y todos los casos fueron exitosos, me mostraba los datos de la cuenta que solicitaba (al buscar con el empleado de "cr�dito", por ejemplo, no me mostraba dicha cuenta, pues en ese caso, el empleado no tiene acceso) 
Permite hacer retiros de la cuentas y los cambios se ven guardados en el archivo de texto Permite hacer dep�sitos, sin embargo estos no son guardados en el archivo de texto Prob� la ejecuci�n de la contrase�a del ejecutivo y al ingresar mal la contrase�a o el RFC el programa nos da otra oportunidad para ingresar correctamente los datos solicitados (se cuenta con m�ximo 3 intentos) 
Al generar empleados, pude comprobar que el programa los guard� al utilizar la opci�n "mostrar ejecutivos" del men�, y al revisar el archivo de texto 
Buscar al ejecutivo por RFC, pude hacer esa cuenta y encontrar al ejecutivo que buscaba, que en el caso de las cuentas, nos arroja la informaci�n de cuenta al ingresar el mismo RFC
En el archivo de texto se van agregando las modificaciones cada que se cierra sesi�n, sin embargo, no se borra la informaci�n antes guardada, por lo "se repite" pero agregando las modificaciones


# Durante el desarrollo


El estado debe de ser escrito en min�sculas 

El ejecutivo tendr� acceso s�lo a las cuentas que le correspondan seg�n el tipo de cuenta que maneje el ejecutivo
La opci�n 
de dep�sito es v�lida, sin embargo el cambio ejecutado no se guarda en los archivos de texto

El archivo de texto "cuentas" se actualiza cada que se cierra sesi�n 



# Construido con

- Java

- Eclipse



Gestor de proyectos: GIT y Github



# Autor

Mar�a Fernanda Morales Oviedo