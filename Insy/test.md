# ERM

```mermaid
---
title: Order example
---
erDiagram
    CUSTOMER ||--o{ ORDER : places
    ORDER ||--|{ LINE-ITEM : contains
    CUSTOMER }|..|{ DELIVERY-ADDRESS : uses

```

|  Value (left)| Value (right)  | Meaning  |
|---|---|---|
|  \|o |  o\| | Zero or one  |
|  \|\| | \|\|  |  Exactly one |
|  }o |  o{ | Zero or more (no upper limit)  |
|  }\| | \|{ | One or more (no upper limit)  |
