
# AppelProjet

# ABOUT PROJECT
#### [ GestionAppel ] Développement d'un site web en Java : Application de gestion de l'appel en ligne (Inscription, Connexion, ) <br><span style="font-size:15px">*( 2022.03.21 ~ 2022.04.01 )*</span>

## 1. Membres de l'équipe

|*Members*|*Contact*|
|:---:|---|
|**Yuni CHEN**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/YuniiCh) [![Gmail Badge](https://img.shields.io/badge/-yunic4639@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:yunic4639@gmail.com)](mailto:yunic4639@gmail.com)|
|**Jiayin LI**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](http://github.com/ljy9988) [![Gmail Badge](https://img.shields.io/badge/-jiayin.li9988@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:jiayin.li9988@gmail.com)](mailto:jiayin.li9988@gmail.com)|
|**Mengying ZHAO**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/PikaMeoow) [![Gmail Badge](https://img.shields.io/badge/-zhaomengying.fr@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:zhaomengying.fr@gmail.com)](mailto:zhaomengying.fr@gmail.com)|
|**CLAUDEL FRANK**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/shevalpha) [![Gmail Badge](https://img.shields.io/badge/-fonkwa_claudel@yahoo.fr-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:fonkwa_claudel@yahoo.fr)](mailto:fonkwa_claudel@yahoo.fr)|
|**Shuanghong LI**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/Li-Shuanghong) [![Gmail Badge](https://img.shields.io/badge/-lishuanghong3849@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:lishuanghong3849@gmail.com)](mailto:lishuanghong3849@gmail.com)|
## 2. Installation du projet
1. Préparer l’Intellij environnement
2. Copier l’url Github et import Projet
3. Configurer le tomcat en cliquant Add Configuration
4. Adapdation de chemin d'accès
    1. Rajouter le tomcat dans Application server
    3. Choix de la version Tomcat
    4. Choisir le projet correspodant dans le Déployement
5. Préparer un BD 'dai' local
    1. Modifier le fichier hibernate.cfg.xml en utilisant le nom et le mot de pass propre
    2. Run le file GenererBD.java seulement pour remplir les données dans le BD dai
7. Lancer tomcat

## 4. Structure (MVC pattern)
![MVC](captures/structureMVC.png)

## 5. Technologie
![TECH](captures/technologies.png)
### 5.1 APIs

**Technologie**

- Intellij : environnement de développement

- Tomcat : Serveur Web

- Hibernate : pour créer le BD, insérer les données, manipuler les tables

- mysql-connector-java-8.0.28 : pour connecter le BD MySQL

- Github : pour gérer les versions et facilité le travail en équipe

- Ajax : pour réaliser les pages dynamiques

- jstl : pour utiliser les balises de Ajax

**Libraire**

- Pour se connecter à la base de données:
  -mysql
  -mysql-connector-java-8.0.27

- Pour utiliser les balises de Ajax:
  -jstl-1.2
  -org.mybatis-3.0.1

- Pour utiliser la langage jstl:
  -jstl-1.2
  -org.mybatis-3.0.1
  -standard

- Pour upload et download les fiches:
  -commons-io-2.2
  -commons-fileupload-1.4
  -com.sun.mail-javax.mail-1.6.1

Remarque: Les libraires qui ont utilisé sont tous décrit dans les dépendances du projet sous file pom.xml

## 6. Diagramme de classe (uml)
![UML](captures/UML.png)
