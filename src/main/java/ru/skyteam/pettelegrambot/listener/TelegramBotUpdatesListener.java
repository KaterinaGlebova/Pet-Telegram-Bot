package ru.skyteam.pettelegrambot.listener;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.skyteam.pettelegrambot.message.BotMenu;
import ru.skyteam.pettelegrambot.message.BotReplayMessage;
import ru.skyteam.pettelegrambot.message.ButtonMenu;
import ru.skyteam.pettelegrambot.report.ReportHandler;
import ru.skyteam.pettelegrambot.sendContact.SendContactHandler;

import java.util.List;

@RequiredArgsConstructor
@Component
public class TelegramBotUpdatesListener implements UpdatesListener {

    private final Logger logger = LoggerFactory.getLogger(TelegramBotUpdatesListener.class);
    private final ButtonMenu buttonMenu;
    private final TelegramBot telegramBot;
    private final ReportHandler reportHandler;
    private final SendContactHandler sendContactHandler;

    @PostConstruct
    public void init(){
        telegramBot.setUpdatesListener(this);
    }

    @Override
    public int process(List<Update> updates) {
        try {            updates.forEach(update -> {
            logger.info("Handles updates: {}", update);
            if (update.message() != null){
                Message message = update.message();
                Long chatId = message.chat().id();
                String text = message.text();
                if ("/start".equals(text)){
                    buttonMenu.petMenu(chatId);
                }


            } else if (update.callbackQuery() != null) {
                Long chatId = update.callbackQuery().message().chat().id();
                CallbackQuery callbackQuery = update.callbackQuery();
                String data = callbackQuery.data();
                String name = update.callbackQuery().message().chat().firstName();

                switch (data){
                    case (BotMenu.INFO_CAT),
                            (BotMenu.IN_MAIN_MENU):
                        buttonMenu.meinMenu(chatId);
                        break;
                    case (BotMenu.INFO_DOG):
                        buttonMenu.meinMenu(chatId);
                        break;

                    case (BotMenu.CALL_VOLUNTEER):
                        sendMessage(chatId, BotReplayMessage.VOLUNTEER);
                        buttonMenu.adoptMenu(chatId);
                        break;

                    case (BotMenu.INFO_SHELTER):
                        buttonMenu.adoptMenu(chatId);
                        break;
                    case (BotMenu.SECURITY_PASS):
                        sendMessage(chatId, BotReplayMessage.SECURITY_PASS);
                        buttonMenu.adoptMenu(chatId);
                        break;
                    case (BotMenu.SEND_CONTACTS):
                        sendMessage(chatId,BotReplayMessage.CONTACT_INFO);
                        buttonMenu.adoptMenu(chatId);
                        break;
                    case (BotMenu.PRECAUTION):
                        sendMessage(chatId, BotReplayMessage.INFO_PRECAUTION);
                        buttonMenu.adoptMenu(chatId);
                        break;
                    case (BotMenu.GENERAL_INFO_SHELTER):
                        sendMessage(chatId, BotReplayMessage.INFO_SHELTER);
                        buttonMenu.adoptMenu(chatId);
                        break;
                    case (BotMenu.IN_PET_MENU):
                        buttonMenu.petMenu(chatId);

                }


            }
        });



        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }


    public void sendMessage(Long chatId, String textToSend){
        SendMessage message = new SendMessage(chatId, textToSend);
        SendResponse response = telegramBot.execute(message);
        if (!response.isOk()){
            logger.error("Ошибка отправки сообщения от бота: {}", response.description());
        }

    }

}
