# Resumen del código de pyEdlin

## 1. Idea general
El programa simula un editor de texto simple con **10 líneas**.  
Funciona mostrando un menú y esperando comandos del usuario hasta que decide salir.

---

## 2. Almacenamiento del texto
Las líneas se guardan en una **lista de 10 posiciones**.
Cada posición representa una línea del archivo.
Si una línea está vacía, se guarda como texto vacío.

---

## 3. Línea activa
Existe una variable que indica la **línea activa**.
Esta línea es la que se edita o se borra.
Se cambia usando el comando `[L]`.

---

## 4. Mostrar en pantalla
El programa imprime todas las líneas:
- Muestra el número de línea
- Muestra el texto
- Marca con `*` la línea activa

---

## 5. Comandos principales
- `[L]` Selecciona la línea activa  
- `[E]` Edita el contenido de la línea activa  
- `[B]` Borra el contenido de la línea activa  
- `[I]` Intercambia el contenido de dos líneas  
- `[S]` Sale del programa  

---

## 6. Funcionamiento general
Todo se ejecuta dentro de un bucle:
- Se muestra el texto
- Se muestra el menú
- Se ejecuta el comando ingresado

---

## 7. Deshacer (CTRL + Z)
Para deshacer, se podría guardar una copia del estado del texto antes de cada cambio y recuperarla cuando el usuario lo solicite.

---

## 8. Conclusión
El código es simple, usa listas y comandos básicos, y cada función tiene una tarea clara.
