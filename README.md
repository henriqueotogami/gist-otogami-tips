<div align="center">

## Gist Otogami Tips
### Henrique Otogami
#### Início: 01-04-2023
##### Readme versão 1.1

</div>
<br>
<div align="center">
<img width="500" src="https://github.com/henriqueotogami/todolistyoutube/blob/master/JAVA-Cover.png?raw=true">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/release-date/henriqueotogami/gist-otogami-tips">
</div>
<br>
<div align="center">
<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/henriqueotogami/gist-otogami-tips">
<img src="https://img.shields.io/github/checks-status/henriqueotogami/gist-otogami-tips/main">
<img src="https://img.shields.io/github/issues/henriqueotogami/gist-otogami-tips">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/forks/henriqueotogami/gist-otogami-tips?style=flat">
<img src="https://img.shields.io/github/stars/henriqueotogami/gist-otogami-tips?style=flat">
<img src="https://img.shields.io/github/license/henriqueotogami/gist-otogami-tips">
</div>
<br>
<div align=center>
<a href="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/970cd313-2377-4be5-8492-b10920603feb"><img src="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/970cd313-2377-4be5-8492-b10920603feb.svg" alt="wakatime">
</a>
</div>

### Descrição
> Repositório contendo desafios do LeetCode.

### [Clique aqui para ler os meus artigos no Medium](https://medium.com/@henriqueotogami)

<hr>

### Sumário
- [x] Tip 1 - Java - [Medium - Comparação de números de tipos primitivos -> Complemento de Dois]()
- [x] Tip 2 - Java - [LeeCcode - Soma de números em um array de 1 dimensão](https://leetcode.com/submissions/detail/963245883/)
- [x] Tip 3 - Java - [LeetCode - Verificação de números palíndromos](https://leetcode.com/submissions/detail/964826217/)
- [x] Tip 4 - Java - [LeetCode - Soma de dois números de um array](https://leetcode.com/submissions/detail/965504107/)
- [x] Tip 5 - Java - [LeetCode - Conversão de números romanos para decimais](https://leetcode.com/submissions/detail/975210818/)
- [x] Tip 6 - Java - [LeetCode - Validação de sequência de parênteses](https://leetcode.com/submissions/detail/1017104932/)

<hr>

### Resumos

<details>
    <summary> Tip 1 - Java </summary>

##### Release v1.1

> Medium - Comparação de números de tipos primitivos -> Complemento de Dois.
>
> A partir dos desafios contidos aqui no Tip 1, foi possível escrever o artigo no Medium [Validação de Sequência de Parênteses](https://medium.com/@henriqueotogami/validação-de-sequência-de-parênteses-e969e5560480), compartilhando a minha estratégia para realizar a implementação.

<br>
<div align="center">
<img width="auto" src="https://github.com/henriqueotogami/gist-otogami-tips/blob/main/src/main/resources/com/otogamidev/gist/images/Medium-TwosComplement-Image-01.png?raw=true">
</div>
<br>
<hr>
</details>

<details>
    <summary> Tip 2 - Java </summary>

##### Release v1.2

> Leetcode - Soma de números em um array de 1 dimensão.

#### [LeetCode Submission - Running Sum of 1d Array](https://leetcode.com/submissions/detail/963245883/)

#### Descrição

> Dado um array nums. Definimos uma soma corrente de um array como runningSum[i] = sum(nums[0]…nums[i]).
>
> Retorna a soma corrente de nums. 

##### Exemplo 1:

> Entrada: nums = [1,2,3,4]
>
> Saída: [1,3,6,10]
>
> Explicação: A soma corrente é obtida da seguinte forma: [1, 1+2, 1+2+3, 1+2+3+4].

##### Exemplo 2:

> Entrada: nums = [1,1,1,1,1]
>
> Saída: [1,2,3,4,5]
>
> Explicação: A soma corrente é obtida da seguinte forma: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

##### Exemplo 3:

> Entrada: nums = [3,1,2,10,1]
>
> Saída: [3,4,6,16,17]
 
##### Restrições:

> 1 <= nums.length <= 1000
>
> -10^6 <= nums[i] <= 10^6

<hr>
</details>

<details>
    <summary> Tip 3 - Java </summary>

##### Release v1.3

> LeetCode - Verificação de números palíndromos

#### [LeetCode Submission - Palindrome Number](https://leetcode.com/submissions/detail/964826217/)

#### Descrição

> Dado um inteiro x, retorne true se x for um palíndromo, e false de outra forma .

##### Exemplo 1:

> Entrada: x = 121
>
> Saída: verdadeiro
> 
> Explicação: 121 é lido como 121 da esquerda para a direita e da direita para a esquerda.

##### Exemplo 2:

> Entrada: x = -121
>
> Saída: false
>
> Explicação: Da esquerda para a direita, lê-se -121. Da direita para a esquerda, torna-se 121-. Portanto, não é um palíndromo.

##### Exemplo 3:

> Entrada: x = 10
> 
> Saída: false
> 
> Explicação: Lê 01 da direita para a esquerda. Portanto, não é um palíndromo.

##### Restrições:

> -231 <= x <= 231 - 1

<hr>
</details>

<details>
    <summary> Tip 4 - Java </summary>

##### Release v1.4

> LeetCode - Soma de dois números de um array.

#### [LeetCode Submission - Two Sum](https://leetcode.com/submissions/detail/965504107/)

#### Descrição

> Dado um array de inteiros nums e um inteiro target, retorne os índices dos dois números de modo que a soma deles sejatarget .
> 
> Você pode assumir que cada entrada teria exatamente uma solução e não pode usar o mesmo elemento duas vezes.
> 
> Você pode retornar a resposta em qualquer ordem.

##### Exemplo 1:

> Entrada: nums = [2,7,11,15], alvo = 9
> Saída: [0,1]
> Explicação: Como nums[0] + nums[1] == 9, retornamos [0, 1].

##### Exemplo 2:

> Entrada: nums = [3,2,4], alvo = 6
> Saída: [1,2]

##### Exemplo 3:

> Entrada: nums = [3,3], alvo = 6
> Saída: [0,1]

##### Restrições:

> 2 <= nums.length <= 104
> -109 <= nums[i] <= 109
> -109 <= target <= 109
> Existe apenas uma resposta válida.

<hr>
</details>

<details>
    <summary> Tip 5 - Java </summary>

##### Release v1.5

> LeetCode - Conversão de números romanos para decimais

#### [LeetCode Submission - Roman to Integer](https://leetcode.com/submissions/detail/975210818/)

#### Descrição

> Os algarismos romanos são representados por sete símbolos diferentes:  I, V, X, L, C, De M.
>
> Símbolo | Valor
>
> - I | 1
> - V | 5
> - X | 10
> - L | 50
> - C | 100
> - D | 500
> - M | 1000

> Por exemplo,  2 é escrito como II em numeral romano, apenas dois uns somados. 12 é escrito como  XII, que é simplesmente X + II. O número 27 é escrito como XXVII, que é XX + V + II.
> 
> Os algarismos romanos são geralmente escritos do maior para o menor, da esquerda para a direita. No entanto, o numeral para quatro não é IIII. Em vez disso, o número quatro é escrito como IV. Como o um está antes do cinco, nós o subtraímos, resultando em quatro. O mesmo princípio se aplica ao número nove, que é escrito como IX. Há seis instâncias em que a subtração é usada:
> 
> - Ipode ser colocado antes de V(5) e X(10) para formar 4 e 9. 
> - Xpode ser colocado antes de L(50) e C(100) para fazer 40 e 90. 
> - Cpode ser colocado antes de D(500) e M(1000) para fazer 400 e 900.

> Dado um numeral romano, converta-o em um inteiro.

##### Exemplo 1:

> Entrada: s = "III"
> 
> Saída: 3
> 
> Explicação: III = 3.

##### Exemplo 2:

> Entrada: s = "LVIII"
> 
> Saída: 58
> 
> Explicação: L = 50, V= 5, III = 3.

##### Exemplo 3:

> Entrada: s = "MCMXCIV"
> 
> Saída: 1994
> 
> Explicação: M = 1000, CM = 900, XC = 90 e IV = 4.

##### Restrições:

> - 1 <= s.length <= 15
>
> - s contém apenas os caracteres ('I', 'V', 'X', 'L', 'C', 'D', 'M').
> 
> - É garantido  que sé um numeral romano válido no intervalo [1, 3999].

<hr>
</details>

<details>
    <summary> Tip 6 - Java </summary>

##### Release v1.6

> LeetCode - Validação de sequência de parênteses.

#### [LeetCode Submission - Valid Parentheses](https://leetcode.com/submissions/detail/1017104932/)

#### Descrição

> Dada uma string scontendo apenas os caracteres '(', ')', '{', '}', '['e ']', determine se a string de entrada é válida.
> 
> Uma string de entrada é válida se:
> 
> - Os colchetes abertos devem ser fechados pelo mesmo tipo de colchetes.
> - Os colchetes abertos devem ser fechados na ordem correta.
> - Cada colchete fechado tem um colchete aberto correspondente do mesmo tipo.
 
##### Exemplo 1:

> Entrada: s = "()"
>
> Saída: verdadeiro

##### Exemplo 2:

> Entrada: s = "()[]{}"
>
> Saída: verdadeiro

##### Exemplo 3:

> Entrada: s = "(]"
> 
> Saída: falso

##### Exemplo 4:

> Entrada: s = "([])"
> 
> Saída: verdadeiro

##### Restrições:

> - 1 <= s.length <= 104
> - s consiste apenas em parênteses '()[]{}'.

<hr>
</details>

<hr>

## 📝 Leia meus artigos

### [Artigos no Medium](https://medium.com/@henriqueotogami)
### [Artigos no Dev.to](https://dev.to/henriqueotogami)

<br>

## 💼 Conecte-se comigo
### [Perfil no LinkedIn](https://www.linkedin.com/in/henrique-matheus-alves-pereira)

<br>

## 🙏🏻 Apoie meu conteúdo
### [Compre-me um cafézinho | Buy me a coffee](https://ko-fi.com/henriqueotogami) ☕

<br>

### Créditos
- [x] [Foto de capa by Clay Banks | Unsplash - Photos for everyone](https://unsplash.com/photos/oO6Gm16Cqcg)
- [x] [Shields.io | Badges Info from Github](https://img.shields.io)
- [x] [Alexandre Sanlim | Badges Tech](https://github.com/alexandresanlim/Badges4-README.md-Profile)

<hr>

### Contribuição
> Caso você queira ajudar a melhorar este repositório, siga as etapas abaixo.
> Qualquer ajuda é bem-vinda.

- [x] Faça um **fork** deste repositório (https://github.com/henriqueotogami/gist-otogami-tips/fork);
- [x] Crie um **branch** com as suas modificações ` git checkout -b meu-novo-recurso `;
- [x] Faça um **commit** ` git commit -am 'Adicionando um novo recurso ...'`;
- [x] Faça um **push** ` git push origin meu-novo-recurso ` ;
- [x] Crie uma nova **pull request** neste repositório.

**Depois que sua solicitação (pull request) for aceita e adicionada (merged) ao ramo principal (branch main), você pode excluir sua branch tranquilamente.**

<div align="center">

<br>

> ### **Muito obrigado, e que a força esteja com você.**
>
> ### Desenvolvido por **Henrique Otogami** 🦁

</div>
