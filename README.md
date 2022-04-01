# AppelProjet

# ABOUT PROJECT
#### [ GestionAppel ] Développement d'un site web en Java : Application de gestion de l'appel en ligne (Inscription, Connexion, ) <br><span style="font-size:15px">*( 2021.03.21 ~ 2021.04.01 )*</span>

## 1. Membres de l'équipe

|*Members*|*Contact*|
|:---:|---|
|**Yuni CHEN**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/StevenZZJ) [![Gmail Badge](https://img.shields.io/badge/-steven.zhouzijing@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:steven.zhouzijing@gmail.com)](mailto:steven.zhouzijing@gmail.com)|
|**Jiayin LI**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](http://github.com/catwithhumanface) [![Gmail Badge](https://img.shields.io/badge/-annjh11@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:annjh11@gmail.com)](mailto:annjh11@gmail.com)|
|**Mengying Meng**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/Gabrielle07) [![Gmail Badge](https://img.shields.io/badge/-tongliu024@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:tongliu024@gmail.com)](mailto:tongliu024@gmail.com)|
|**CLAUDEL FRANK**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/faresmegari) [![Gmail Badge](https://img.shields.io/badge/-faares.mega@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:faares.mega@gmail.com)](mailto:faares.mega@gmail.com)|
|**Shuanghong LI**|[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white)](https://github.com/Li-Shuanghong) [![Gmail Badge](https://img.shields.io/badge/-lishuanghong3849@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:lishuanghong3849@gmail.com)](mailto:lishuanghong3849@gmail.com)|
## 2. Installation du projet
1. Copier URL Github 
2. Import Projet
3. Connexion DB to MySQL
(Notre projet utilise une base de données déploiée sur SKYSQL donc pas de configuration en plus) 
4. Adapdation de chemin d'accès 
      1. Copier le chemin d'accès absolue de dossier "GestionAppel\src\main\webapp\resources\fileJustificatif" (dans IntelliJ, cliquer droit de dossier "fileJustificatif" -> Copy path/reference -> absolute path)
      3. Remplacer le constant "UPLOAD_DIRECTORY" de model/JustificatifConstant.java en ajoutant "\\" à la fin
      4. Copier le chemin d'accès absolue de dossier "GestionAppel\src\main\webapp\resources\photoProfil"
      5. Remplacer le constant "UPLOAD_DIRECTORY_PHOTO" de model/JustificatifConstant.java en ajoutant "\\" à la fin
      6. Copier le chemin d'accès absolue de dossier "GestionAppel\src\main\webapp\resources\outPutFiles"
      7. Remplacer le constant "PDF_DIRECTORY" de model/JustificatifConstant.java en ajoutant "\\" à la fin
7. Configuration de Tomcat
