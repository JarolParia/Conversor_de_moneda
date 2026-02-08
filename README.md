# 💱 Conversor de Monedas - Alura

Aplicación de consola desarrollada en Java que permite realizar conversiones de moneda en tiempo real utilizando la API de ExchangeRate-API.

## 📋 Descripción

Este conversor de monedas permite realizar conversiones entre diferentes divisas latinoamericanas y el dólar estadounidense. La aplicación consulta tasas de cambio actualizadas y mantiene un historial de todas las conversiones realizadas durante la sesión.

## ✨ Características

- 🔄 Conversión en tiempo real entre múltiples monedas
- 📊 Historial de conversiones realizadas
- 🕒 Registro de fecha y hora de cada conversión
- 💰 Soporte para las siguientes divisas:
  - USD (Dólar Estadounidense)
  - COP (Peso Colombiano)
  - ARS (Peso Argentino)
  - BRL (Real Brasileño)

## 🛠️ Tecnologías Utilizadas

- Java 17+
- Gson (para manejo de JSON)
- HttpClient (para peticiones HTTP)
- ExchangeRate-API

## 📦 Dependencias
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

## 🚀 Instalación

1. Clona este repositorio:
```bash
git clone https://github.com/tu-usuario/conversor-monedas-alura.git
```

2. Obtén una API Key gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/)

3. Configura tu API Key en la clase `ConversorMoneda.java`:
```java
private static final String API_KEY = "TU_API_KEY_AQUI";
```

4. Compila y ejecuta el proyecto:
```bash
javac Main.java
java Main
```

## 💻 Uso

Al ejecutar la aplicación, verás un menú interactivo con las siguientes opciones:
```
1) Dólar --> Peso Colombiano
2) Peso Colombiano --> Dólar
3) Dólar --> Peso Argentino
4) Peso Argentino --> Dólar
5) Dólar --> Real Brasileño
6) Real Brasileño --> Dólar
7) Mostrar historial de conversiones
8) Salir
```

Simplemente selecciona la opción deseada, ingresa la cantidad a convertir y obtén el resultado instantáneamente.

## 📁 Estructura del Proyecto
```
src/
├── Main.java
└── com/alura/reto/models/
    ├── Moneda.java
    ├── Conversiones.java
    └── ConversorMoneda.java
```

### Clases principales:

- **Moneda**: Record que almacena la información de la tasa de cambio
- **Conversiones**: Record que registra cada conversión realizada
- **ConversorMoneda**: Clase que maneja la lógica de conexión con la API y cálculo de conversiones
- **Main**: Clase principal con el menú interactivo

## 🔍 Ejemplo de Uso
```
Ingrese la cantidad que desea convertir
100

100.00 USD equivalen a 437500.00 COP
```

## 📝 Notas

- Las conversiones se realizan con las tasas de cambio más actualizadas
- El historial se mantiene solo durante la ejecución del programa
- Se requiere conexión a internet para consultar las tasas de cambio

## 👨‍💻 Autor

Desarrollado por Jarol Paria como parte del challenge de Alura Latam


---

⭐ Si te gustó este proyecto, no olvides darle una estrella en GitHub
