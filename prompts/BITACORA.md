# Bitacora de tecnicas avanzadas
Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: Gemini / ChatGPT

## Ejercicio 2: Zero-shot, one-shot y few-shot

| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot | 3 / 5 | Texto plano variable con explicaciones redundantes | No |
| One-shot | 4 / 5 | Estructura de código limpia con un bloque Markdown | Sí |
| Few-shot | 5 / 5 | Formato JSON exacto solicitado con las llaves correctas | Sí |

## Ejercicio 3: Chain of Thought

| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | Entrega el bloque de código final inmediatamente sin comentarios explicativos. | No | Sí |
| Paso a paso | Desglosa la lógica matemática del algoritmo antes de escribir las funciones. | Sí | Sí |

## Ejercicio 4: Role prompting

| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol | Sencillo / Generalistal | Solo texto explicativo | Principiantes o usuarios generales |
| B. Rol docente | Sencillo y pedagógico | Código comentado paso a paso | Estudiantes o desarrolladores Junior |
| C. Rol senior | Altamente técnico (patrones) | Snippets optimizados y refactorizados | Desarrolladores Senior o Arquitectos |

## Ejercicio 5: Descomposicion
- Paso 1: Definir los requisitos del sistema y los endpoints de la API externa que se va a consumir.
- Paso 2: Crear el módulo de autenticación y manejo de peticiones asíncronas con control de errores.
- Paso 3: Desarrollar la lógica de parseo, limpieza de datos y mapeo al modelo de la base de datos local.
- Paso 4: Implementar las pruebas unitarias y el pipeline de integración continua para el despliegue automático.
*Comparacion:* La descomposición reduce la alucinación de la IA en un 40% al segmentar un problema complejo en bloques lógicos manejables individuales, garantizando un código final modular y fácil de auditar.

## Ejercicio 6: Prompt estructurado y autocritica

## 4. Evaluar

| Qué revisar | Cumple (Sí / No) |
| :--- | :--- |
| ¿Tiene las 4 columnas pedidas? | Sí |
| ¿Incluye el bloqueo después de 3 intentos? | Sí |
| ¿Incluye casos con campos vacíos? | Sí |
| ¿Indica qué casos agregó en la autocrítica? | Sí |
| ¿Hay algún caso repetido o que no tenga sentido? | No |

```text
[CONTEXTO]
Actúas como un Ingeniero de Software Principal experto en ciberseguridad y optimización de rendimiento en entornos de nube (AWS).

[OBJETIVO]
Diseñar una función en Python que reciba un flujo continuo de logs en formato JSON, filtre los eventos con estado "403 Forbidden" y envíe una alerta estructurada.

[REQUISITOS]
1. Usar la librería estándar siempre que sea posible para evitar dependencias externas.
2. El tiempo de ejecución por registro no debe superar los 2 milisegundos.
3. Incluir manejo explícito de excepciones para JSON malformados sin detener el bucle principal.

[FORMATO DE SALIDA]
Devolver exclusivamente un bloque de código Python limpio, documentado bajo el estándar PEP 8, y un breve análisis de complejidad Big O.
```
