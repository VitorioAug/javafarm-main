🚜 My Little Farm (JavaFX)
Bem-vindo ao My Little Farm, um jogo de simulação de fazenda desenvolvido em JavaFX. Neste projeto, você pode plantar, cuidar e colher diferentes vegetais e frutas em uma fazenda interativa.

🎯 Objetivo do Projeto
O objetivo principal deste projeto é demonstrar a aplicação de conceitos de Programação Orientada a Objetos (POO) em um contexto prático e visual, incluindo:

Herança e Polimorfismo: Classes genéricas como Planta são estendidas por classes mais específicas (Batata, Cenoura, Morango), permitindo que a mesma lógica de crescimento seja reutilizada.

Encapsulamento: A lógica interna de cada classe (Terreno, Celeiro, Fazenda) é isolada, expondo apenas os métodos necessários para a interação.

Composição: O objeto Fazenda é composto por uma coleção de Terrenos e um Celeiro, mostrando como objetos podem ser construídos a partir de outros.

✨ Funcionalidades
Plantio: Escolha entre batata, cenoura e morango e plante-os em qualquer um dos 169 terrenos disponíveis.

Crescimento: As plantas crescem automaticamente com o passar do tempo. Cada tipo de planta tem seu próprio tempo de crescimento.

Colheita: Colha as plantas quando estiverem prontas.

Celeiro: Armazene os itens colhidos em um celeiro com capacidade limitada.

Aceleração de Tempo: Um modo de jogo permite acelerar o tempo para que as plantas cresçam mais rápido.

Interface Gráfica: Uma interface de usuário intuitiva desenvolvida com JavaFX.

🛠️ Tecnologias Utilizadas
Linguagem de Programação: Java

Framework UI: JavaFX

IDE: IntelliJ IDEA ou VS Code (com extensões para Java/JavaFX) 

📂 Estrutura do Projeto
O código está organizado em um pacote br.com.joaocarloslima e é composto pelas seguintes classes principais:

Planta (Classe Abstrata): A classe base para todos os tipos de plantas. Define a lógica de crescimento e o comportamento genérico.

Batata, Cenoura, Morango: Classes que herdam de Planta e implementam as regras específicas para cada tipo de vegetal.

Terreno: Representa um pedaço de terra na fazenda, que pode conter uma Planta.

Celeiro: Gerencia o estoque de itens colhidos.

Fazenda: A classe principal que orquestra a interação entre os terrenos e o celeiro.

Controller: A classe de controle do JavaFX que lida com a lógica da interface gráfica e a interação com o usuário.

🚀 Como Executar o Projeto
Pré-requisitos: Certifique-se de ter o JDK 11 ou superior instalado em sua máquina.

Configurar o JavaFX: Se você estiver usando uma IDE como o IntelliJ ou o VS Code, adicione as bibliotecas do JavaFX ao seu projeto. Você pode baixá-las do site oficial do OpenJFX.

Executar a Aplicação:

Compile as classes Java.

Execute a classe principal da sua aplicação (geralmente a classe Main ou a classe que inicia a interface gráfica).

Seu projeto deve iniciar a janela do jogo, permitindo que você comece a plantar e colher.

🤝 Contribuições
Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar o projeto! Ideias de melhoria incluem:

Adicionar mais tipos de plantas.

Implementar um sistema de economia para comprar sementes e vender produtos.

Adicionar animações mais fluidas para o crescimento das plantas.
