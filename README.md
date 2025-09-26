# 🍲 QueCookBook+

👨‍💻 Anibal Tapia y Adrian Ramirez 

Una app para organizar y consultar recetas de cocina de forma práctica y ordenada.
El objetivo es guardar, buscar y clasificar recetas personales, evitando que se pierdan en papeles o chats.

📌 Preguntas obligatorias (responde todas en tu post)

1️⃣ Nombre de la App

✅ QueCookBook+

2️⃣ Propósito y problema que resuelve

👥 ¿Para quién?

Personas que cocinan en casa y desean tener sus recetas organizadas en un solo lugar.

✨ ¿Qué aporta?

Organización clara de recetas.

Facilidad para consultar ingredientes y pasos.

Acceso rápido a recetas favoritas.

Posibilidad de compartir recetas con amigos.

3️⃣ Pantallas iniciales (Activities)

📲 Listado de pantallas:

Pantalla de Inicio (Splash) → Logo de la app.

Lista de Recetas → Muestra todas las recetas en un RecyclerView.

Detalle de Receta → Ingredientes, pasos, foto.

Agregar Receta → Formulario para ingresar nueva receta.

Favoritos → Recetas marcadas como favoritas.

4️⃣ Navegación entre pantallas

🔗 Flujo de navegación:

SplashActivity → MainActivity (Lista de Recetas)

Intent explícito.

MainActivity → DetalleRecetaActivity

Intent explícito con Extras: "idReceta".

MainActivity → AgregarRecetaActivity

Intent explícito (formulario vacío).

DetalleRecetaActivity → FavoritosActivity

Intent explícito con Extra: "favoritos=true".

Opción de compartir receta con Intent implícito → ACTION_SEND.

5️⃣ Componentes de Android que se prevén usar

🛠️ Listado de componentes:

Activities → Inicio, Lista, Detalle, Agregar, Favoritos.

Intents → Para navegar entre pantallas y compartir recetas.

Room (SQLite) → Persistencia de datos.

View Components → RecyclerView, CardView, EditText, ImageView, Buttons.

Opcional → Notificación local para “receta del día”.

QueCookBook+ — Guía de instalación y ejecución (proyecto tal cual recibido)

Esta guía explica desde cero cómo obtener, abrir y ejecutar el proyecto que me proporcionaste (sin modificaciones extra ni ciclos de vida añadidos).

Requisitos

Android Studio (Giraffe o superior)
Incluye Gradle, SDKs y emulador.

JDK: el que trae Android Studio es suficiente.

Git (opcional, solo si vas a clonar; si no, descarga el .zip).

1) Obtener el proyecto
Clonar con Git

Abre una terminal y ejecuta:
git clone https://www.github.com/Que-Master/QueCookBook
Entra a la carpeta:
cd QueCookBook

2) Abrir en Android Studio

Abre Android Studio.

Clic en Open y selecciona la carpeta del proyecto QueCookBook.

Espera el Gradle Sync (descarga dependencias automáticamente).

Si aparece un banner Sync Now, haz clic.

Si pide usar el JDK de Android Studio, acepta.

Si ves advertencias de dependencias, prueba File ▸ Sync Project with Gradle Files.

3) Preparar un dispositivo para probar
Opción A: Emulador (AVD)

En Android Studio, abre Device Manager (icono de teléfono).

Create Device → elige, por ejemplo, Pixel 5.

Descarga una imagen de sistema (API 30 o superior) y finaliza.

Inicia el emulador (Start).

Opción B: Dispositivo físico (USB)

En el teléfono, activa Opciones de desarrollador
(Ajustes ▸ Acerca del teléfono ▸ tocar 7 veces Número de compilación).

Habilita Depuración por USB.

Conecta el teléfono al PC por USB y acepta la huella de depuración.

4) Ejecutar la app

En la barra superior de Android Studio, elige el emulador o tu teléfono.

Presiona Run ▶ (o Shift + F10).

Android Studio compilará y lanzará QueCookBook+.

Pantalla inicial esperada: Login.

El botón “Iniciar sesión” te lleva al menú principal (no valida credenciales en esta versión).

El texto “Crear cuenta” abre la vista de registro (demo).

Si dejaste visible un acceso “Admin”, entra a las pantallas de Crear / Editar / Borrar receta.

Esta guía asume exactamente el proyecto proporcionado, sin agregar callbacks del ciclo de vida ni lógica extra.

¿Qué trae este proyecto (tal como está)?

LoginActivity (pantalla inicial).

MainActivity (pantalla principal de la app).

RegisterActivity (crear cuenta — demo).

AdminActivity con accesos a:

Crear receta (formulario con título, imagen, ingredientes, porciones, tiempo y pasos).

Editar receta (formulario similar, con botones para pasos).

Borrar receta (confirmación con imagen y botones Cancelar/Borrar).

Persistencia con base de datos/Room puede no estar habilitada aún en este estado; el foco es navegar y visualizar las vistas.
