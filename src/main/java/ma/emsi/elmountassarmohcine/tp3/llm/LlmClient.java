package ma.emsi.elmountassarmohcine.tp3.llm;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.Dependent;

@Dependent
public class LlmClient {

    private GuideTouristique guide;

    public LlmClient() {
        String cle = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash-lite")
                .temperature(0.7)
                .build();

        this.guide = AiServices.builder(GuideTouristique.class)
                .chatModel(model)
                .build();
    }

    public String envoyerRequete(String lieu, int nombre) {
        return this.guide.chat(
                "Lieu : " + lieu
                        + "\nNombre d'endroits à visiter : " + nombre);
    }
}