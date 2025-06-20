---

## 🚀 Tecnologías

- Java 17+
- Maven (gestión de dependencias y ejecución)
- JUnit (para algunos patrones con tests de ejemplo)

---

## ✅ Objetivos

- Reforzar fundamentos de diseño orientado a objetos
- Preparación para entrevistas técnicas
- Tener una referencia personal clara y funcional
- Aprender aplicando: código 100% funcional y comentado

---

## 🛠️ Ejecución

Puedes compilar y ejecutar cualquier patrón con Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.ejemplo.patron.NombreDelPatron"
🧩 Estado actual
Patrones implementados:

✅ Factory

✅ Abstract Factory

✅ Builder (versión adaptada con enfoque comprensible)

🔜 Próximamente: Singleton, Strategy, Decorator...

🗒️ Notas personales
El patrón Builder ha sido implementado para entender su mecánica, aunque personalmente prefiero usar constructores claros o métodos estáticos cuando la complejidad del objeto no lo justifica. Aun así, es útil conocerlo para entrevistas y proyectos con muchos parámetros opcionales.
