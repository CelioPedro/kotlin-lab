# Desafio de Projeto (Lab 2): Internacionalização no Primeiro App

Este desafio teve como objetivo aplicar os conceitos de **Internacionalização (i18n)** em um aplicativo Android. A solução consiste em adaptar o app para exibir o texto em diferentes idiomas, com base na configuração de localidade do dispositivo.

---

## Solução Proposta

A solução foi implementada utilizando o sistema de recursos do Android, que permite fornecer diferentes strings para diferentes idiomas. A análise do projeto revelou a seguinte estrutura de arquivos, que é o padrão para internacionalização:

-   `app/src/main/res/values/strings.xml`: Contém as strings padrão do aplicativo (neste caso, em inglês).
-   `app/src/main/res/values-pt-rBR/strings.xml`: Contém as strings traduzidas para o português do Brasil.

### Análise da Solução

Ao inspecionar os arquivos, foi identificado que a string `app_name` foi traduzida:

-   **No arquivo padrão (`values/strings.xml`), o valor é:**
    ```xml
    <string name="app_name">My App</string>
    ```

-   **No arquivo para português do Brasil (`values-pt-rBR/strings.xml`), o valor é:**
    ```xml
    <string name="app_name">Meu App</string>
    ```

Isso demonstra que a solução foi implementada corretamente. O sistema operacional Android irá carregar automaticamente o recurso apropriado, com base no idioma do dispositivo.

### Como Encontrar os Arquivos da Solução

Os arquivos de internacionalização podem ser encontrados nos seguintes caminhos dentro do projeto:

-   **Arquivo Padrão (Inglês):** `src/main/kotlin/desafioInternationalApp/app/src/main/res/values/strings.xml`
-   **Arquivo em Português (Brasil):** `src/main/kotlin/desafioInternationalApp/app/src/main/res/values-pt-rBR/strings.xml`

### Como Verificar o Resultado

Para verificar a internacionalização em um aplicativo Android, siga estes passos:

1.  **Execute o Aplicativo:** Compile e instale o app em um emulador ou dispositivo físico.
2.  **Altere o Idioma do Dispositivo:**
    -   Vá para **Configurações (Settings)** > **Sistema (System)** > **Idiomas e Entrada (Languages & Input)**.
    -   Adicione o idioma **Português (Brasil)** e o defina como o idioma principal.
3.  **Abra o Aplicativo Novamente:** O nome do aplicativo na gaveta de apps (e em outros locais que usem a string `app_name`) deverá ser exibido como **"Meu App"**.
4.  **Retorne para o Inglês:** Mude o idioma do dispositivo de volta para o inglês. O nome do aplicativo deverá voltar a ser **"My App"**.
