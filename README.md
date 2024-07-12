# Santander Bootcamp 2024
RESTful API do Santander Bootcamp 2024 construída em Java 21 com Spring Boot 3.
## Diagrama de Classe

```mermaid
classDiagram
    Character o-- Skill
    
    Skill <|-- ActiveSkill
    Skill <|-- PassiveSkill
    Character: +name
    Character: +level
    Character: +rarity
    Character: +type
    Character: +skills[]
    
    class Skill{
      +name
      +description
    }
    class ActiveSkill{
      +color
      +cooldown
    }
    class PassiveSkill{
      +trigger
    }
 ```
