# puntosbonus
Una tienda requiere de un programa orientado a objetos que le permita manejar los puntos bonus de sus clientes. 

Todo cliente se registra con un código, nombre y año de registro. La tienda cuenta con clientes regulares que además tienen una cantidad de compras realizadas. Por otra parte, la tienda también cuenta con clientes VIP que además tienen un número de visitas y nivel (“nivel 1”, “nivel 2”, “nivel 3”). 

Para el cálculo de los puntos bonus, se tiene en consideración la cantidad de años de antigüedad como cliente. De la siguiente forma: 

Años de antigüedad     Descripción      Puntos por año 
    x < 2             Menor de 2 años        50 
  2 ≤ x ≤ 5            De 2 a 5 años         110
    x > 5              Mayor a 5 años        170 
 

Para un cliente regular: 

Puntos bonus = total años * puntos por año (según tabla) 
 

Para un cliente VIP: 

Puntos bonus = 15 puntos * número de visitas 

Por temas de seguridad, la información básica de un cliente (código, nombre, año de registro) no puede ser modificada luego de ser registrada. Tampoco se permite la creación de instancias de clientes que no sean regulares o vip. 

Aplicando herencia, polimorfismo y clases abstractas, resolver lo siguiente: 

1. Realizar el modelo de clases usando UML.

2. Crear al menos 4 instancias de clientes y registrarlos en una tienda. Luego listar en consola todos los clientes mostrando toda su información.

3. Implementar un método que le permita a la tienda saber si tiene algún cliente VIP de nivel 1 registrado.  

4. Implementar un método que permita obtener el porcentaje de clientes que se encuentra sobre el promedio de puntos bonus.
