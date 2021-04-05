# Лабораторная 1

1. Сверстать 4 макета на выбор (можно выбрать свои).
2. Создаем проект с ​`21 > API`
3. Не забывайте выравнивать верстку
4. Создавать несколько активити файлов не нужно, только layout’ты
5. Макет создаем в папке `​layout -> new -> layout resource file`
6. Называть их лучше так: `activity_one`, `activity_two` и т. д.

# Лабораторная 2

Решить задачи https://play.kotlinlang.org/koans/overview. Можно установить плагин, кажется называется EduTools и решать в IntelliJ IDEA. Курс нужно закрыть на 100%.

# Лабораторная 3

1. Посмотреть видео про UI компоненты: https://www.youtube.com/watch?v=Gb71h-cEUZs&t=7535s
2. Сделать 2 воркшопа на выбор:
    - Workshop #1 - https://bit.ly/3fosFuQ​
    - Workshop #2 - https://bit.ly/2HvjqwA​
    - Workshop #3 - https://bit.ly/339GVTg​
    - Workshop #4 - https://bit.ly/339HbSe
3. Полезные ссылки:
    - Launch Modes — https://medium.com/mindorks/android-launch-mode-787d28952959  
    https://startandroid.ru/ru/uroki/vse-uroki-spiskom/190-urok-116-povedenie-activity-v-task-intent-flagi-launchmode-affinity.html 
    - Context in android — https://web.archive.org/web/20150329210012/https://possiblemobile.com/2013/06/context   
    - Lifecycle of acivity — http://developer.alexanderklimov.ru/android/theory/lifecycle.php 
    - Lifecycle of fragment — http://developer.alexanderklimov.ru/android/theory/fragment-lifecycle.php 
    - Fragment Manager — http://developer.alexanderklimov.ru/android/theory/fragments.php
    - Dialogs — https://guides.codepath.com/android/using-dialogfragment
4. 
    1. Обратите внимание, что это задание на следующую неделю. Мы можете сделать его на этой неделе. Тут как вы можете заметить - есть картинки и текст (для них используйте заглушку, с помощью схемы tools) https://developer.android.com/studio/write/tool-attributes#toolssample_resources
    2. Добавьте новую активити - DetailsActiviy, и в макете activity_details.xml сверстайте макет, используя ConstraintLayout.

# Лабораторная 4
1. Создайте проект под именем “Lab2_ВашаФамилия”.
2. По видео в лекции создайте приложение c `RecyclerView`.
**Реализация кликов на нажатие на пункт из списка:**
3. Добавьте callback в свой `RecyclerView.Adapter`, которое представляет Int как позицию.
4. В вашем `RecyclerView.ViewHolder` вы должны получить экземпляр view, используйте его для установки callback.
5. В вашем методе `onClick` вызовите соответствующий callback вашего интерфейса.
6. Используйте метод `getAdapterPosition() RecyclerView.ViewHolder`, чтобы получить позицию выбранного элемента в списке.
7. Добавьте новую активити - `DetailsActiviy`, и в макете activity_details.xml сверстайте макет, используя `ConstraintLayout`. 
8. Теперь вам нужно в `DetailsActivity` отобразить данные.
9. Обновите метод `onCreate()` в `DetailsActivity`, чтобы получить версию Android из Intent и обновить представления фактическими данными.