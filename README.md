# 🍲 QueCookBook+

👨‍💻 Anibal Tapia y Adian Ramirez 

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
