# 🛡️ Proyecto QA: Validador de Registro con JUnit 5

![Java](https://img.shields.io/badge/Java-22-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit5-5.10.0-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

Este repositorio contiene una solución práctica de **Aseguramiento de la Calidad (QA)** centrada en el desarrollo de pruebas unitarias. El objetivo es validar la lógica de negocio de un módulo de registro de usuarios.

## 📋 Descripción del Proyecto

El sistema se compone de una clase núcleo (`ValidadorRegistro.java`) que procesa cuatro parámetros críticos: nombre, contraseña, email y edad. Se ha implementado una suite de pruebas para asegurar que el sistema bloquee entradas inválidas y acepte correctamente los límites fronterizos.

### Reglas de Negocio Validadas:
* **Nombre:** No nulo y con contenido.
* **Contraseña:** Mínimo de 8 caracteres.
* **Email:** Debe contener el carácter `@`.
* **Edad:** El usuario debe tener al menos 16 años.

---

## 🧪 Plan de Pruebas (Test Suite)

La clase `ValidadorRegistroTest` cubre los siguientes escenarios mediante aserciones de JUnit 5:

| ID | Caso de Prueba | Entrada (Input) | Resultado | Assertion |
|:---|:---|:---|:---:|:---:|
| **0** | Nombre estándar | `"Carlos"` | ✅ Pasa | `assertTrue` |
| **1** | Nombre vacío | `""` | ❌ Bloqueado | `assertFalse` |
| **2** | Password (Límite 8) | `"12345678"` | ✅ Pasa | `assertTrue` |
| **3** | Password corta | `"Admin"` | ❌ Bloqueado | `assertFalse` |
| **4** | Email malformado | `"usuario.com"` | ❌ Bloqueado | `assertFalse` |
| **5** | Edad mínima | `16` | ✅ Pasa | `assertTrue` |

---

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 22
* **Framework de Testing:** JUnit 5 (Jupiter)
* **Gestor de Proyectos:** Maven
* **IDE:** IntelliJ IDEA

---

## 📈 Resultados de la Ejecución
Para verificar el funcionamiento:
1. Abrir el proyecto en IntelliJ.
2. Cargar las dependencias mediante el panel de **Maven**.
3. Ejecutar la clase `ValidadorRegistroTest`.
4. Todos los indicadores deben aparecer en **verde (Passed) ✅**.
   
   La verificación es la siguiente:
<img width="997" height="306" alt="image" src="https://github.com/user-attachments/assets/619bf7b4-7221-4c25-aa65-9a1c43cf0438" />

---

**Desarrollado por:** jmb0049-code  
**Curso:** Testing y QA Automation


