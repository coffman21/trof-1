# КАК ЭТО ЗАПУСТИТЬ
Вроде бы:
- Если еще нет [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html), то поставить. Для пущего удобства можно добавить в path variable:
  ```
  $ export JAVA_HOME=jdk-install-dir
  $ export PATH=$JAVA_HOME/bin:$PATH
  ```
  - Если нет maven, то установить:
  ```
  $ sudo apt-get install mvn 
  ```  
  Если все равно нет, но есть IDE со встроенной поддержкой, то можно пользоваться им;

- Если нет git'а, то установить:
  ```
  $ sudo apt-get install git
  ```
  Или - см. предыдущий пункт;
- Клонировать репозиторий:
  ```
  $ git clone https://github.com/coffman21/trof-1.git --branch repo --single-branch trof-1
  $ cd trof-1
  $ make
  ```
  Или, если лень делать предыдущие два пункта - [скачать](https://github.com/coffman21/trof-1/archive/master.zip).
- Запустить сборку maven из папки с репозиторием:
  ```
  $ mvn deploy
  ```
- Убедиться, что работает (или не работает).
