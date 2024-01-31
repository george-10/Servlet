1-on commence par install apache tomcat.
2-nous écrivons le code html dans le fichier servlet.java tout en s'assurant que le "servlet-api.jar" est présent
3-on compile le fichier avec la commande suivante :java -cp ..\lib\servlet-api.jar .\servlet.java
4-on arrange un répertoire avec un fichier .xml qui contient les configurations requises
5-on crée un fichier .war pour le déploiement avec la commande suivante: jar -cvf bonjour.war -C bonjour/ .
6-on utilise le web manager pour déployer le fichier .war
