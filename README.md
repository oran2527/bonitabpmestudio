# BONITABPM

## QUE ES ?

Plataforma para creacion de aplicaciones en BPM(Bussiness Process Management) con
estandares BPMN 2.0.

## ESTRUCTURA

### Bonita Studio

Para la fase de Desarrollo de los proyectos

### Bonita Runtime

Para correr varios procesos con la maquina BPM y las aplicaciones
Tomcat, aplicaciones desarrolladas en Bonita, Bonita Engine y base de datos h2.

##### Bonita Administrator Application

Para instalar, desplegar y administrar procesos

##### Bonita Super Administrator

Configurar el ambiente Bonita Runtime con modelos de bases de datos del negocio
y aplicaciones

##### Directorio de Aplicacion 

Contiene los usuarios de Bonita y los accesos a las aplicaciones que poseen

### Bonita Continous Delivery

Para facilitar los despliegues constantes de los proyectos de un ambiente a otro.
Solamente si existe subscripcion es decir cuentas premium


## PARA QUE SIRVE ?

* Modela tus procesos con ayuda de la norma BPMN 2.0 (Business Process Model and Notation). 

* Diseña los procesos gracias a una interfaz grafica que permite diagramar. 

* Gestiona datos completos a través del gestor de datos de negocio. Donde tienes menores tiempos de carga, mejor visualización en forma de formularios y ausencia de interrupciones.

* Conéctate fácilmente a los sistemas de información (mencionados anteriormente)
Crea atractivas interfaces de usuario, las cuales son extensibles y te permiten crear tus propios widgets de forma sencilla.

* Ejecuta tareas y administra procesos usando el portal Bonita BPM
Crea interfaces de usuario final cuando el portal predefinido no te ofrezca lo que deseas.

* Un diseño más rápido de interfaces

* Conectividad con los sistemas de su empresa

* Pruebas e integración continua

* Desarrollo en equipo colaborando en las fases de desarrollo

* Gestión de identidades

* Personalización del portal

* Gestión de privilegios de los usuarios

* Tareas Ad-hoc

* Conexiones con sistemas de informacion como CRM, ECM, ERP, bases de datos, plataformas sociales, servicios web.


## LINK PARA DOCUMENTACION BONITA COMMUNITY
[Documentacion Bonita](https://documentation.bonitasoft.com/bonita/latest/)

## LINK INSTALACION BONITA STUDIO

[Descargar Bonita Studio](https://www.bonitasoft.com/downloads)

## PASOS PARA SUBIR PROYECTO BONITABPM EN REPOSITORIO GITHUB

### Paso 1

Clic en la opcion del menu superior llamado "Equipo".

![](/img/imagen1.png)

### Paso 2

Clic en la opcion "Git" y luego clic en la opcion "Compartir con Git".

![](/img/imagen2.png)

### Paso 3

Se desplegara una nueva ventana. Dar clic en boton "Compartir". 

![](/img/imagen3.png)


### Paso 4

Se desplegara una nueva ventana. Dar clic en boton "Commit y push". Se abrira una nueva ventana.

![](/img/imagen4.png)

![](/img/imagen5.png)


### Paso 5

Crear un repositorio en Github para guardar el proyecto BonitaBPM.

[video para creacion de repositorio github](https://www.youtube.com/watch?v=dnxdIzF8p3k)

### Paso 6

Copiar la url del repositorio de Github creado para guardar el proyecto BonitaBPM.

![](/img/imagen6.png)


### Paso 7

Pegar la informacion copiada en el paso 6 en el campo "URI" de la ventana de BonitaBPM del paso 4. Esto autocompletara los campos "Nodo" y "Ruta del repositorio".

Los campos "Protocolo" y "Puerto" no deben ser diligenciados.

Los campos "Usuario" y "Contraseña" son el usuario y contraseña de la cuenta de Github y son opcionales.

Clic en boton "Siguiente".


![](/img/imagen7.png)

### Paso 8

Dejar las opciones predefinidas y dar clic en boton "Siguiente".

![](/img/imagen8.png)

### Paso 9

Digitar el usuario y la contraseña de Github en la nueva ventana.

![](/img/imagen9.png)

### Paso 10

Si no se genera error ir al paso 21.

Si te genera el siguiente error:

![](/img/imagen10.png)

### Paso 11


Ingresar a Github y dar clic en opcion "Settings".

![](/img/imagen11.png)

### Paso 12


Clic en "Developer Settings".

![](/img/imagen12.png)

### Paso 13


Clic en "Personal access tokens".

![](/img/imagen13.png)

### Paso 14

Clic en "Tokens (classic)".

![](/img/imagen14.png)

### Paso 15

Clic en "Generate new token".

![](/img/imagen15.png)

### Paso 16

Clic en "Generate new token (classic)".

![](/img/imagen16.png)

### Paso 17

Coloque un nombre al token en el campo "Note" y seleccione todos las opciones.

![](/img/imagen17.png)

### Paso 18

Clic en el boton verde de abajo "Generate token".

![](/img/imagen18.png)

### Paso 19

Clic en los cuadritos al lado derecho del token para copiar el token.

![](/img/imagen19.png)

### Paso 20

Repetir el paso 9 pero esta vez en el campo "contraseña" utilizar el token del paso 19.

### Paso 21

Se abre una nueva ventana. Dar clic en boton "Finalizar".

![](/img/imagen20.png)

### Paso 22

Repetir el paso 20

### Paso 23

Ir a Github y dar clic en el boton "main".

![](/img/imagen21.png)

### Paso 24

Dar clic en opcion "master".

![](/img/imagen22.png)

### Paso 25

Se visualizaran los archivos del proyecto BonitaBPM.

![](/img/imagen23.png)



## PASOS PARA CLONAR Y UTILIZAR REPOSITORIO CON PROYECTO BONITABPM

### Paso 1

Clic en la opcion del menu superior llamado "Equipo".

![](/img/imagen1.png)

### Paso 2

Clic en la opcion "Git" y luego clic en la opcion "Clonar".

![](/img/imagen24.png)

### Paso 3

Copiar la url del repositorio de Github que contiene el proyecto BonitaBPM.

![](/img/imagen6.png)


### Paso 4

Pegar la informacion copiada en el paso 3 en el campo "URI" de la ventana de BonitaBPM. Esto autocompletara los campos "Nodo" y "Ruta del repositorio".

Los campos "Protocolo" y "Puerto" no deben ser diligenciados.

Los campos "Usuario" y "Contraseña" son el usuario y contraseña o el token de la cuenta de Github y son opcionales.

Clic en boton "Siguiente".


![](/img/imagen7.png)

### Paso 5

Seleccionar unicamente la opcion "master" y dar clic en el boton "Finalizar".

![](/img/imagen25.png)


### Paso 6

Una vez se ha descargado el proyecto, dar clic en el simbolo ">" de la opcion "Modelo de Datos de Negocio" del explorador de proyectos y luego clic en bom.xml.

![](/img/imagen26.png)

### Paso 7

Dar clic en boton "Desplegar".

![](/img/imagen27.png)






