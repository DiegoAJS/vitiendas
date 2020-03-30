### *`RESPUESTAS Y MANEJO DE ERRORES REST`*
- Para todas la rutas se debe enviar en el header el **Content-Type : application/json**
- se debe enviar en el header el **api_token generado** en el login `X-Apikey:{api_token}`
- rutas publicas dominio para ejemplo : http://vitiendas.com/.


### PETICION CORRECTA *`[STATUS 200]`*
-- cuando obtienes datos de una paginacion,listado de datos.
### OPERACION CORRECTA EDICION DE DATOS *`[STATUS 201]`*
-- Cuando se realiza una operacion de actualizacion de datos sea total o parcial

### ERROR DE VALIDACION *`[STATUS 422]`*
-- cuando algun dato no cumple con los criterios de validacion
*Objeto de ejemplo*
```json
{
    "customer_category_id": [
        "El campo customer category id es obligatorio."
    ],
    "cities_id": [
        "El campo cities id es obligatorio."
    ],
    "zone_id": [
        "El campo zone id es obligatorio."
    ],
    "nit": [
        "nit ya ha sido registrado."
    ]
}
```
### ERROR DE VALIDACION *`[STATUS 500]`*
-- error de codigo php, error en la transaccion o otra excepcion contactarse con guido.
### ERROR BADREQUEST *`[STATUS 400]`*
-- Cuando no se realiza una operacion debido a que no existen los datos, por ejemplo tratar de actualizar a un id que no existe, iniciar sesion con credenciales que no existen

### ESTRUCTURA DE RESPUESTAS EN GENERAL
-- error de codigo php, error en la transaccion o otra excepcion contactarse con guido.
```json
{
    "status": 400,
    "data": null,
    "message": "Credenciales incorrectas"
}
```
--ESTATUS: se te devuelve el mismo estado que q las variables globales del servicio para manejo de mensajes
--DATA: aqui siempre te llegaran los datos
--MESSAGE: mensajes exitoso o de error aqui
### ESTRUCTURA SERVICIO PAGINADO

```json
{
    "status": 200,
    "message": null,
    "data": {
        "payload": [
            {
                "id": "eyJpdiI6IitWNGI1YjNjZGY1ZDczMmIifQ==",
                "customer_category_id": "1",
                "customer_category": "NINGUNO",
                "cities_id": "1",
                "city": "SUCRE",
                "zone_id": "0",
                "zone": "NINGUNO",
                "name": "Barrientos",
                "nit": "5679778",
                "activity": null,
                "contact": null,
                "cellphone": null,
                "email": null,
                "address": null,
                "code": "NN0000005",
                "lat": "0",
                "long": "0",
                "birth_date": null,
                "limit_credit": "0.0000"
            }
        ],
        "lastPage": 16,
        "total": 16
    }
}
```
--En los servicios paginados siempre la informacion esta dentro de payload, en lastPage te llega la ultima pagina  y en total el numero de total de registros:
--filter=&sortOrder=desc&pageNumber=1&pageSize=1 <<< parametros que reciben todos los servicios paginados (dependiedno el servicio pueden ser mas pero estos son los basicos que si o si los tienen todos los paginados)
--FILTER= recibe la palabra a filtrar
--SORTORDER= RECIBE EL ORDEN PARA LOS DATOS
--PAGENUMBER= EL NUMERO DE PAGINA QUE REQUIERES
--PAGESIZE= EL NUMERO DE DATOS QUE QUIERES POR PAGINA