This is the docs homepage.

Überblick

Diese GitHub Actions Pipeline führt automatisch den gesamten Prozess von Build, Test, Deployment und Dokumentation aus.
Sie läuft auf einem selbst gehosteten Runner und baut sowohl die Java-Anwendung als auch die Projektdokumentation mit MkDocs.

Code holen: Repository wird geladen.
Build & Test: Gradle baut das Projekt, führt Tests aus und erstellt Berichte.
Analyse: SonarQube prüft Codequalität.
Integrationstest: Anwendung wird in Docker gestartet und geprüft.
Dokumentation: MkDocs baut die HTML-Doku, Pandoc erzeugt eine PDF.
Container-Build: Nginx-Container enthält HTML und PDF.
Deployment: App und Docs werden neu gestartet.
Upload: Docker-Images werden in Registrys gespeichert.

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

     
