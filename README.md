# ArtiPlus

ArtiPlus es una aplicación web diseñada para facilitar la publicación de articulos de educación y proporcionar una experiencia completa en la gestión del contenido que se desea compartir. Los usuarios pueden crear una cuenta, iniciar sesión y realizar pagos de manera segura a través de Paypal para adquirir sus libros favoritos. La aplicación también permite a los administradores gestionar el catálogo de libros de manera eficiente.

## Propósito

El objetivo de ArtiPlus es ofrecer una plataforma integrada que combine la facilidad de compra de libros electrónicos, la gestión del catálogo por parte de administradores, y la personalización de bibliotecas digitales por parte de los usuarios, todo en un entorno seguro y amigable.

## Colaboradores del Proyecto

| Nombre                          | Rol                | Perfil         |
|---------------------------------|-------------------|----------------|
| Piero Gadiel Aguirre Del Castillo     | Líder del Proyecto | [LinkedIn](https://www.linkedin.com/in/piero-gadiel-aguirre-del-castillo-373a50321/)  |
| Joaquin Antonio Portella Pedemonte     | Líder del Proyecto | [LinkedIn](#)  |

## Progreso del Proyecto
| Columna                          | Rol                |
|---------------------------------|-------------------|
|**Backlog**|Listado de todas las historias de usuario, tareas y características pendientes.|
|**En Progreso**|Tareas actualmente en desarrollo.|
|**Revisión**|Tareas completadas que están en revisión de código y por pares.|
|**En Pruebas**|Tareas que han pasado la revisión de código y necesitan pruebas exhaustivas.|
|**Hecho**|Tareas completamente desarrolladas, revisadas y probadas.|
### Tablero de Trello

Mira cómo va avanzando nuestro trabajo visitando el siguiente enlace: [Tablero de Trello](https://trello.com/invite/b/671066c89a911c9a69d8993c/ATTI841da573680a0e1baceb1b629e96ad4f384E14FB/artiplus).

## Funcionalidades de la Aplicación ArtiPlus

### Módulo de Gestión de Usuarios

- Creación de usuarios e inicio de sesión.
- Seguridad de las credenciales de los usuarios.

### Módulo de Compras

- Compra de Artículos electrónicos.
- Integración con PayPal para pagos seguros.

### Módulo de Gestión de Contenido

- Gestión de Artículos: CRUD sobre Artículos.
- Categorías de libros: Clasificación y navegación.
- Gestión de autores: CRUD sobre autores.

### Módulo de Biblioteca Personal

- Organización de Articulos en colecciones personalizadas.

### Módulo de Reportes

- Generación de reportes de actividad y ventas.

## Diagramas de la Aplicación

Para entender mejor la estructura y diseño de la aplicación "BookHub", revisa los siguientes diagramas:

### Diagrama de Clases

![Diagrama de Clases](path/to/class-diagram.png)

### Diagrama de Base de Datos

![Diagrama de Base de Datos](path/to/database-diagram.png)

## Descripción de Capas del Proyecto

| Capa          | Descripción                                           |
|---------------|------------------------------------------------------|
| api           | Controladores REST para manejar solicitudes HTTP y las respuestas.    |
| entity        | Define las entidades del modelo de datos que se mapean a las tablas de la base de datos.            |
| repository    | Proporciona la interfaz para las operaciones CRUD y la interacción con la base de datos.|
| service       | Declara la lógica de negocio y las operaciones que se realizarán sobre las entidades.|
| service impl  | Implementa la lógica de negocio definida en los servicios, utilizando los repositorios necesarios.|

## Asignación de Historias de Usuario

### Sprint 1: Funcionalidades Básicas
Enfocado en implementar las funcionalidades esenciales de CRUD para la gestión de categorías, artículos, autores, usuarios, y el flujo inicial de compras, asegurando que el producto esté listo para un uso básico.

| Integrante    |        Módulo         |   Historia de Usuario     |      Descripción         | Tipo |
|---------------|-----------------------|---------------------------|--------------------------|------|
| Piero         | Gestión de Categorías |  Historia de Usuario      | CRUD sobre categorías    | Tipo |
| Joaquín         | Gestión de Artículos |  Historia de Usuario      | CRUD sobre artículos    | Tipo |
| Piero         | Gestión de Autores |  Historia de Usuario      | CRUD sobre autores    | Tipo |
| Joaquín         | Gestión de Reportes |  Historia de Usuario      | Generación de reportes básicos    | Tipo |
| Piero         | Gestión de Usuarios |  Historia de Usuario      | Registro y gestión de usuarios    | Tipo |
| Joaquín         | Gestión de Compras |  Historia de Usuario      | Flujo inicial de compra de artículos.    | Tipo |
| Piero         | Gestión de Colección de Libros |  Historia de Usuario      | Gestión de colecciones personales.    | Tipo |


### Sprint 2: Integración de Funcionalidades y Optimización
Orientado a la implementación de funcionalidades adicionales, como filtros, reportes detallados, integración de métodos de pago, autenticación y autorización de usuarios, optimización del sistema, y exportación de datos, para garantizar un producto final completo y funcional.
| Integrante    |        Módulo         |   Historia de Usuario     |      Descripción         | Tipo |
|---------------|-----------------------|---------------------------|--------------------------|------|
| Piero         | Gestión de Compras |  Historia de Usuario      | Integración de métodos de pago y reportes detallados.    | Tipo |
| Joaquín         | Gestión de Reportes |  Historia de Usuario      | Reportes avanzados y exportación de datos.    | Tipo |
| Piero         | Gestión de Usuarios |  Historia de Usuario      | Autenticación y autorización con roles. | Tipo |

## Recomendaciones

- **Comunicación Constante**: Mantener una comunicación abierta entre los miembros del equipo.
- **Revisión de Código**: Implementar prácticas de revisión de código entre pares.
- **Gestión del Tiempo**: Planificar y gestionar bien el tiempo para cada historia de usuario.
- **Pruebas Continuas**: Realizar pruebas continuas de las funcionalidades.
- **Documentación Clara**: Mantener una documentación clara y actualizada.
- **Retroalimentación Regular**: Programar sesiones regulares de retroalimentación.
- **Enfoque en el Usuario**: Mantener al usuario final en mente durante el desarrollo.
- **Gestión de Riesgos**: Identificar posibles riesgos y planificar estrategias.
- **Optimización del Rendimiento**: Asegurar que las funcionalidades añadidas no comprometan el rendimiento.
- **Preparación para el Lanzamiento**: Tener un plan de despliegue claro al final del proyecto.
