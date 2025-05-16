<h1 align="center">:money_with_wings: Conversor de monedas :money_with_wings:</h1>

![Imagen representativa del conversor.](https://github.com/user-attachments/assets/b2214ddd-11af-41fc-839d-204f40aaeb93) 

<h2>¿Que es?</h2>
<h4>El Conversor de modenas puede convertir la moneda que necesites a la moneda que decees, ingresando la cantidad deceada. Los datos de la monedas se actualizan todos los días.</h4>
<h3>Ejemplo:</h3>

![Captura de pantalla 2025-05-16 112309](https://github.com/user-attachments/assets/5046fc29-3e03-486d-8643-e363201ee3a4)

<h4>Como pordemos observar en la imagen se le ha pedido que convierta sierta cantidad de Dolares (USD) a pesos Colombianos (COP).</h4>
<h3>:eye:¿Que muestra la imagen?</h3>
<h4>Podemos observar que la salida del programa muestra 3 puntos importantes:</h4>

- `Línea 1`: muestra el tipo de moneda que se solicito (USD) y el tipo de moneda a la cual se quiere hacer la conversión (COP).
- `Línea 2`: muestra la equivalencia de 1 cantidad, al tipo de moneda que se va ha convertir.  
- `Línea 3`: muestra el resultado de la conversión. La cantidad de dinero ingresada (USD) y la equivalencia de ese dinero a la moneda (COP).

<h3>:hammer: ¿Cómo se hizo la petición?</h3>
<h4>Para realizar la petición al programa debemos Ingresar los siguiente:</h4>

- Elegir la opción que deceamos realizar (1, 2...) e ingresarla en el campo "Ingresar".
- Ingresar la cantidad que deceamos convertir (2000) e ingresarla en 3l campo "Ingrese la cantidad que decea convertir".

![Captura de pantalla 2025-05-16 124746](https://github.com/user-attachments/assets/2663b663-d519-4c66-93ea-f384254130cb)

<h2>:hammer_and_pick: ¿Cómo funciona el Conversor de monedas?</h2>
<h4>El programa cuenta con las siguientes clases:</h4>

- `DatosMonedaConvertir`: se encarga de recibir los datos ingresados por el usuario y genera la URL correcta. Esta URL tiene la moneda que se quiere convertir (USD), la moneda a la cual se decea convertir (COP) y la cantidad. Retorna la URL.
- `ConsultarAPI`: se encarga de hacer la socilicitud a la API. Toma la URL y la usa para realizar la petición. Recibe la respuesta del servidor en un formato "json", el cual contiene los datos necesarios de la conversión. Retorna los datos.
- `MonedaExchangeRateAPI`: es un "record" que toma los datos que se necesitan de "json".
- `ConvertirJsonGson`: se encarga de convertir los datos "json" a "gson". Toma el json y agrega los datos a las variables del record "MonedaExchangeRateAPI".
- `DatosUsuarioMoneda`: se encarga de tomar los datos del "record". Organiza los datos y los muestra al usuario (salida del programa).
- `Principal`: se encarga de unir todo lo anterior. Por medio de un bucle muestra un Menu y pide los datos al usuario (opción y cantidad) con la clase Scanner. Dependiendo de la opción elegida, se asignan valores a varibales. Finalmente se crean objetos de cada una de las clases y se pasan los datos requeridos para cada una de estas.

<h4>Como podemos entender, cada clase cumple una función especifica dentro del programa. Y cada una de estas unidas, dan funcionamiento al Conversor de monedas.</h4>
<h4>Nota: La conversion de la moneda la realiza la web, por lo que no es necesario aplicar calculos.</h4>
