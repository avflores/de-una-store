# DE UNA STORE

ÓRDENES DE COMPRAS.

## Construir el proyecto

El proyecto es contruido con MAVEN.

```console
$ mvn clean install
```

### Levantar el proyecto

```console
$ ./mvn spring-boot:run
```

# APIs


## Creación de clientes
Permite crear los clientes.

Endpoint

```text
POST http://localhost:8080/api/deunastore/v1/clients
```
```console
{
    "document": "1804192837",
    "name": "veronica",
    "lastName": "flores"
}

```
## Actualización de clientes
Permite actualizar los clientes.

Endpoint

```text
PUT http://localhost:8080/api/deunastore/v1/clients/{idClient}
```
```console
{
    "document": "1804192837",
    "name": "anavirginia",
    "lastName": "flores"
}

```
## Buscar de cliente por ID
Permite buscar los clientes los id.

Endpoint

```text
GET http://localhost:8080/api/deunastore/v1/clients/{idClient}
```

## Actualizar stock de productos
Permite actualizar el stock de los producto.

Endpoint

```text
PATCH http://localhost:8080/api/deunastore/v1/products/{idProduct}
```
```console
{
    "stock": 8
}
```
## Buscar producto por ID
Permite buscar los productos por id.

Endpoint

```text
GET http://localhost:8080/api/deunastore/v1/products/{idProduct}
```

## Buscar todos los productos
Permite buscar todos los productos.

Endpoint

```text
GET http://localhost:8080/products/
```


## Creación de Orden
Permite crear órdenes de compras.

Endpoint

```text
POST http://localhost:8080/api/deunastore/v1/clients/{idClient}/orders
```
```console
[
        {
        "idProduct": 1,
        "idStore": 1,
        "amount": 13
    }
]

```

## Test

Se implementa el test para ProductServiceTest.




