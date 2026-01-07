package in.ghibli.backend.service;

import in.ghibli.backend.client.StabilityAIClient;

import in.ghibli.backend.dto.TextToImageRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class GhibliArtService {
    private final StabilityAIClient stabilityAIClient;
    private final String apiKey;

    public GhibliArtService(StabilityAIClient stabilityAIClient, @Value("${stability.api.key}") String apiKey) {
        this.stabilityAIClient = stabilityAIClient;
        this.apiKey = apiKey;
    }

    public byte[] createGhibliArt(MultipartFile image, String prompt) {
        String finalPrompt = prompt + "in the style of Studio Ghibli, hand-painted anime illustration,\n" +
                "soft watercolor and gouache textures, warm pastel colors," +
                "cinematic wide-angle composition, gentle golden-hour lighting," +
                "highly detailed background with lush greenery and sky," +
                "soft shadows, smooth shading, expressive anime aesthetics," +
                "dreamy, nostalgic, peaceful atmosphere, ultra-detailed," +
                "high resolution, masterpiece";
        //stable-diffusion-xl-1024-v1-0
        String engineId = "stable-diffusion-v1-6";
        String stylePreset = "anime";

        return stabilityAIClient.generateImageFromImage("Bearer" + apiKey,
                engineId,
                image,
                finalPrompt,
                stylePreset
        );
    }

    public byte[] createGhibliArtFromText(String prompt, String style) {
        String finalPrompt = prompt + "in the style of Studio Ghibli, hand-painted anime illustration,\n" +
                "soft watercolor and gouache textures, warm pastel colors," +
                "cinematic wide-angle composition, gentle golden-hour lighting," +
                "highly detailed background with lush greenery and sky," +
                "soft shadows, smooth shading, expressive anime aesthetics," +
                "dreamy, nostalgic, peaceful atmosphere, ultra-detailed," +
                "high resolution, masterpiece";
        //stable-diffusion-xl-1024-v1-0
        String engineId = "stable-diffusion-v1-6";
        String stylePreset = style.equals("general") ? "anime" : style.replace("_", "-");

        TextToImageRequest reqPayload = new TextToImageRequest(finalPrompt, stylePreset);


        return stabilityAIClient.generateImageFromText("Bearer" + apiKey,
                engineId,
                reqPayload
        );
    }

}
