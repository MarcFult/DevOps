# CI/CD-Pipeline – Kurzbeschreibung

Die Pipeline baut, testet und veröffentlicht das Projekt automatisch.  
Sie läuft bei jedem Push oder Pull Request auf den Branch **main**.

## Ablauf
1. **Code holen:** Repository wird geladen.  
2. **Build & Test:** Gradle baut das Projekt, führt Tests aus und erstellt Berichte.  
3. **Analyse:** SonarQube prüft Codequalität.  
4. **Integrationstest:** Anwendung wird in Docker gestartet und geprüft.  
5. **Dokumentation:** MkDocs baut die HTML-Doku, Pandoc erzeugt eine PDF.  
6. **Container-Build:** Nginx-Container enthält HTML und PDF.  
7. **Deployment:** App und Docs werden neu gestartet.  
8. **Upload:** Docker-Images werden in Registrys gespeichert.

## Ergebnis
- Anwendung: `http://10.0.40.183:8080`  
- Dokumentation: `http://10.0.40.183:8081`  
- PDF-Dokumentation: `http://10.0.40.183:8081/doc.pdf`  


         _nnnn_
        dGGGGMMb
       @p~qp~~qMb
       M|@||@) M|
       @,----.JM|
      JS^\__/  qKL
     dZP        qKRb
    dZP          qKKb
   fZP            SMMb
   HZM            MMMM
   FqM            MMMM
 __| ".        |\dS"qML
 |    `.       | `' \Zq
_)      \.___.,|     .'
\____   )MMMMMP|   .'
     `-'       `--' hjm

