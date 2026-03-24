package com.mikailov.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Базы данных",
        professor = "Смирнова Е.В.",
        credits = 85,
        currentGrade = "Хорошо",
        description = "Проектирование реляционных баз данных, SQL запросы, нормализация, индексы, транзакции и работа с PostgreSQL."
    ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "4",
        name = "Web-разработка",
        professor = "Кузнецов А.А.",
        credits = 88,
        currentGrade = "Отлично",
        description = "Разработка современных веб-приложений на React и Node.js, REST API, GraphQL, деплой и работа с облачными сервисами."
    ),
    Subject(
        id = "5",
        name = "Машинное обучение",
        professor = "Петрова И.С.",
        credits = 82,
        currentGrade = "Хорошо",
        description = "Основы машинного обучения, нейронные сети, работа с библиотеками TensorFlow и PyTorch, обработка данных и построение прогнозных моделей."
    ),
    Subject(
        id = "6",
        name = "Информационная безопасность",
        professor = "Михайлов К.П.",
        credits = 79,
        currentGrade = "Хорошо",
        description = "Криптография, защита информации, безопасность сетей, анализ уязвимостей и методы защиты корпоративных систем."
    ),

    Subject(
        id = "7",
        name = "Иностранный язык",
        professor = "Пенькова О.В.",
        credits = 79,
        currentGrade = "Хорошо",
        description = "Иностранный язык в сфере IT."

    ),

    Subject(
        id = "8",
        name = "Математическое моделирование",
        professor = "Трошина О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Решение математический решений и задач."
    )
)