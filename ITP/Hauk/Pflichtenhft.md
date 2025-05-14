---
marp: true
theme: gaia
_class: lead
paginate: true
backgroundColor: #ddc
style: |
  section {
    font-size: 1.5em;
    background: linear-gradient(to bottom, #ffffff, #f5f5f5);
    padding: 2em;
    color: #333333;
  }
  h1 {
    font-size: 90px;
    color: #1a73e8;
    border-bottom: 5px solid #1a73e8;
    padding-bottom: 0.2em;
    text-align: center;
  }
  h2 {
    color: #174ea6;
    font-size: 50px;
  }
  table {
    margin: 1em 0;
    width: 100%;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #dadce0;
    padding: 0.5em;
    background: #ffffff;
    font-size: 30px;
  }
  th {
    background: #1a73e8;
    color: white;
  }
  ul li {
    margin: 0.5em 0;
    list-style-type: none;
    padding-left: 1.5em;
    position: relative;
    font-size: 30px;
  }
  ul li::before {
    content: "•";
    color: #1a73e8;
    font-weight: bold;
    position: absolute;
    left: 0;
    font-size: 30px;
  }
  p {
    
    font-size: 30px;
    line-height: 1.5;
  }

---

# Pflichtenheft & Lastenheft
## Grundlagen der Anforderungsdokumentation
von Jan und Paul

---

# Einführung
- Dokumentation als Schlüssel zum Projekterfolg
- Rechtliche Bedeutung der Dokumente
- Vermeidung von Missverständnissen
- Basis für Projektplanung und Kostenkalkulationen

---

# Lastenheft
- Wird vom **Auftraggeber** erstellt
- Beschreibt **WAS** das System können soll
- Enthält die Gesamtheit der Anforderungen
- Basis für Ausschreibungen und Angebote

Das Lastenheft dient als Grundlage für die Projektplanung und definiert die Erwartungen des Kunden.

---

# Lastenheft - Definition
- **Zentrale Rolle**: Basis für Projektentscheidungen
- **Verantwortlichkeit**: Auftraggeber/Kunde
- **Zeitpunkt**: Zu Beginn des Projekts
- **Zweck**: Ausschreibung und Angebotserstellung

---

# Inhalt des Lastenhefts
- **Ausgangssituation**: Beschreibung der aktuellen Lage und Probleme
- **Projektziele**: Definition der gewünschten Verbesserungen
- **Produkteinsatz**: Beschreibung des Einsatzbereichs
- **Funktionale Anforderungen**: Konkrete Systemfunktionen
- **Nicht-funktionale Anforderungen**: Qualitätsmerkmale
- **Rahmenbedingungen**: Zeitliche und rechtliche Vorgaben

---

# Pflichtenheft
- Wird vom **Auftragnehmer** erstellt
- Beschreibt **WIE** die Anforderungen umgesetzt werden
- Detaillierte technische Lösung
- Basis für die Entwicklung

Das Pflichtenheft konkretisiert die Anforderungen und legt die technische Umsetzung fest.

---

# Inhalt des Pflichtenhefts
- **Zielbestimmungen**: Detaillierte Projektziele
- **Produkteinsatz**: Spezifische Einsatzszenarien
- **Produktübersicht**: Systemarchitektur
- **Funktionale Anforderungen**: Technische Spezifikation
- **Technische Umsetzung**: Konkrete Implementierung
- **Qualitätsanforderungen**: Messbare Kriterien
- **Zeitplan**: Konkrete Meilensteine

---

# Unterschiede

| Lastenheft | Pflichtenheft |
|------------|---------------|
| Kunde/Auftraggeber | Auftragnehmer |
| Was wird benötigt? | Wie wird es umgesetzt? |
| Grobe Anforderungen | Detaillierte Lösung |
| Basis für Angebote | Basis für Entwicklung |

---

# Praktisches Beispiel: E-Commerce
## Ausgangssituation
- Lokales Geschäft möchte online expandieren
- Bestehende Excel-Verwaltung
- Keine IT-Infrastruktur
- 5000 Produkte im Sortiment

---

# Praxisbeispiel: Lastenheft
- **Ziel**: Online-Shop mit Lagerverwaltung
- **Nutzer**: 500 gleichzeitige Besucher
- **Funktionen**: Produktsuche, Warenkorb, Bezahlung
- **Performance**: Ladezeit unter 2 Sekunden
- **Budget**: 50.000€
- **Zeitrahmen**: 6 Monate

---

# Praxisbeispiel: Pflichtenheft
- **Technologie**: MERN-Stack
- **Hosting**: AWS Cloud-Infrastruktur
- **Datenbank**: MongoDB mit Replikation
- **Security**: SSL, 2FA, DSGVO-konform
- **Integration**: SAP, Payment-Provider
- **Monitoring**: ELK-Stack

---

# Best Practices
- Klare, eindeutige Formulierungen
- Messbare Kriterien
- Priorisierung der Anforderungen
- Regelmäßige Aktualisierung
- Versionierung der Dokumente

---

# Erfolgsfaktoren
- **Klare Kommunikation** zwischen allen Beteiligten
- **Regelmäßige Reviews** der Dokumente
- **Änderungsmanagement** für neue Anforderungen
- **Nachvollziehbarkeit** aller Entscheidungen
- **Qualitätssicherung** durch Standards

---

# Tipps zur Erstellung
- Verwendung von Vorlagen und Checklisten
- Eindeutige Nummerierung der Anforderungen
- Vermeidung von Redundanzen
- Regelmäßige Abstimmung mit Stakeholdern
- Dokumentation von Entscheidungen

---

# Häufige Fehler
- Unklare Anforderungen
- Fehlende Priorisierung
- Unrealistische Zeitpläne
- Mangelnde Abstimmung
- Unvollständige Dokumentation

---

# Qualitätskriterien
- **Vollständigkeit**: Alle Anforderungen erfasst
- **Konsistenz**: Keine Widersprüche
- **Präzision**: Eindeutige Formulierungen
- **Prüfbarkeit**: Messbare Kriterien
- **Aktualität**: Regelmäßige Updates
