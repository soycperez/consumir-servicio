# **Consumir-Servicio**

Se busca consumir el Servicio Rest de la siguiente URI.
- https://serviciosdigitalesplus.com/servicio/servicio.php

Donde **tipo** puede tomar tres valores, para Consultar, Crear, Editar y Eliminar.

El cual recibe un Objecto **Dato** y tiene como parametros: 

- id
- nom
- app
- tel
- clave (El cual es la Matricula del alumno)

Donde el atributo **tipo** puede tomar solo tres valores
## **Consultar**
- Si el valor es **1** se debe añadir la *clave* del Alumno. Quedando 
de la siguiente maneroa: <br> **servicio.php?tipo=1&clave=201855555**

## **Crear**
- Si el valor es **2** se deben enviar los demás atributos, para al ultimo añadir la *clave* del Alumno. Quedando de la siguiente manera: <br> **?tipo=2&nom=prueba&app=prueba&tel=2222222222&clave=201855555**

## **Modificar**
- Si el valor es **3** se deben enviar los demás atributos, ya modificados, a demás se debe especificar la **id** del usuario a modificar. Quedando de la siguiente manera: <br> **?tipo=3&id=01&nom=test&app=test&tel=2222222222&clave=201855555**

## **Eliminar**
- Si el valor es **4** se deben enviar los demás especificando la **id** del usuario a eliminar junto con la clave **clave** del alumno para poder eliminar el registo. Quedando de la siguiente manera: <br>**?tipo=4&id=01&clave=201855555**

La **clave** sirve para identificar el bloque de registro que se han hecho a su nombre, por lo que con ella se pueden realizar las operaciones. Y el **id** es auto incrementable.

**NOTA:** En cada consulta o petición se retorna el JSON estructurado en un vector **dato**, por que se debe deserealizar antes de acceder a los atributos mencionados anteriormente.

# **Desarrollo del consumo**

El programa esta realizado en la siguiente arquitectura:
- Java 8 con JFrames.
- Maven con dependencia: JSON Java.