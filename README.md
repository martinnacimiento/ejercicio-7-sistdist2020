# Algoritmo de Cristian para sincronizacion de relojes
Este repositorio consiste en albegar el codigo del ejercicio 7 del trabajo practico de tiempo de la catedra sistemas distribuidos.

## Integrantes
- Nacimiento, Francisco Martin.
- Senghaas, Evelin Yaneth.

## Requisitos
- Docker
- Docker-Compose

## Pasos
1. Dale una estrellita⭐ al repo (si no no te va a funcionar).
2. Clona el repositorio.
3. En el directorio en donde clono el repo ejercute en su consola `sh init.sh`. Espere que el comando prepare el proyecto.
4. En el mismo directorio ejecute `docker-compose up` y podra ver una prueba de un servidor y un cliente.
5. Para mas clientes, puede utilizar el siguiente comando `docker-compose up --scale client=n` donde *n* es el numero de clientes que desee.