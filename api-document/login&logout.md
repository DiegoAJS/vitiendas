### *`SERVICIOS CONTROL ACCESO`*
- Para todas la rutas se debe enviar en el header el **Content-Type : application/json**
- se debe enviar en el header el **api_token generado** en el login `X-Apikey:{api_token}`
- rutas publicas dominio para ejemplo : http://vitiendas.com/.


### LOGIN [POST]
```url
api/v1/auth/login
```
*Objeto que recibe*
```json
{
	"username":"gthusho",
	"password":"1234"
}
```
*Objeto que devuelve*
```json
{
    "status": 200,
    "data": {
        "id": "eyJpdiI6IlQ2S1wvZFhEaG4z==",
        "username": "gthusho",
        "name": "OpenRed",
        "last_name": "Bolivia",
        "email": "gthusho@gmail.com",
        "cellphone": "6656",
        "img": "http://ivis.test/api/v1/staff/image/eyJpdiI6OTM5ZDgifQ==",
        "ci": "123456798",
        "sex": "Hombre",
        "birth_date": "1986-06-09",
        "occupation": "Soluciones Empresariales",
        "phone": "65656",
        "person_cod": "656565",
        "seller_cod": "666",
        "api_token": "m6U6qwRyDeG7GeCzTdPuJ0FnefDLJZKBLFjk04RCZxMhnAlrinZUcqUcEJeC8LFgTxcnkrS4Vkdi6yJm9oBg9Rqby4pCpUFVhJubwpGWSMkonmSpAdL7YKJGKXEEaFrgiRps8q8ZIZq5EJZfcTztikRywh0Gne9u9nbCb1AjuiVmPEZHkivwQRQ5LXjJKRAI5TwWjRU0IB0IzINmaDuyJaGI32q0",
        "status": "1",
        "rols": [
            {
                "description": "Administrador"
            },
            {
                "description": "Almacenero"
            }
        ],
        "access_permits": [
            {
                "name": "Reporte Especial",
                "id": "40f7c01f4189510031adccd9c604a128adaf9b00"
            },
            {
                "name": "Reporte Especial",
                "id": "40f7c01f4189510031adccd9c604a128adaf9b00"
            }
        ],
        "menu": [
            {
                "id": "356a192b7913b04c54574d18c28d46e6395428ab",
                "title": "Menu",
                "translate": "Menu",
                "type": "group",
                "icon": "apps",
                "children": [
                    {
                        "id": "d30f79cf7fef47bd7a5611719f936539bec0d2e9",
                        "title": "Clientes",
                        "translate": "Clientes",
                        "type": "collapsable",
                        "icon": "group",
                        "children": [
                            {
                                "id": "0716d9708d321ffb6a00818614779e779925365c",
                                "title": "Administrar Clientes",
                                "type": "item",
                                "url": "/ventas/clientes",
                                "icon": "group_add"
                            },
                            {
                                "id": "22d200f8670dbdb3e253a90eee5098477c95c23d",
                                "title": "Administrar Categoria Cliente",
                                "type": "item",
                                "url": "/ventas/cliente/categorias",
                                "icon": "group"
                            }
                        ]
                    },
                    {
                        "id": "1574bddb75c78a6fd2251d61e2993b5146201319",
                        "title": "Ventas",
                        "translate": "Ventas",
                        "type": "collapsable",
                        "icon": "shopping_cart",
                        "children": [
                            {
                                "id": "dbc0f004854457f59fb16ab863a3a1722cef553f",
                                "title": "Registrar Venta",
                                "type": "item",
                                "url": "/ventas/nuevo",
                                "icon": "add_shopping_cart"
                            },
                            {
                                "id": "c8306ae139ac98f432932286151dc0ec55580eca",
                                "title": "Administrar Ventas",
                                "type": "item",
                                "url": "/ventas/administrar",
                                "icon": "create_new_folde"
                            },
                            {
                                "id": "7224f997fc148baa0b7f81c1eda6fcc3fd003db0",
                                "title": "Administrar Cotizaciones",
                                "type": "item",
                                "url": "/ventas/cotizaciones",
                                "icon": "library_add"
                            },
                            {
                                "id": "8b7471f4ae0bf59f5f0a425068c05d96f4801b9e",
                                "title": "Mis Ventas",
                                "type": "item",
                                "url": "/ventas/mis-ventas",
                                "icon": "create_new_folde"
                            },
                            {
                                "id": "2a7541babb57434e5631ffa2b5639e24f8ce84fc",
                                "title": "Administracion Preventa",
                                "type": "item",
                                "url": "/ventas/preventa",
                                "icon": "shopping_cart"
                            },
                            {
                                "id": "e794a80eb109162d579df51db6d52e223bb0e9be",
                                "title": "Control de Salidas",
                                "type": "item",
                                "url": "/ventas/control-salidas",
                                "icon": "shopping_cart"
                            },
                            {
                                "id": "95e815d1541bf6f358cfffbe66ab3af0d0c09d09",
                                "title": "Administrar Promociones",
                                "type": "item",
                                "url": "/promociones",
                                "icon": "redeem"
                            },
                            {
                                "id": "40f7c01f4189510031adccd9c604a128adaf9b00",
                                "title": "Reporte Especial",
                                "type": "item",
                                "url": "/reporte-especial",
                                "icon": "create_new_folde"
                            }
                        ]
                    },
                    {
                        "id": "91032ad7bbcb6cf72875e8e8207dcfba80173f7c",
                        "title": "Compras",
                        "translate": "Compras",
                        "type": "collapsable",
                        "icon": "apps",
                        "children": [
                            {
                                "id": "472b07b9fcf2c2451e8781e944bf5f77cd8457c8",
                                "title": "Administrar Proveedores",
                                "type": "item",
                                "url": "/compras/proveedores",
                                "icon": "developer_board"
                            },
                            {
                                "id": "31bd9b9f5f7b338e41b56183a2f3008b541d7c84",
                                "title": "Administrar Compras",
                                "type": "item",
                                "url": "/compras/administrar",
                                "icon": "card_membership"
                            },
                            {
                                "id": "40bd001563085fc35165329ea1ff5c5ecbdbbeef",
                                "title": "Administrar pedidos",
                                "type": "item",
                                "url": "/pedidos/administrar",
                                "icon": "event_note"
                            }
                        ]
                    },
                    {
                        "id": "450ddec8dd206c2e2ab1aeeaa90e85e51753b8b7",
                        "title": "Productos",
                        "translate": "Productos",
                        "type": "collapsable",
                        "icon": "add_to_queue",
                        "children": [
                            {
                                "id": "d54ad009d179ae346683cfc3603979bc99339ef7",
                                "title": "Administrar Productos",
                                "type": "item",
                                "url": "/productos/administrar",
                                "icon": "assignment_turned_in"
                            },
                            {
                                "id": "b74f5ee9461495ba5ca4c72a7108a23904c27a05",
                                "title": "Administrar Categorias",
                                "type": "item",
                                "url": "/productos/categorias",
                                "icon": "category"
                            },
                            {
                                "id": "b888b29826bb53dc531437e723738383d8339b56",
                                "title": "Administrar Subcategorias",
                                "type": "item",
                                "url": "/productos/subcategorias",
                                "icon": "done_all"
                            },
                            {
                                "id": "1d513c0bcbe33b2e7440e5e14d0b22ef95c9d673",
                                "title": "Administrar Marcas",
                                "type": "item",
                                "url": "/productos/marcas",
                                "icon": "book"
                            },
                            {
                                "id": "76546f9a641ede2beab506b96df1688d889e629a",
                                "title": "Administrar Unidades",
                                "type": "item",
                                "url": "/productos/unidades",
                                "icon": "book"
                            },
                            {
                                "id": "812ed4562d3211363a7b813aa9cd2cf042b63bb2",
                                "title": "Stock",
                                "type": "item",
                                "url": "/productos/stock",
                                "icon": "list_alt"
                            },
                            {
                                "id": "0ca9277f91e40054767f69afeb0426711ca0fddd",
                                "title": "Administrar Ent. & Sal.",
                                "type": "item",
                                "url": "/entrada-salida-productos",
                                "icon": "exposure"
                            },
                            {
                                "id": "008451a05e1e7aa32c75119df950d405265e0904",
                                "title": "Administrar Mov. de Almacen",
                                "type": "item",
                                "url": "/productos/movimientos-almacenes",
                                "icon": "kitchen"
                            }
                        ]
                    },
                    {
                        "id": "601ca99d55f00a2e8e736676b606a4d31d374fdd",
                        "title": "Administracion",
                        "translate": "Administracion",
                        "type": "collapsable",
                        "icon": "business",
                        "children": [
                            {
                                "id": "d0e2dbb0bac1917d360aaf52c01a2a4b669e8cdb",
                                "title": "Administrar Gastos",
                                "type": "item",
                                "url": "/administracion/administrar-gastos",
                                "icon": "local_atm"
                            },
                            {
                                "id": "775bc5c30e27f0e562115d136e7f7edbd3cead89",
                                "title": "Adm. Gastos (Administrador)",
                                "type": "item",
                                "url": "/administracion/administrador-gastos",
                                "icon": "local_atm"
                            },
                            {
                                "id": "8bd7954c40c1e59a900f71ea3a266732609915b1",
                                "title": "Caja Chica",
                                "type": "item",
                                "url": "/administracion/caja-chica",
                                "icon": "attach_money"
                            },
                            {
                                "id": "05a8ea5382b9fd885261bb3eed0527d1d3b07262",
                                "title": "Caja Chica (Administrador)",
                                "type": "item",
                                "url": "/administracion/administrador-caja-chica",
                                "icon": "beenhere"
                            }
                        ]
                    }
                ]
            },
            {
                "id": "4d134bc072212ace2df385dae143139da74ec0ef",
                "title": "Administrador",
                "translate": "Administrador",
                "type": "group",
                "icon": null,
                "children": [
                    {
                        "id": "f6e1126cedebf23e1463aee73f9df08783640400",
                        "title": "Negocios",
                        "translate": "Negocios",
                        "type": "collapsable",
                        "icon": "apps",
                        "children": [
                            {
                                "id": "7b52009b64fd0a2a49e6d8a939753077792b0554",
                                "title": "Mi Empresa",
                                "type": "item",
                                "url": "/mi-empresa",
                                "icon": "business"
                            }
                        ]
                    },
                    {
                        "id": "9109c85a45b703f87f1413a405549a2cea9ab556",
                        "title": "ACL",
                        "translate": "ACL",
                        "type": "collapsable",
                        "icon": "person",
                        "children": [
                            {
                                "id": "77de68daecd823babbb58edb1c8e14d7106e83bb",
                                "title": "Personal",
                                "type": "item",
                                "url": "/acl/personal",
                                "icon": "group"
                            },
                            {
                                "id": "902ba3cda1883801594b6e1b452790cc53948fda",
                                "title": "Administrar Roles",
                                "type": "item",
                                "url": "/acl/roles",
                                "icon": "how_to_reg"
                            },
                            {
                                "id": "bd307a3ec329e10a2cff8fb87480823da114f8f4",
                                "title": "Administrar Usuarios",
                                "type": "item",
                                "url": "/acl/usuarios",
                                "icon": "supervised_user_circle"
                            }
                        ]
                    },
                    {
                        "id": "1f1362ea41d1bc65be321c0a378a20159f9a26d0",
                        "title": "Otros",
                        "translate": "Otros",
                        "type": "collapsable",
                        "icon": "widgets",
                        "children": [
                            {
                                "id": "4d89d294cd4ca9f2ca57dc24a53ffb3ef5303122",
                                "title": "Administrar Cargos",
                                "type": "item",
                                "url": "/otros/cargos",
                                "icon": "subject"
                            },
                            {
                                "id": "d321d6f7ccf98b51540ec9d933f20898af3bd71e",
                                "title": "Administrar Zonas",
                                "type": "item",
                                "url": "/otros/zonas",
                                "icon": "location_on"
                            },
                            {
                                "id": "eb4ac3033e8ab3591e0fcefa8c26ce3fd36d5a0f",
                                "title": "Administrar Ciudades",
                                "type": "item",
                                "url": "/otros/ciudades",
                                "icon": "map"
                            }
                        ]
                    },
                    {
                        "id": "17503a6b2326f09fbc4e3a7c03874c7333002038",
                        "title": "Control Rebates",
                        "translate": "Control Rebates",
                        "type": "collapsable",
                        "icon": "monetization_on",
                        "children": [
                            {
                                "id": "a1422e6a168630cdd214ac5e31ca01ae1bee8d92",
                                "title": "Bonificaciones",
                                "type": "item",
                                "url": "/bonificaciones",
                                "icon": "done_outline"
                            },
                            {
                                "id": "5e796e48332af4142b10ca0f86e65d9bfdb05884",
                                "title": "Compensaciones",
                                "type": "item",
                                "url": "/compensaciones",
                                "icon": "done_outline"
                            },
                            {
                                "id": "6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2",
                                "title": "Objetivos",
                                "type": "item",
                                "url": "/objetivos",
                                "icon": "done_outline"
                            }
                        ]
                    }
                ]
            }
        ],
        "branchOffice": "Almacen Central Rolo´s",
        "warehouse": "Almacen Principal",
        "promotions": 0,
        "mainMenu": [
            {
                "url": "/ventas/clientes",
                "name": "Clientes",
                "icon": "group_add",
                "hash": "0716d9708d321ffb6a00818614779e779925365c"
            },
            {
                "url": "/productos/administrar",
                "name": "Productos",
                "icon": "assignment_turned_in",
                "hash": "d54ad009d179ae346683cfc3603979bc99339ef7"
            },
            {
                "url": "/compras/administrar",
                "name": "Compras",
                "icon": "card_membership",
                "hash": "31bd9b9f5f7b338e41b56183a2f3008b541d7c84"
            },
            {
                "url": "/ventas/nuevo",
                "name": "Ventas",
                "icon": "add_shopping_cart",
                "hash": "dbc0f004854457f59fb16ab863a3a1722cef553f"
            },
            {
                "url": "/administracion/caja-chica",
                "name": "Caja",
                "icon": "attach_money",
                "hash": "8bd7954c40c1e59a900f71ea3a266732609915b1"
            },
            {
                "url": "/ventas/preventa/nuevo",
                "name": "PreVenta",
                "icon": "shopping_cart",
                "hash": "91dfde1d6e005e422f64a59776234f1f4c80b5e4"
            }
        ]
    },
    "message": "Bievenido.."
}
```
### Logout [POST]
```url
api/v1/auth/logout
```
- se debe enviar en el header el **api_token generado** en el login `X-Apikey:{api_token}`
- el logout es un servicio ya que si no damos de baja el token se corre el riesgo a que este sea usado por terceras personas