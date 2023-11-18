Мои лабораторные работы для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - MSiSvIT/МСиСвИТ (метрология, стандартизация и сертификация в информационных технологиях).

## Общая информация

Каждая папка в этом репозитории - проект Gradle, который должен быть открыт через IntelliJ IDEA. Проконтролируйте, чтобы версии Gradle JVM и JDK соответствовали указанным ниже.

| Технология | Версия  | Пояснение                                    | Примечание                                                       |
|------------|---------|----------------------------------------------|------------------------------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки         | -                                                                |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle | [Настраивается в переменных средах ОС (JAVA_HOME и Path)][Link1] |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте        | -                                                                |
| JDK        | 17.0.9  | Версия SDK, используемая в проекте           | [Настраивается в IntelliJ IDEA (Project Structure)][Link2]       |

[Link1]: https://java-lessons.ru/first-steps/java-home#:~:text=Теперь%20щёлкните%20правой%20кнопкой
[Link2]: https://www.jetbrains.com/help/idea/sdk.html#change-module-sdk

## Условия работ

Язык, который был выбран жеребьёвкой для парсинга - Ruby.  Парсер для Ruby реализован по книге дракона (рекурсивный спуск).  Обрабатываются не все конструкции. Примеры кода приведены в репозиториях.

### Лабораторная работа 1

Метрика Холстеда (Halstead Metrics) для кода на Ruby. Есть графический интерфейс. Данные выводятся в html файл и красивенько открываются в браузере.

### Лабораторная работа 2

Метрика Джилба (Jilbe Metrics) для кода на Ruby. Есть графический интерфейс. Данные выводятся в сообщение.

### Лабораторная работа 3

Метрика Чепина (Chepin Metrics) для кода на Ruby. Есть графический интерфейс. Данные выводятся в html файл и красивенько открываются в браузере.
