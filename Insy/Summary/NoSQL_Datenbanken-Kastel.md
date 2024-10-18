## NoSQL Datenbanken

**Was ist eine NoSQL Datenbank?**

Der Begriff “NoSQL” steht für “Not only SQL” und bezeichnet Datenbanksysteme, die einen Ansatz ohne feste Tabellenstrukturen verfolgen. Im Gegensatz zu herkömmlichen SQL-Datenbanken, die auf festen Tabellenmodellen und Joins basieren, bieten NoSQL-Datenbanken flexible Datenmodelle und Skalierbarkeit.

**Was bringt das?**

NoSQL-Datenbanken speichern Daten in verschiedenen Formaten, wie z.B. Schlüssel-Wert-Paaren, Dokumenten, Graphen oder Spalten, anstatt in festen Tabellenstrukturen. Dies ermöglicht eine bessere Leistung bei großen Datenmengen und erlaubt die Nutzung von verteilten und horizontal skalierbaren Architekturen.



### Arten von NoSQL Datenbanken

**Key/Value-Datenbanksysteme:**

- **Einführung:** Einfachste Form der NoSQL-DB, im Einsatz seit den 70er Jahren (z.B. Berkeley DB).

- **Schema:** Einfaches Schema mit Key-Value-Paaren. Zugriff nur über den Schlüssel.

- **Speicherung:** Daten können im RAM oder auf externen Medien gespeichert werden.

- **Einsatz:** Schnelle Reaktionen bei großen Datenmengen ohne Beziehungen. Ideal für mobile Anwendungen.

- **Beispiele:** Redis

**Dokumentenorientierte Datenbanksysteme:**

- **Einführung:** Speichern zusammengehörige Informationsmengen in Dokumenten statt in Tabellen.

- **Schema:** Daten in Feldname-Wert-Paaren; Felder müssen nicht in jedem Dokument vorhanden sein.

- **Speicherung:** Keine Normierung, keine Beziehungen zwischen Dokumenten. Eindeutige Schlüssel für jedes Dokument.

- **Einsatz:** Schnell bei umfangreichen Abfragen. Geeignet für CMS (z.B. Typo3, Joomla), Blogging-Plattformen.

- **Beispiele:** MongoDB

**Spaltenorientierte Datenbanksysteme:**

- **Einführung:** Daten werden in Spalten statt in Zeilen gespeichert, was schnelle Leseprozesse ermöglicht.

- **Schema:** Ähnlich wie Key-Value-Systeme, aber mit zweidimensionalen Tabellen.

- **Speicherung:** Effizient bei hohen Lesezugriffen auf einzelne Informationen.

- **Einsatz:** Hohe Lesezugriffe auf einzelne Informationen.

- **Beispiele:** Cassandra

**Graphendatenbanken:**

- **Einführung:** Ideal für Anwendungen mit vielen Querverbindungen zwischen Daten (z.B. soziale Netzwerke).

- **Schema:** Daten als Knoten, Beziehungen als Verbindungen zwischen Knoten.

- **Speicherung:** Effizientes Durchlaufen von Netzwerken (Traversierung).

- **Einsatz:** Verwaltung vernetzter Daten (soz. Netzwerke, räumliche Daten, Routeninformationen, Vorschlagsysteme).

- **Beispiele:** Neo4j

### Zusammenfassung der NoSQL-Datenbanken

NoSQL-Datenbanken bieten flexible Datenmodelle und skalieren besser als 
herkömmliche SQL-Datenbanken, da sie Daten in verschiedenen 
Formaten speichern und keine festen Tabellenstrukturen verwenden.

| Art                       | Eigenschaften                                             | Vertreter |
| ------------------------- | --------------------------------------------------------- | --------- |
| Key/Value-DBS             | Einfache Schema, schnelle Reaktion ohne Beziehungen       | Redis     |
| Dokumentenorientierte DBS | Daten in Feldname-Wert-Paaren, schnelle Abfragen          | MongoDB   |
| Spaltenorientierte DBS    | Speicherung in Spalten, schnelle Leseprozesse             | Cassandra |
| Graphen-DB                | Verwaltung vernetzter Daten, effizientes Netz-Durchlaufen | Neo4j     |


