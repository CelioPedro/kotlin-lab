# Desafio de Projeto (Lab 1): Abstração de Formações

Este desafio de projeto teve como objetivo aplicar os conceitos de **Programação Orientada a Objetos (POO)** em Kotlin para modelar o domínio de uma plataforma de cursos online, como a DIO.

---

## Solução Proposta

A solução foi implementada em um único arquivo Kotlin, seguindo uma estrutura limpa e organizada. O código-fonte principal pode ser encontrado no arquivo `desafioAbstraçãoFormações).kt`.

### Como Encontrar o Arquivo da Solução

O arquivo com a implementação completa está localizado no seguinte caminho dentro do projeto:

`src/main/kotlin/desafioAbstraçãoFormações).kt`

### Estrutura do Código

A solução foi modelada utilizando as seguintes classes para abstrair o domínio proposto:

-   `enum class Nivel`: Enumeração para os níveis de dificuldade (`BASICO`, `INTERMEDIARIO`, `DIFICIL`).
-   `data class Usuario`: Representa os alunos da plataforma.
-   `data class ConteudoEducacional`: Modela os cursos, com nome e duração.
-   `data class Formacao`: É a classe central que organiza os conteúdos. Ela contém:
    -   A lógica para `matricular()` um ou mais usuários, evitando duplicidade.
    -   A função `exibirDetalhes()` que imprime no console um relatório completo da formação, incluindo nome, nível, duração total, lista de conteúdos e alunos inscritos.

A função `main` contém um cenário de exemplo completo, com a criação de múltiplos conteúdos, formações e usuários, demonstrando o processo de matrícula e a exibição dos relatórios.

### Como Executar o Código

1.  Navegue até o arquivo `src/main/kotlin/desafioAbstraçãoFormações).kt` no seu IDE.
2.  Localize a função `main()`.
3.  Clique no ícone de "play" (▶️) que aparece na margem esquerda, ao lado da declaração da função.
4.  Selecione a opção **Run 'DesafioAbstraçãoFormações_Kt'** no menu que surgir.

O resultado da execução, com os logs de matrícula e os relatórios detalhados de cada formação, será exibido na janela de console **Run**.
