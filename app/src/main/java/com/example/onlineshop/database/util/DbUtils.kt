package com.example.onlineshop.database.util

import com.example.onlineshop.R
import com.example.onlineshop.database.entity.Book

fun provideBookList() : List<Book> {
    return listOf(
        Book(
            name = "Тени городов",
            picture = R.drawable.first,
            description = "В этом захватывающем романе детектив с элементами мистики следователь Лиза Белова пытается разгадать череду загадочных исчезновений в мегаполисе. Каждая улица хранит тайны, а за каждым углом её подстерегает что-то большее, чем просто преступление. Тайны прошлого и неожиданные повороты делают эту книгу настоящим бестселлером."
        ),
        Book(
            name = "На краю вечности",
            picture = R.drawable.second,
            description = "Эпическое фэнтези о мире, где магия умирает, а пророчества о конце света становятся реальностью. Главный герой — изгнанный маг Элрион — отправляется в опасное путешествие, чтобы найти древний артефакт, способный спасти их мир. Сложный выбор, мощные союзники и опасные враги делают историю яркой и незабываемой"
        ),
        Book(
            name = "Рецепты счастья",
            picture = R.drawable.third,
            description = "Добрая и вдохновляющая книга о том, как находить радость в мелочах. Автор делится реальными историями, простыми советами и вкусными рецептами, которые помогут изменить ваше отношение к жизни. Это книга для тех, кто хочет наполнить свои будни светом и позитивом."
        ),
        Book(
            name = "Алгоритм любви",
            picture = R.drawable.fourth,
            description = "Современный роман о любви в эпоху технологий. Программист Анна создаёт уникальный алгоритм для поиска идеального партнёра. Но когда он предлагает ей самого неожиданного кандидата, ей придётся разобраться, что важнее: точные расчёты или её собственное сердце. Ироничная, теплая и глубокая история о поиске себя."
        ),
        Book(
            name = "Затерянные звёзды",
            picture = R.drawable.fifth,
            description = "Космическая опера с элементами триллера. В далёком будущем команда исследователей сталкивается с загадочной цивилизацией, чьи технологии могут уничтожить Вселенную. Главная героиня, капитан Селена, должна решить, стоит ли доверять неизвестным существам или уничтожить их ради выживания. Напряжённый сюжет и неожиданные развязки!"
        )
    )
}