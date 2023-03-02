# ADD_2.2
Acceso a Datos 2.2

# Enunciado

Opción 2:

Continúa con las modificaciones sobre la Práctica 2.1 para que, en lugar de almacenar y
recuperar los datos de los usuarios de una base de datos MySQL usando el conector
JDBC, lo haga utilizando Hibernate para realizar las operaciones CRUD sobre dicha base
de datos.

Resto de requisitos:

Además de los requisitos descritos anteriormente, en el momento del alta se almacenará
la provincia como un nuevo dato del usuario. El programa deberá mostrar las provincias
españolas ordenadas alfabéticamente, dando opción al usuario a seleccionar una de
ellas a través de un menú numérico (un número delante de cada provincia). Los nombres
de las provincias deberán extraerse de la siguiente URL haciendo uso de la librería Gson:
https://raw.githubusercontent.com/IagoLast/pselect/master/data/provincias.json
A la hora de la entrega, se creará una carpeta /sql en el raíz del proyecto incluyendo el
script de exportación de la base de datos, tablas y datos iniciales necesarios para el
manejo de la aplicación (p22.sql), así como el esquema entidad-relación de dicha base
de datos.

Los datos de conexión a utilizar para la base de datos deberán ser:

● servidor: localhost

● base de datos: p22

● usuario: root (sin contraseña)

Como ampliación (opcional), se propone incluir además en el alta un nuevo dato con el
municipio. Para ello, una vez seleccionada la provincia, se mostrarán únicamente los
municipios de dicha provincia, dando opción al usuario a seleccionar uno de ellos a
través de un menú numérico (un número delante de cada municipio). 
Los nombres de los municipios correspondientes a la provincia, seleccionada previamente, deberán extraerse
de la siguiente URL haciendo uso de la librería Gson:
https://raw.githubusercontent.com/IagoLast/pselect/master/data/municipios.json

# Desarrollo

- Todos los usuarios de prueba tienen como contraseña: 1234 (encriptada)
- Las provincias se muestran con un select (dropdown), y aparecen ordenadas alfabéticamente
- No se ha realizado la ampliación de municipios
