# Gradle Convention Plugin

¡Hola!
En este pequeño ejemplo verán cómo crear su propio Convention Plugin para minimizar el boilerplate de su código y mejorar si legibilidad así como también la reutilización de código.


# Uso

## Pre-Requisitos
Para poder probar este ejemplo necesitas **JAVA 17** y con **Kotlin** (por supuesto xD) 

## Puesta en marcha

- Limpiar versiones previas con el comando :gradle:libraryplugin:clean
- Generar un **Build** del proyecto con :gradle:libraryplugin:clean
- **Publicar** la biblioteca con :gradle:libraryplugin:publish

	> No hay problema si corres estos comandos desde la interfaz visual de tu IDE de preferencia.

## Referenciar repositorio
Recuerda que una vez publicado el plugin (De forma local al menos) debes hacer referencia a este en el proyecto donde deseas consumirlo:

```
pluginManagement {
  repositories {
	. . . 
	maven("YOUR_PROJECT_LOCATION/libraryplugin/build/repo-plugin")
  }
}
```

# ¿Problemas?

Si tienes alguna duda o inconveniente con el repo, no dudes en escribirme a mis redes: [Tohure Social](https://bio.link/tohure).
