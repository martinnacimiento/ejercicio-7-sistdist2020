set - e

# compilar proyecto y genera los JARS con sus depencias
docker run -it --rm -v "$(pwd)":/workspaces/ejercicio7 \
    -w /workspaces/ejercicio7 maven:3.6.3-openjdk-15 sh build.sh