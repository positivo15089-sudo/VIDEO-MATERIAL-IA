# VÍDEO MATERIAL IA — Guia Completo para Android (100% Local-First)

Este pacote entrega **3 maneiras reais e práticas** de utilizar o **VÍDEO MATERIAL IA** no seu celular ou tablet Android sem depender de servidores pagos, créditos ou assinaturas:

---

## OPÇÃO 1: Uso Imediato no Celular (WebAPK / PWA Offline) — *Mais Rápido (Sem PC)*
O arquivo `app/src/main/assets/index.html` (ou o app aberto agora mesmo na sua tela) já possui suporte nativo a **Android WebAPK**, **Câmera do Celular**, **Gravação Direta em `.MP4` (`MediaRecorder H.264`)** e **Síntese de Voz Local (`Android TextToSpeech` + `WebAudio DSP`)**:
1. Abra o arquivo `video_material_ia.html` no navegador **Google Chrome** do seu Android.
2. Toque na aba **"10. Central Android (APK / Mobile)"** e pressione **"📲 Instalar App no Android Agora (WebAPK)"** (ou toque no menu `⋮` do Chrome → **"Adicionar à tela inicial / Instalar aplicativo"**).
3. O aplicativo será instalado na gaveta de apps do seu Android em tela cheia e funcionará **100% offline**.

---

## OPÇÃO 2: Compilar o Aplicativo Nativo `.APK` (Android Studio ou GitHub Actions)
Esta pasta contém o projeto nativo completo em **Kotlin** (`MainActivity.kt`, `AndroidManifest.xml`, `build.gradle.kts`) integrado ao **FFmpegKit Android** e **ONNX Runtime Mobile (NNAPI / Vulkan)**:
- **Pelo Android Studio**: Abra a pasta raiz deste projeto no Android Studio e clique em **Build → Build Bundle(s) / APK(s) → Build APK(s)**. O arquivo `app-debug.apk` será gerado em `app/build/outputs/apk/debug/app-debug.apk`.
- **Sem instalar nada no PC (via GitHub Actions)**: Suba esta pasta para um repositório privado gratuito no GitHub; o workflow `.github/workflows/build_android_apk.yml` compila e disponibiliza o arquivo `VideoMaterialIA-Android-APK.apk` pronto para baixar no celular em 3 minutos.

---

## OPÇÃO 3: Executar o Motor Python + FFmpeg Diretamente no Android via Termux
Se desejar rodar o script `local_video_engine.py` nativamente no processador ARM64 do celular:
1. Instale o **Termux** no seu Android.
2. Entre na pasta `termux_local_engine` e execute:
   ```bash
   bash instalar_android_termux.sh
   ```

---

## Limitações Reais dos Dispositivos Móveis e Modos de Hardware no Android
Seguindo a diretriz de **Transparência Técnica**, o aplicativo adapta o processamento à capacidade real do seu smartphone:
- **Celulares de Entrada / Intermediários (4 GB a 6 GB RAM)**: Utilizam o **Modo Econômico / Equilibrado** com o *Motor Cinematográfico Local 2.5D (OpenGL ES / Canvas 60fps)* + *MediaCodec H.264* + *Piper TTS*, gerando propagandas de 720p/1080p instantaneamente no aparelho.
- **Celulares Top de Linha (8 GB a 16 GB RAM — Snapdragon 8 Gen 2/3, Dimensity 9300)**: Suportam o modelo quantizado **AnimateDiff-Lightning Mobile INT4 (ONNX)** via NPU/Vulkan local.
- **Ponte Wi-Fi Local para PC (Opcional)**: Na aba **"10. Central Android"**, você pode informar o IP local do seu computador na mesma rede Wi-Fi (`ex: http://192.168.1.100:8188`) para usar sua placa de vídeo RTX no celular com Wan 2.1 14B sem pagar nenhuma API externa.
