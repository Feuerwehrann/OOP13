# Maps
## Was sind maps?
Maps sind eine Datenstruktur, in welcher man Daten gemeinsam mit einem selbst gewählten "Key" speichert. Dieser Key kann eine Zahl oder auch ein Text sein. Dadurch kann man zum Beispiel ein Wörterbuch implementieren. Man kann zum Beispiel das deutsche Wort als key nutzen und das englische als value. Dann kann man nach dem deutschen Wort suchen und bekommt ddirekt das englische. 
 
## Wichtige Methoden
### Implementierung
#### Option 1
```java
 Map<Integer, String> hm = new HashMap<Integer, String>();
```
#### Option 2
```java
 Map map = Map.of(1, "Red", 2, "Green", 3, "Three", 4, "White");
```
### put()
Mit der put Methode kann man Daten in die map reinspeichern.
```java
hm.put(1, "Red");
hm.put(2, "Green");
hm.put(3, "Blue");
hm.put(4, "White");
System.out.println(hm);
```
#### Ausgabe auf der Konsole:
```smalltalk
{1=Red, 2=Green, 3=Blue, 4=White}
```
### clear()
Mit der clear-Methode kann man die ganze map löschen.
```java
hm.clear();
System.out.println(hm);
```
#### Ausgabe auf der Konsole:
```smalltalk
{}
```
### putAll()
Mit dieser Methode kann man eine map in einer anderen speichern.
```java
Map map = Map.of(1, "Red", 2, "Green", 3, "Three", 4, "White");
System.out.println(map);

hm.putAll(map);
System.out.println(hm);
```
#### Ausgabe auf der Konsole:
```smalltalk
{4=White, 3=Three, 2=Green, 1=Red}
{1=Red, 2=Green, 3=Three, 4=White}
```