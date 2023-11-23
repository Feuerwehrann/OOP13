# Sets
## Was sind Sets?
Sets sind eine Datenstruktur in Java. Sie helfen dabei, keine doppelten Daten einzutragen oder auszugeben.
Meistens wird ein sogenanntes Hash-Set verwendet. Dies verhindert das doppelte Eintragen von Daten und sortiert Zahlen direkt nach ihrer Größe.

## Wichtige Methoden
### add(element)
Ein bestimmtes Element kann in das Set hinzugefügt werden, falls es noch nicht im Set gespeichert ist.
```java
    Set<Integer> Set1 = new HashSet<Integer>();
    Set1.add(1);
    Set1.add(3);
    Set1.add(2);
    Set1.add(9);
    Set1.add(1);
    Set1.add(5);
    System.out.println(Set1);
```
#### Ausgabe auf der Konsole:
```markdown
[1, 2, 3, 5, 9]
```
### clear()
Alle Elemente werden entfertnt, das Set aber nicht gelöscht.
```java
    Set<Integer> Set2 = new HashSet<Integer>();
    Set2.add(1);
    Set2.add(3);
    Set2.add(2);
    Set2.add(9);
    Set2.add(1);
    Set2.add(5);
    System.out.println(Set2);
    Set2.clear();
    System.out.println(Set2);
```
#### Ausgabe auf der Konsole:
```markdown
[1, 2, 3, 5, 9]
[]
```

### Contains(element)
Mit dieser Methode kann man herausfinden, ob ein bestimmtes Element in dem Set vorhanden ist. Es wird ein Boolean zurückgegeben.
```java
    Set<Integer> Set3 = new HashSet<Integer>();
    Set3.add(1);
    Set3.add(3);
    Set3.add(2);
    Set3.add(9);
    Set3.add(1);
    Set3.add(5);
    System.out.println(Set3);
    System.out.println(Set3.contains(8));
    System.out.println(Set3.contains(9));
```
#### Ausgabe auf der Konsole: 
```java
false
true
```

### Array als Set hinzufügen
Man kan auch direkt einen ganzen Array zu einem Set hinzufügen. Dadurch spart man sich Zeit beim tippen.
```java
    Set<Integer> a = new HashSet<Integer>();
    a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

    Set<Integer> b = new HashSet<Integer>();
    b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

```
### Zwei Sets zu einem zusammenfügen
Um aus zwei Sets eines zu machen, kann man mit der Methode `addAll()` das eine Set zum anderen dazufügen. Dabei werden keine doppelten Werte gespeichert. 
```java
         Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union); 
        
```
#### Ausgabe auf der Konsole: 
```markdown
Union of the two Set[0, 1, 2, 3, 4, 5, 7, 8, 9]
```

### Schnittmenge
Um die Schnittmenge von zwei Sets zu bestimmen, kann man die `retainAll()` Methode nutzen. Dadurch erhält man alle Zahlen, welche in beiden Sets vorhanden sind. 
```java
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
```
#### Ausgabe auf der Konsole:
```markdown
Intersection of the two Set[0, 1, 3, 4]
```
### Differenz der Sets
Um die Zaheln zu bekommen, die nicht in beiden Sets sind, kann man die `removeAll()` Methode nutzen.
```java
    Set<Integer> difference = new HashSet<Integer>(a);
    difference.removeAll(b);
    System.out.print("Difference of the two Set");
    System.out.println(difference);
```
#### Ausgabe auf der Konsole
```markdown
Difference of the two Set[2, 8, 9]
```
### size()
Man kann die Größe eines Sets ausgeben.
```java
System.out.println("Size of set 1: "+Set1.size());
```
#### Ausgabe auf der Konsole
```markdown
Size of set 1: 5
```

