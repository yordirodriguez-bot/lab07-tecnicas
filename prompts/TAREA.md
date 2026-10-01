# Tarea: Mi prompt avanzado

## Tarea elegida
Generar casos de prueba automatizados para un módulo de registro de usuarios en una aplicación web.

## Version 1: prompt basico
```text
Dame casos de prueba para probar un registro de usuarios con nombre, correo y contraseña.
```
* **Qué técnica agregaste:** Ninguna, es un prompt directo (Zero-shot).
* **Por qué:** Para establecer una línea base y ver qué genera la IA sin instrucciones avanzadas.
* **Qué mejoró en la respuesta:** Genera ideas muy genéricas y desorganizadas, sin un formato estructurado para desarrollo de software.

## Version 2
```text
[CONTEXTO]
Actúas como un Ingeniero de QA Senior enfocado en pruebas unitarias y de integración.

[OBJETIVO]
Escribir casos de prueba detallados para un formulario de registro de usuarios.

[REQUISITOS]
1. Incluye casos con campos vacíos.
2. Incluye una validación de formato de correo electrónico.
```
* **Qué técnica agregaste:** Role Prompting ("Ingeniero de QA Senior") y Prompt Estructurado (`[CONTEXTO]`, `[OBJETIVO]`).
* **Por qué:** Para guiar la personalidad de la IA hacia un rol técnico específico y ordenar las instrucciones.
* **Qué mejoró en la respuesta:** La respuesta es mucho más profesional y se enfoca en escenarios reales de control de calidad, aunque todavía falta profundidad en lógica de seguridad.

## Version 3: prompt final
```text
[CONTEXTO]
Actúas como un Ingeniero de QA Senior enfocado en pruebas unitarias y de integración.

[OBJETIVO]
Diseñar casos de prueba de caja negra para un módulo de registro de nuevos usuarios en formato de tabla Markdown.

[REQUISITOS]
1. Incluye casos con campos vacíos.
2. Incluye una validación estricta de formato de correo electrónico.
3. El sistema debe bloquear la IP temporalmente después de 3 intentos fallidos consecutivos de registro.

[EJEMPLO FEW-SHOT]

| ID | Escenario | Datos de Entrada | Resultado Esperado |
| :--- | :--- | :--- | :--- |
| TC01 | Registro exitoso | Nombre: 'Ana', Correo: 'ana@test.com', Pass: 'Abc1234*' | Usuario creado con éxito en la Base de Datos |

Por favor, desglosa paso a paso tu lógica de análisis antes de generar la tabla final para asegurar la cobertura de pruebas.
```
* **Qué técnica agregaste:** Few-shot (ejemplo de tabla) y Chain of Thought ("desglosa paso a paso tu lógica").
* **Por qué:** Para forzar a la IA a razonar antes de responder y garantizar que la salida tenga exactamente la estructura de columnas requerida.
* **Qué mejoró en la respuesta:** La respuesta incluye un análisis lógico exhaustivo previo y entrega la tabla final con un formato impecable, cubriendo los casos límite solicitados como el bloqueo de intentos.

## Tecnicas usadas en el prompt final

| Técnica Aplicada | Fragmento del Prompt Final que la representa |
| :--- | :--- |
| **Role Prompting** | `Actúas como un Ingeniero de QA Senior enfocado en pruebas...` |
| **Few-shot** | El bloque completo que contiene la tabla de ejemplo `| ID | Escenario | ...` |
| **Chain of Thought** | `Por favor, desglosa paso a paso tu lógica de análisis antes de generar...` |

## Evaluacion del resultado

| Qué revisar | Cumple (Sí / No) |
| :--- | :--- |
| ¿Tiene las 4 columnas pedidas? | Sí |
| ¿Incluye el bloqueo después de 3 intentos? | Sí |
| ¿Incluye casos con campos vacíos? | Sí |
| ¿Indica qué casos agregó en la autocrítica? | Sí |
| ¿Hay algún caso repetido o que no tenga sentido? | No |

## Por que elegi estas tecnicas
Elegí combinar **Role Prompting**, **Few-shot** y **Chain of Thought** porque el diseño de pruebas de software requiere precisión técnica y un formato estricto. El rol de *Ingeniero de QA Senior* sitúa a la IA en el nivel de experiencia adecuado, evitando respuestas vagas o genéricas. La técnica de *Few-shot* asegura que la estructura de la tabla final mantenga un formato limpio y procesable de inmediato. Finalmente, *Chain of Thought* obliga al modelo a listar los escenarios de error (como los campos vacíos y el bloqueo de seguridad) antes de tabularlos, garantizando que no se omitan criterios clave de aceptación.
