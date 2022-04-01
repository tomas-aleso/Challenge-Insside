# Challenge

## APIs

### Orden de compra
- GET http://localhost:8080/api/orden-de-compra
- GET http://localhost:8080/api/orden-de-compra/{numeroDeOrden}
- DELETE http://localhost:8080/api/orden-de-compra/{numeroDeOrden}
- POST http://localhost:8080/api/orden-de-compra
    - body: {
    "codigosTelefonos":[string],
    "clienteDNI": int,
    "numeroDeOrden": int
}

### Telefono

- GET http://localhost:8080/api/telefonos

### Cliente

- GET http://localhost:8080/api/clientes