package ru.skyteam.pettelegrambot.message;

public class BotReplayMessage {
    // Взаимодействие с пользователем. Ответы.
    //Консультация с новым пользователем

    public static final String START = "Рады приветствовать вас в приюте для животных! Здесь вы можете "
            + "стать обладателем домашнего питомца и обрести лучшего друга.\n"
            + "В настоящее время мы заботимся о кошках и собаках. Пожалуйста, выберите, о каком приюте вы хотите узнать больше";
    public static final String ADOPT_MENU = "Привет! Вы находитесь в меню с информацией о приюте, тут вы можете узнать общую информацию о работе приюта";

    public static final String MAIN_MENU = "Привет! ВЫ находитесь в основном меню";

    public static final String INFO_SHELTER = "Наш приют работает ежедневно с 8:00 до 20:00. "
            + "Мы находимся г. Астана, ул. Планерная 1, стр.1.";

    public static final String SECURITY_PASS = "Для проезда на территорию приюта необходимо оформить пропуск. "
            + "Пожалуйста, свяжитесь с охраной по телефону или в WhatsApp 8-988-888-88-88";

    public static final String INFO_PRECAUTION = """
            Соблюдайте технику безопасности. На территории приюта запрещается:
            1. Самостоятельно открывать выгулы и вольеры без разрешения работника приюта
            2. Кормить животных
            3. Оставлять после себя мусор на территории приюта и прилегающей территории        
            4. Кричать, размахивать руками, бегать между будками или вольерами, пугать и дразнить животных        
            """;

    public static final String CONTACT_INFO = "Вы можете оставить свои контактные данные." +
            "Введите Ваши имя и Фамилию:";

    public static final String VOLUNTEER = "Вы можете связаться с волонтером по телефону или в WhatsApp 8-977-777-77-77";

    //консультация с потенциальным хозяином

    public static final String POTENTIAL_PET_PARENT_HELLO = "Привет! Вы находитесь в меню с информацией о том, как стать владельцем питомца";

    public static final String POTENTIAL_PET_PARENT_RULES = """
            Правила знакомства с животным: \n
            Вам необходимо каждый день посещать приют, чтобы познакомиться с питомцем и привыкнуть друг к другу.
            Не стоит навязывать питомцу свое общение, начните с ним играть, когда он будет готов.
            """;

    public static final String POTENTIAL_PET_PARENT_DOCUMENTS = """
            Список документов, необходимых для того, чтобы взять животное из приюта.
            1 Паспорт
            2 Подписание договора об ответственности с приютом 
                  
            Почему могут отказать в передаче питомца:
            1 Большое количество животных дома
            2 Нестабильные отношения в семье
            3 Наличие маленьких детей
            4 Съемное жилье
            5 Животное в подарок или для работы
                        
            """;

    public static final String RECOMMENDATIONS_TRANSPORT = " Рекомендаций по транспортировке животного.\n"
            + "Питомца нужно перевозить в клетке или на поводке.";

    public static final String RECOMMENDATIONS_FOR_HOME = """
            Список рекомендаций по обустройству дома для щенка
            1 Обустроить место для сна и отдыха
            2 Поставить миски для воды и еды
            3 Приобрести игрушки для собак
            """;

    public static final String RECOMMENDATIONS_FOR_CAT_HOME = """
            Список рекомендаций по обустройству дома для кошки
            1 Обустроить место для сна и отдыха
            2 Поставить миски для воды и еды
            3 Приобрести игрушки для кошек
            """;

    public static final String RECOMMENDATIONS_FOR_HOME_BIG_DOG = """
            Список рекомендаций по обустройству дома для взрослой собаки
            1 Наличие большого свободного пространства для игр собаки
            2 Большое спальное место       
            """;

    public static final String RECOMMENDATIONS_FOR_PET_WITH_DISABILITIES = """
            Список рекомендаций по обустройству дома для животных с ограниченными возможностями
            1 Расположить место для кормления недалеко от спального
            2 Организовать туалет в досягаемости питомца
            """;

    public static final String ADVICE_CYNOLOGIST_COMMUNICATION_DOG = """
             Советы кинолога по первичному общению с собакой
            1 Разговаривайте с собакой
            2 Следите за своими эмоциями
            3 Гибко реагируйте на поведение собаки
            4 Поиграйте с собакой если она готова
            """;

    public static final String LIST_OF_CYNOLOGIST = """
            Список профессиональных кинологов:
            1 Иванов Иван, телефон 8-999-99-99
            2 Петров Пётр, телефон 8-666-66-66
            3 Павлов Павел, телефон 8-555-55-55
            """;

    public static final String PET_PARENT_CONTACT = "Перед тем как взять питомца вы должны оставить свои контактные данные."
            + "Пожалуйста, укажите ваши Имя и Фамилию ";

    // Ведение питомца.

    public static final String REPORT_FORM = """
            Пожалуйста, пришлите фото питомца, и ответьте на следующие вопросы одним сообщением:
            1. Опишите рацион питомца
            2. Опишите как чувствует себя питомец и как привыкает к новому месту
            3. Опишите изменение в поведении: отказ от старых привычек, приобретение новых
            """;

    public static final String INCORRECT_REPORT = """ 
            Вы прислали некорректно заполненный отчет.
            Пожалуйста, пришлите фото питомца, и ответьте на следующие вопросы одним сообщением:
                        1. Опишите рацион питомца
                        2. Опишите как чувствует себя питомец и как привыкает к новому месту
                        3. Опишите изменение в поведении: отказ от старых привычек, приобретение новых
                        """;

    public static final String WARNING_TO_REPORT = "Дорогой усыновитель, мы заметили, что ты заполняешь отчет не так подробно,"
            + " как необходимо. Пожалуйста, подойди ответственнее к этому занятию. "
            + "В противном случае волонтеры приюта будут обязаны самолично проверять условия содержания животного";

    public static final String CONGRATULATIONS = "Вы успешно прошли испытательный срок. Поздравляем! Вы можете оставить питомца! ";

    public static final String ADDITIONAL_TIME_14 = " Вам назначен дополнительный испытательный срок 14 дней. Не забывайте своевременно отправлять отчеты! ";
    public static final String ADDITIONAL_TIME_30 = " Вам назначен дополнительный испытательный срок 30 дней. Не забывайте своевременно отправлять отчеты! ";

    public static final String PET_RETURN = "Сожалеем, вы не прошли испытательный срок." +
            " Вам необходимо в течение трех рабочих дней вернуть животное в приют.";

}