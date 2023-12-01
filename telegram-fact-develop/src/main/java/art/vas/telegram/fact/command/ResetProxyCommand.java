package art.vas.telegram.fact.command;

import art.vas.telegram.fact.service.ProxyService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.util.StreamUtils;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class ResetProxyCommand implements SimpleMessageCommando {
    private final ProxyService proxyService;

    @Override
    public String getCommandLine() {
        return "/reset";
    }

    @Override
    public SendMessage answer(Message message) {
        String text = message.getText();
        List<String> iterable = Arrays.asList("");
        Collectors.teeing()
        String[] strings = StringUtils.splitPreserveAllTokens(text, " \n");
        proxyService.after(Arrays.asList(ArrayUtils.subarray(strings, 1, strings.length)));
        return new SendMessage(message.getChatId().toString(), "Успешно, наверно...");
    }
}
