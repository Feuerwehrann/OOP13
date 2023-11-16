# Fifo in Pseudocode


```` Python
    Klasse Element 
    current: Text
    next: Element 
    next <- null

     Element (Text s)
        current <- s
    ENDE Element
ENDE  Klasse Element
````

``` Python
 Klasse FiFo 
    first: Element
    first <- null

    OPERATION Text pop() der Klasse FiFo
        FALLS first = null 
            rückgabe <- null
        ENDE FALLS
        ret: Text 
        ret <- first.current
        this.first <- this.first.next
        rückgabe <- ret
    ENDE Operation pop

    OPERATION push(String s) der Klasse FiFO
        FALLS (first = null) 
            first = new Element(s);
        ENDE FALLS
        SONST
            iterator: Element
            iterator <- first 
            WÄHREND (iterator.next IST UNGLEICH null) 
                iterator <- iterator.next;
            ENDE WÄHREND
            iterator.next <- new Element(s);
        ENDE SONST
    ENDE OPERATION
ENDE öffentliche Klasse FiFo

```

``` Python 
Klasse Main 

    OPERATION main(args<- NEU Liste <Text>()) der Klasse Main
        meineFiFo: FiFo
        FiFo meineFiFo = new FiFo();
        meineFiFo.push("hello");
        meineFiFo.push("world");
        meineFiFo.push("!");
        WÄHREND(int i = 0 UND i <3 ADDIERE 1 zu i)
            Ausgabe meineFiFo.pop()
        ENDE WÄHREND
        
    ENDE Methode main
 
    
    
ENDE Klasse main


```



